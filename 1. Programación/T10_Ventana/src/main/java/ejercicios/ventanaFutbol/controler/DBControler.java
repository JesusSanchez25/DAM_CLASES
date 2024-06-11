package ejercicios.ventanaFutbol.controler;

import ejercicios.ventanaFutbol.database.DBconnection;
import ejercicios.ventanaFutbol.database.EsquemaFutbol;
import ejercicios.ventanaFutbol.excepciones.DatosIncorrectosException;
import ejercicios.ventanaFutbol.excepciones.UsuarioNoEncontradoException;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Jugador;
import ejercicios.ventanaFutbol.model.Usuario;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBControler {
    UsuariosCrudRepository usuariosCrudRepository;
    EquipoCrudRepository equipoCrudRepository;
    JugadoresCrudRepository jugadoresCrudRepository;
    Connection connection;
    PreparedStatement ps;
    ResultSet resultSet;

    public DBControler() {

        this.usuariosCrudRepository = new UsuariosCrudRepository();
        this.equipoCrudRepository = new EquipoCrudRepository();
        this.jugadoresCrudRepository = new JugadoresCrudRepository();

    }

    public int comprobarUsuario(String nombre, String contrasenia)  throws UsuarioNoEncontradoException, DatosIncorrectosException  {
        return usuariosCrudRepository.comprobarUsuario(nombre, contrasenia);
    }
    public int comprobarUsuario(String nombre,String correo, String contrasenia) throws UsuarioNoEncontradoException, DatosIncorrectosException {
        return usuariosCrudRepository.comprobarUsuario(nombre, contrasenia, correo);
    }
    public int sacarIdUsuario(String nombre){
        return usuariosCrudRepository.sacarIdUsuario(nombre);
    }
    public Usuario sacarUsuario(int idUsuario){
        return usuariosCrudRepository.sacarUsuario(idUsuario);
    }

    public void aniadirUsuario(String nombre, String correo, String contrasenia){
        usuariosCrudRepository.aniadirUsuario(nombre, correo, contrasenia);
    }

    public void asignarEquipoUsuario(int idUsuario,int idEquipo){
        usuariosCrudRepository.asignarEquipo(idEquipo, idUsuario);
    }

    public ArrayList<Jugador> sacarJugadoresEquipo(int idEquipo){
        return jugadoresCrudRepository.sacarJugadoresEquipo(idEquipo);
    }

    public void insertarJugadoresIniciales(){
        jugadoresCrudRepository.meterJugadoresIniciales();
    }

    public int sacarIdEquipo(int idUsuario){
        return usuariosCrudRepository.sacarUsuario(idUsuario).getIdEquipo();
    }

    public int sacarIdEquipo(String nombreEquipo){
        return equipoCrudRepository.sacarId(nombreEquipo);
    }
    public Equipo sacarEquipo(int idEquipo){
        return equipoCrudRepository.sacarEquipo(idEquipo);
    }
    public void crearEquipo(String nombreEquipo){
        equipoCrudRepository.crearEquipo(nombreEquipo);
    }

    public JSONArray leerApi(String urlString){

        BufferedReader bufferedReader = null;
        StringBuilder texto = new StringBuilder();


        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = "";

            while ((linea = bufferedReader.readLine()) != null){
                texto.append(linea);
            }



        } catch (IOException e) {
            System.out.println("ERROR EN IO");
        } finally {
            try {
                connection = null;
                DBconnection.closeConnection();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }


        return new JSONArray(texto.toString());

    }

    public boolean dbIsEmpty(){
        connection = DBconnection.getConnection();

        String query = String.format("Select %s from %s Limit 1",
                EsquemaFutbol.COL_JG_ID, EsquemaFutbol.TB_JUGADORES);

        try {
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                // no está vacío
                return false;
            }


        } catch (SQLException e) {
            System.out.println("Error en query");
        }

        // está vacio
        return true;
    }
    public ArrayList<Jugador> sacarJugadoresFichar(){
        return jugadoresCrudRepository.sacarJugadoresFichar();
    }

    public ArrayList<Jugador> sacarJugadoresEnAlineacion(){
        return jugadoresCrudRepository.sacarJugadoresEnAlineacion();
    }

    public void ficharJugador(Jugador jugador, int idEquipo, int presupuestoEquipo){
        jugadoresCrudRepository.ficharJugador(jugador,idEquipo, presupuestoEquipo);
    }

    public void setPresupuestoEquipo(int cantidad, int idEquipo){
        equipoCrudRepository.setPresupuestoEquipo(cantidad, idEquipo);
    }

    public void agregarJugadorAlineacion(String idJugador){
        jugadoresCrudRepository.agregarJugadoresAlineacion(idJugador);
    }

    public boolean retarUsuario(int idUsuario1, int idUsuario2){
        return usuariosCrudRepository.retarUsuario(idUsuario1, idUsuario2);
    }

}
