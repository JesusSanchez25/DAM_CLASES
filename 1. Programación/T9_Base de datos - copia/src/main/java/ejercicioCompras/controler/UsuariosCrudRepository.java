package ejercicioCompras.controler;

import ejercicioCompras.database.DBconnection;
import ejercicioCompras.database.EsquemaCompras;
import ejercicioCompras.model.Usuario;
import org.apache.commons.crypto.cipher.CryptoCipher;
import org.apache.commons.crypto.cipher.CryptoCipherFactory;
import org.apache.commons.crypto.utils.Utils;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.GeneralSecurityException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;

public class UsuariosCrudRepository {

    Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;

    public Usuario sacarUsuario(String email){
        connection = DBconnection.getConnection();

        String query = String.format("Select * from %s where %s = ?",
                EsquemaCompras.TAB_CLIENTES, EsquemaCompras.COL_EMAIL);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                 Usuario usuario = new Usuario(
                        resultSet.getString(EsquemaCompras.COL_NOMBRE),
                         resultSet.getString(EsquemaCompras.COL_PASSWORD),
                        resultSet.getString(EsquemaCompras.COL_EMAIL)
                        );

               return usuario;
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        }

        return null;
    }

    public int sacarId(String email){
        connection = DBconnection.getConnection();

        String query = String.format("Select * from %s where %s = ?",
                EsquemaCompras.TAB_CLIENTES, EsquemaCompras.COL_EMAIL);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                return resultSet.getInt(EsquemaCompras.COL_ID);
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        } finally {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                System.out.println("error al cerrado");
            }
        }

        return -1;
    }

    public boolean comprobarContrasenia(String contrasenia, String email){
        System.out.println(sacarUsuario(email).getContrasenia());
        System.out.println(sacarUsuario(email).getCorreo());
        if (sacarUsuario(email).getContrasenia().equals(contrasenia)){
            return true;
        } else {
            return false;
        }

    }

    public String cifrarContrasenia(String contrasenia){
        try {
            // Definir la clave secreta
            String clave = "miClaveSecreta12";

            // Crear una instancia de la clase Cipher
            Cipher cipher = Cipher.getInstance("AES");

            // Convertir la clave a una instancia de SecretKeySpec
            SecretKeySpec secretKey = new SecretKeySpec(clave.getBytes(), "AES");

            // Inicializar Cipher en modo de cifrado
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            // Texto a cifrar
            String textoOriginal = contrasenia;

            // Cifrar el texto
            byte[] textoCifrado = cipher.doFinal(textoOriginal.getBytes());

            // Convertir el texto cifrado a una representación en Base64
            return Base64.getEncoder().encodeToString(textoCifrado);

        } catch (Exception e) {
            e.getCause();
        }
        return "";
    }

    public int iniciarSesion(){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Inserte tu correo");
            String email = bufferedReader.readLine();

            System.out.println("Inserte tu contraseña");
            String contrasenia = bufferedReader.readLine();
            String contraseniaCifrada = cifrarContrasenia(contrasenia);


            Usuario usuario = sacarUsuario(email);

            if (comprobarContrasenia(contraseniaCifrada, email)){
                System.out.println("Entrando en la cuenta");
                return sacarId(usuario.getCorreo());

            } else if (usuario != null){
                System.out.println("Usuario encontrado, contraseña incorrecta");
                System.out.println("Inténtelo de nuevo");
            } else {
                System.out.println("No se ha encontrado usuario");
                System.out.println("Deberás registrarte para crear una cuenta");
            }




        } catch (IOException e) {
            System.out.println("IO exception");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            DBconnection.closeConnection();
            connection = null;
        }

        return -1;
    }

    public int registrarUsuario(){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Inserte tu nombre");
            String nombre = bufferedReader.readLine();

            System.out.println("Inserte tu correo");
            String email = bufferedReader.readLine();

            System.out.println("Inserte tu contraseña");
            String contrasenia = bufferedReader.readLine();
            String contraseniaCifrada = cifrarContrasenia(contrasenia);



            Usuario usuario = new Usuario(nombre, contraseniaCifrada, email);


            if ((sacarUsuario(email)) == null){
                System.out.println("Registrando usuario");
                System.out.println("Iniciando sesión");
                agregarUsuario(usuario);
                return sacarId(usuario.getCorreo());

            } else if (comprobarContrasenia(contraseniaCifrada, email)){
                System.out.println("Entrando en la cuenta");
                return sacarId(usuario.getCorreo());

            } else {
                System.out.println("Usuario encontrado, contraseña incorrecta");
                System.out.println("Inténtelo de nuevo");
            }




        } catch (IOException e) {
            System.out.println("IO exception");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            DBconnection.closeConnection();
            connection = null;
        }

        return -1;
    }

    public void agregarUsuario(Usuario usuario){
        connection = DBconnection.getConnection();

        String query = String.format("Insert into %s (%s, %s, %s) values (?,?,?)",
                EsquemaCompras.TAB_CLIENTES,
                EsquemaCompras.COL_NOMBRE, EsquemaCompras.COL_EMAIL, EsquemaCompras.COL_PASSWORD);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getCorreo());

            ps.setString(3, usuario.getContrasenia());

            ps.execute();
        } catch (SQLException e) {
            System.out.println("Query error");
        }
    }



}
