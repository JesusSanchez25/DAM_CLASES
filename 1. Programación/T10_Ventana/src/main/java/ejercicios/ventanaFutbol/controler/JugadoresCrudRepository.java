package ejercicios.ventanaFutbol.controler;

import com.google.gson.Gson;
import ejercicios.ventanaFutbol.database.DBconnection;
import ejercicios.ventanaFutbol.database.EsquemaFutbol;
import ejercicios.ventanaFutbol.model.Jugador;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;

public class JugadoresCrudRepository {
    Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;
    DBControler dbControler;
    Gson gson;

    public void agregarJugador(Jugador jugador){
        connection = DBconnection.getConnection();

        String query = String.format("Insert into %s(%s, %s, %s,%s, %s) values (?,?,?,?,?)",
                EsquemaFutbol.TB_JUGADORES,
                EsquemaFutbol.COL_JG_ID, EsquemaFutbol.COL_JG_NOMBRE, EsquemaFutbol.COL_MEDIA, EsquemaFutbol.COL_PRECIO, EsquemaFutbol.COL_POSICION);

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, jugador.get_id());
            ps.setString(2, jugador.getName());
            ps.setInt(3, jugador.getMedia());
            ps.setInt(4, jugador.getPrecio());
            ps.setString(5, jugador.getPosicion());
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Error en query");
        } finally {
            connection = null;
            DBconnection.closeConnection();
        }


    }
    public void meterJugadoresIniciales(){
        dbControler = new DBControler();
        gson = new Gson();
        JSONArray jsonArray = dbControler.leerApi("https://run.mocky.io/v3/7c6eec4d-e90d-4d27-bee3-34825f6cb132?authuser=0");


        for (int i = 0; i < jsonArray.length(); i++) {
            Jugador jugador = gson.fromJson(String.valueOf(jsonArray.getJSONObject(i)), Jugador.class);
            agregarJugador(jugador);
            System.out.println(jugador.getName());
        }
    }

    public ArrayList<Jugador> sacarJugadoresEquipo(int idEquipo){
        connection = DBconnection.getConnection();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        String query = String.format("SELECT * FROM %s WHERE %s = ?",
                EsquemaFutbol.TB_JUGADORES, EsquemaFutbol.COL_FK_IDEQUIPO);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idEquipo);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                jugadores.add(new Jugador(
                        resultSet.getInt(EsquemaFutbol.COL_FK_IDEQUIPO),
                        resultSet.getString(EsquemaFutbol.COL_JG_ID),
                        resultSet.getString(EsquemaFutbol.COL_JG_NOMBRE),
                        resultSet.getString(EsquemaFutbol.COL_POSICION),
                        resultSet.getInt(EsquemaFutbol.COL_MEDIA),
                        resultSet.getInt(EsquemaFutbol.COL_PRECIO),
                        resultSet.getInt(EsquemaFutbol.COL_ESTITULAR) == 1 // Para pasarlo a booleano

                ));
            }

            return jugadores;
        } catch (SQLException e) {
            System.out.println("Error en query");
            e.printStackTrace();
        } finally {
            connection = null;
            DBconnection.closeConnection();
        }

        return null;

    }

    public ArrayList<Jugador> sacarJugadoresFichar(){
        connection = DBconnection.getConnection();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        String query = String.format("SELECT * FROM %s",
                EsquemaFutbol.VISTA_JUGADORESNOFICHADOS);

        try {
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                System.out.println();
                jugadores.add(new Jugador(
                        resultSet.getInt(EsquemaFutbol.COL_FK_IDEQUIPO),
                        resultSet.getString(EsquemaFutbol.COL_JG_ID),
                        resultSet.getString(EsquemaFutbol.COL_JG_NOMBRE),
                        resultSet.getString(EsquemaFutbol.COL_POSICION),
                        resultSet.getInt(EsquemaFutbol.COL_MEDIA),
                        resultSet.getInt(EsquemaFutbol.COL_PRECIO),
                        resultSet.getInt(EsquemaFutbol.COL_ESTITULAR) == 1 // Para pasarlo a booleano
                ));
            }

            return jugadores;
        } catch (SQLException e) {
            System.out.println("Error en query");
            e.printStackTrace();
        } finally {
            connection = null;
            DBconnection.closeConnection();
        }

        return null;

    }

    public ArrayList<Jugador> sacarJugadoresEnAlineacion(){
        connection = DBconnection.getConnection();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        String query = String.format("SELECT * FROM %s where %s = true",
                EsquemaFutbol.TB_JUGADORES, EsquemaFutbol.COL_ESTITULAR);

        try {
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                System.out.println();
                jugadores.add(new Jugador(
                        resultSet.getInt(EsquemaFutbol.COL_FK_IDEQUIPO),
                        resultSet.getString(EsquemaFutbol.COL_JG_ID),
                        resultSet.getString(EsquemaFutbol.COL_JG_NOMBRE),
                        resultSet.getString(EsquemaFutbol.COL_POSICION),
                        resultSet.getInt(EsquemaFutbol.COL_MEDIA),
                        resultSet.getInt(EsquemaFutbol.COL_PRECIO),
                        resultSet.getInt(EsquemaFutbol.COL_ESTITULAR) == 1 // Para pasarlo a booleano
                ));
            }

            return jugadores;
        } catch (SQLException e) {
            System.out.println("Error en query");
            e.printStackTrace();
        } finally {
            connection = null;
            DBconnection.closeConnection();
        }

        return null;

    }

    public void ficharJugador(Jugador jugador, int idEquipo, int presupuestoEquipo){

        EquipoCrudRepository equipoCrudRepository = new EquipoCrudRepository();
        asignarEquipo(jugador.get_id(), idEquipo);
        equipoCrudRepository.setPresupuestoEquipo(presupuestoEquipo - jugador.getPrecio(), idEquipo);

    }

    public void asignarEquipo(String idJugador, int idEquipo){
        connection = DBconnection.getConnection();

        String query = String.format("UPDATE %s SET %s = ? where %s = ?",
                EsquemaFutbol.TB_JUGADORES,
                EsquemaFutbol.COL_FK_IDEQUIPO, EsquemaFutbol.COL_JG_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idEquipo);
            ps.setString(2, idJugador);
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Error en query");
        } finally {
            connection = null;
            DBconnection.closeConnection();
        }

    }


    public void agregarJugadoresAlineacion(String idJugador){
        connection = DBconnection.getConnection();

        String query = String.format("UPDATE %s SET %s = ? where %s = ?",
                EsquemaFutbol.TB_JUGADORES,
                EsquemaFutbol.COL_ESTITULAR, EsquemaFutbol.COL_JG_ID);

        try {
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setString(2, idJugador);
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Error en query");
        } finally {
            connection = null;
            DBconnection.closeConnection();
        }

    }




}
