package ejercicioCompras.controler;

import ejercicioCompras.database.DBconnection;
import ejercicioCompras.database.EsquemaCompras;
import ejercicioCompras.model.Producto;
import ejercicioCompras.model.Usuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;

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
                        resultSet.getString(EsquemaCompras.COL_EMAIL),
                        resultSet.getString(EsquemaCompras.COL_PASSWORD)
                        );

               return usuario;
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        }

        return null;
    }

    public void registrarUsuario(){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Inserte tu nombre");
            String nombre = bufferedReader.readLine();

            System.out.println("Inserte tu correo");
            String email = bufferedReader.readLine();

            System.out.println("Inserte tu contraseña");
            String contrasenia = bufferedReader.readLine();

            Usuario usuario;

            // TODO QUITAR SOUTS

            if ((usuario = sacarUsuario(email)) == null){
                //TODO HACER ESTO DE AQUI QUE NO HE DEJADO TERMINADO
                agregarUsuario(usuario);
            } else {
                System.out.println("Ese email ya ha sido agregado antes");
                // todo LOGiIN
            }




        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {

            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

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

            // TODO PARSEAR CONTRASEÑA
            ps.setString(3, usuario.getContrasenia());

            ps.execute();
        } catch (SQLException e) {
            System.out.println("Query error");
        }
    }



}
