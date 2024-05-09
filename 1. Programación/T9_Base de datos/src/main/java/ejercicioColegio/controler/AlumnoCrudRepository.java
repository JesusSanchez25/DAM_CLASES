package ejercicioColegio.controler;

import ejercicioColegio.database.DBconnection;
import ejercicioColegio.database.Esquema;
import ejercicioColegio.model.Alumno;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoCrudRepository {

    // C -> create -> INSERT
    // R -> read -> SELECT
    // C -> update -> UPDATE
    // C -> delete -> DELETE

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void darAltaAlumno(Alumno alumno){
        // Abrir la conexión
        connection = DBconnection.getConnection();

        // Trabajo

        try {
            statement = connection.createStatement();

            // QUERY DE SQL
            String query = String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES ('%s', '%s', '%s', %d)" ,
                    Esquema.TAB_ALUMNOS,
                    Esquema.COL_NOMBRE,Esquema.COL_APELLIDO, Esquema.COL_CORREO, Esquema.COL_TELEFONO,
                    alumno.getNombre(),alumno.getApellido(),alumno.getCorreo(),alumno.getTelefono());
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
    public void borrarAlumno(Alumno alumno){
        connection = DBconnection.getConnection();

        // Trabajo

        try {
            statement = connection.createStatement();

            // QUERY DE SQL
            String query = String.format("DELETE FROM %s WHERE (%s = '%s')" ,
                    Esquema.TAB_ALUMNOS,
                    Esquema.COL_NOMBRE,
                    alumno.getNombre());
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

    // UPDATE

    public void cambiarNombreAlumno(Alumno alumnoCambiante, Alumno alumnoCambiado){
        connection = DBconnection.getConnection();

        // Trabajo

        try {
            statement = connection.createStatement();

            // QUERY DE SQL
            String query = String.format("UPDATE %s set %s = '%s' WHERE (%s = '%s')" ,
                    Esquema.TAB_ALUMNOS,
                    Esquema.COL_NOMBRE, alumnoCambiante.getNombre(),
                    Esquema.COL_NOMBRE, alumnoCambiado.getNombre());
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

    public ArrayList<Alumno> obtenerAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String query = "SELECT * FROM " + Esquema.TAB_ALUMNOS;

        connection = DBconnection.getConnection();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()){

                alumnos.add(new Alumno(
                        resultSet.getString(Esquema.COL_NOMBRE),
                        resultSet.getString(Esquema.COL_APELLIDO),
                        resultSet.getString(Esquema.COL_CORREO),
                        resultSet.getInt(Esquema.COL_TELEFONO)
                ));
            }


        } catch (SQLException e) {
            System.out.println("Error en SQL");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

       DBconnection.closeConnection();
        connection = null;

        // IMPORTANTE, ponemos aquí el return para que siempre se cierre la conexión
        return alumnos;
    }



}
