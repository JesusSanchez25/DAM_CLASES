package ejercicios.ventanaFutbol;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.controler.JugadoresCrudRepository;
import ejercicios.ventanaFutbol.model.Jugador;
import ejercicios.ventanaFutbol.ui.VentanaCrearEquipo;
import ejercicios.ventanaFutbol.ui.VentanaLogin;
import ejercicios.ventanaFutbol.ui.VentanaPrincipal;

public class Entrada {
    public static void main(String[] args) {
    DBControler dbControler = new DBControler();

    for (Jugador item : dbControler.sacarJugadoresEnAlineacion()) {
        System.out.println(item);
    }


    }
}
