package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //2. Crear un programa que genere 30 números aleatorios entre 0 - 10
        // y los guarde en un array. Una vez metidos, se deberá mostrar:
        //    - Numero de puntos obtenidos
        //    - Media de puntos obtenidos

        int numeros[] = new int[30];
        int totalPuntos = 0;
        int mediaPuntos;

        for (int i = 0; i < 30; i++) {
            numeros[i]= (int)(Math.random()*11);
            totalPuntos += numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+",");
        }

        mediaPuntos = totalPuntos/(numeros.length);

        System.out.println(totalPuntos);
        System.out.println(mediaPuntos);
        }
}
