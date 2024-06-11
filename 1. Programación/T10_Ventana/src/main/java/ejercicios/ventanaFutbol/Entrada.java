package ejercicios.ventanaFutbol;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.controler.JugadoresCrudRepository;
import ejercicios.ventanaFutbol.model.Jugador;
import ejercicios.ventanaFutbol.ui.*;

public class Entrada {
    public static void main(String[] args) {
    DBControler dbControler = new DBControler();

        if (dbControler.dbIsEmpty()){
            dbControler.insertarJugadoresIniciales();
        }

       VentanaLogin ventanaLogin = new VentanaLogin();
    }
}
