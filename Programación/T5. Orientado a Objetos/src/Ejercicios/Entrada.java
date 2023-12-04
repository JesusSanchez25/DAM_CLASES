package Ejercicios;

import Ejercicios.model.Coche;

public class Entrada {

    public static void main(String[] args) {

        Coche participante1 = new Coche("Participante1", "1234A", 240, 150);

        participante1.acelerar(500);
        participante1.mostrarDatos();




    }
}
