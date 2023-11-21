package ArrayListEjercicios.MarcaCoches.Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio3 {
    //Crea dos ArrayList de números y guarda de forma aleatorio 20 números sin decimales en cada uno de ellos.
    // Una vez hecho esto comprueba cuantos números de los dos arraylist son iguales (mismo número en la misma posición).
    // Tras hacer la comprobación indica cuantos números han sido iguales

    public static void GenerarArray (){
        Scanner scanner = new Scanner(in);
        ArrayList lista = new ArrayList<>();
        ArrayList lista2 = new ArrayList<>();
        int contador = 0;

        for (int i = 0; i < 20; i++) {

            lista.add((int)(Math.random()*5));
            lista2.add((int)(Math.random()*5));

        }

        for (int i = 0; i < lista2.size(); i++) {
            if (lista.get(i)==lista2.get(i)){
                contador++;
            }
        }
        System.out.println(contador+" números han sido iguales");

    }

    }



