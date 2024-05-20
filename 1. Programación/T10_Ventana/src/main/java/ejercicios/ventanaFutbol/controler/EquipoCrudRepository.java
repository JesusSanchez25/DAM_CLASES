package ejercicios.ventanaFutbol.controler;

import ejercicios.ventanaFutbol.database.DBconnection;
import ejercicios.ventanaFutbol.database.EsquemaFutbol;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Jugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EquipoCrudRepository {
    Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;



    public void crearEquipo(String nombre){
        connection = DBconnection.getConnection();

        String query = String.format("Insert into %s (%s)values (?)",
                EsquemaFutbol.TB_EQUIPOS,
                EsquemaFutbol.COL_NOMBRE);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, nombre);
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Error en query");
        }


    }

    public int sacarId(String nombreEquipo){
        connection = DBconnection.getConnection();

        String query = String.format("SELECT * FROM %s WHERE %s = ? Limit 1",
                EsquemaFutbol.TB_EQUIPOS, EsquemaFutbol.COL_NOMBRE);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, nombreEquipo);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                return resultSet.getInt(EsquemaFutbol.COL_ID);
            }

        } catch (SQLException e) {
            System.out.println("Error en query");
            e.printStackTrace();
        } finally {
            DBconnection.closeConnection();
        }

        return -1;

    }

    public Equipo sacarEquipo(int id){
        connection = DBconnection.getConnection();

        String query = String.format("Select * from %s where %s = ? Limit 1",
                EsquemaFutbol.TB_EQUIPOS, EsquemaFutbol.COL_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                return new Equipo(
                        resultSet.getInt(EsquemaFutbol.COL_ID),
                        resultSet.getString(EsquemaFutbol.COL_NOMBRE),
                        resultSet.getInt(EsquemaFutbol.COL_PRESUPUEPSTO)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
        }

        return null;
    }


}
