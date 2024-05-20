package ejercicios.ventanaFutbol.controler;

import com.google.gson.Gson;
import ejercicios.ventanaFutbol.database.DBconnection;
import ejercicios.ventanaFutbol.database.EsquemaFutbol;
import ejercicios.ventanaFutbol.model.Jugador;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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




}
