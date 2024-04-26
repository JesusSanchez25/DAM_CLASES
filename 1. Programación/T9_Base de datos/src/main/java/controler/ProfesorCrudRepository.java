package controler;

import database.DBconnection;
import database.Esquema;
import static database.Esquema.*;

import model.Profesor;
import model.Profesor;

import java.sql.*;
import java.util.ArrayList;

public class ProfesorCrudRepository {

    // Esta conexión simplemente te permite ejecutar sql
    private Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;


    // INSERT

    public void insertarProfesor(Profesor profesor){

        // Abro conexión
        connection = DBconnection.getConnection(); // Te da la conexión Singletone

        // Trabajo conexion


        // Al hacer un PREPARE STATEMENT no se ponen las COMILLAS a los STRING
        // ya que luego al parametrizar se ponen solas
        String query = String.format("INSERT INTO %s (%s,%s,%s, %s) VALUES (?,?,?,?)",
                TAB_PROFESORES,
                COL_NOMBRE, COL_CORREO, COL_SALARIO,COL_DIRECCION);
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getCorreo());
            ps.setInt(3, profesor.getSalario());
            ps.setString(4, profesor.getDireccion());

            ps.execute();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERRPR");
        } finally {
            try {
                if (ps != null){
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en el close");
            }

        }


        // Cierro conexión
        DBconnection.closeConnection();
        connection = null;
    }

    // UPDATE

    public void cambiarNombreProfesor(Profesor profesorCambiante, Profesor profesorCambiado){
        connection = DBconnection.getConnection();

        // Trabajo
        Statement statement = null;

        try {
            statement = connection.createStatement();

            // QUERY DE SQL
            String query = String.format("UPDATE %s set %s = '%s' WHERE (%s = '%s')" ,
                    TAB_PROFESORES,
                    COL_NOMBRE, profesorCambiante.getNombre(),
                    COL_NOMBRE, profesorCambiado.getNombre());

            statement.execute(query);

        } catch (SQLException e) {
            System.out.println("Error de ejecución SQL");
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en cerrado");
            }
        }


        // Cerrar la conexión
        DBconnection.closeConnection();
        connection = null;
    }

    // DELETE

    public void borrarProfesor(Profesor profesor){
        connection = DBconnection.getConnection();

        // Trabajo
        Statement statement = null;

        try {
            statement = connection.createStatement();

            // QUERY DE SQL
            String query = String.format("DELETE FROM %s WHERE (%s = '%s')" ,
                    TAB_PROFESORES,
                    COL_NOMBRE,
                    profesor.getNombre());
            statement.execute(query);


        } catch (SQLException e) {
            System.out.println("Error de ejecución SQL");
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en cerrado");
            }
        }


        // Cerrar la conexión
        DBconnection.closeConnection();
        connection = null;
    }

    public ArrayList<Profesor> obtenerProfesores(int salario){
        ArrayList<Profesor> profesores = new ArrayList<>();
        String query = String.format("SELECT * FROM %s where %s > ?",
                TAB_PROFESORES,
                COL_SALARIO);

        connection = DBconnection.getConnection();

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, salario);

            System.out.println(ps.toString());
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                profesores.add(new Profesor(
                        resultSet.getString(COL_NOMBRE),
                        resultSet.getString(COL_CORREO),
                        resultSet.getString(COL_DIRECCION),
                        resultSet.getInt(COL_SALARIO)
                ));
            }


        } catch (SQLException e) {
            System.out.println("Error en SQL");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        DBconnection.closeConnection();
        connection = null;

        // IMPORTANTE, ponemos aquí el return para que siempre se cierre la conexión
        return profesores;
    }
}
