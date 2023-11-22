package ArrayEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Clase08 {
    public static void main(String[] args) {
        //1. (InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible.
        // Para ello el programadebe:
        //- pedir el número de participantes (de ser impar saltará un fallo)
        //- pedir el nombre de cada uno de los participantes
        //- sacar por pantalla el orden de las parejas resultantes

        String[] equipos = new String[]{"Alcalá","Pedro","Asturias","RauwAlejandro"};
        ArrayList equiposElegidos = new ArrayList<>();

        String equipo1;

        for (int i = 0; i < 4; i++) {
            do {
                int numeroRandom = (int)(Math.random()*4);
                equipo1 = equipos[numeroRandom];
            }while (equiposElegidos.contains(equipo1));
            equiposElegidos.add(equipo1);
            System.out.println(equipo1);
        }






    }
}
