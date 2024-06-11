package ejercicios.ventanaFutbol.controler;

import ejercicios.ventanaFutbol.database.DBconnection;
import ejercicios.ventanaFutbol.database.EsquemaFutbol;
import ejercicios.ventanaFutbol.excepciones.DatosIncorrectosException;
import ejercicios.ventanaFutbol.excepciones.UsuarioNoEncontradoException;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosCrudRepository {
    Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;
    DBControler dbControler;



    public int comprobarUsuario(String nombre, String contrasenia)  throws UsuarioNoEncontradoException, DatosIncorrectosException  {
        return comprobarUsuario(nombre, contrasenia, null);
    }

    public int comprobarUsuario(String nombre, String contrasenia, String correo) throws UsuarioNoEncontradoException, DatosIncorrectosException {
        connection = DBconnection.getConnection();

        String query = String.format("SELECT * FROM %s WHERE %s = ?",
                EsquemaFutbol.TB_USUARIOS, EsquemaFutbol.COL_NOMBRE);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, nombre);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                if (resultSet.getString(EsquemaFutbol.COL_CONTRASENIA).equals(contrasenia)
                        && (correo == null || resultSet.getString(EsquemaFutbol.COL_CORREO).equals(correo))) {
                    System.out.println("Credenciales correctas");
                    return resultSet.getInt(EsquemaFutbol.COL_ID);
                } else {
                    throw new DatosIncorrectosException();
                }
            }

            throw new UsuarioNoEncontradoException();

        } catch (SQLException e) {
            System.out.println("Error en query");
            e.printStackTrace();
        }

        return -1;
    }


    public int sacarIdUsuario(String nombre){
        connection = DBconnection.getConnection();

        String query = String.format("Select * from %s where %s = ? Limit 1",
                EsquemaFutbol.TB_USUARIOS, EsquemaFutbol.COL_NOMBRE);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, nombre);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                    return resultSet.getInt(EsquemaFutbol.COL_ID);
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        }

        return -1;
    }

    public Usuario sacarUsuario(int id){
        connection = DBconnection.getConnection();

        String query = String.format("Select * from %s where %s = ? Limit 1",
                EsquemaFutbol.TB_USUARIOS, EsquemaFutbol.COL_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                return new Usuario(
                        resultSet.getInt(EsquemaFutbol.COL_ID),
                        resultSet.getInt(EsquemaFutbol.COL_FK_IDEQUIPO),
                        resultSet.getString(EsquemaFutbol.COL_NOMBRE),
                        resultSet.getString(EsquemaFutbol.COL_CONTRASENIA),
                        resultSet.getString(EsquemaFutbol.COL_CORREO)
                        );
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        }

        return null;
    }

    public boolean retarUsuario(int idUsuario1, int idUsuario2){
        dbControler = new DBControler();


            Equipo equipo1 = dbControler.sacarEquipo(dbControler.sacarIdEquipo(idUsuario1));
            Equipo equipo2 = dbControler.sacarEquipo(dbControler.sacarIdEquipo(idUsuario2));



        if (equipo1.getValoracionMedia() > equipo2.getValoracionMedia()){
            System.out.println(equipo1.getValoracionMedia());
            System.out.println(equipo2.getValoracionMedia());
            return true;
        } else {
            System.out.println(equipo1.getValoracionMedia());
            System.out.println(equipo2.getValoracionMedia());
            return false;
        }
    }

    public void asignarEquipo(int idEquipo, int idUsuario){
        connection = DBconnection.getConnection();

        String query = String.format("UPDATE %s SET %s = ? where %s = ?",
                EsquemaFutbol.TB_USUARIOS,
                EsquemaFutbol.COL_FK_IDEQUIPO, EsquemaFutbol.COL_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idEquipo);
            ps.setInt(2, idUsuario);
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Error en query");
        }
    }

    public void aniadirUsuario(String nombre, String correo, String contrasenia){
        connection = DBconnection.getConnection();

        String query = String.format("Insert into %s(%s, %s, %s) values (?,?,?)",
                EsquemaFutbol.TB_USUARIOS,
                EsquemaFutbol.COL_NOMBRE, EsquemaFutbol.COL_CORREO, EsquemaFutbol.COL_CONTRASENIA);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasenia);
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Error en query");
        }


    }






}
