package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos
        // y la cantidad de ceros (NumerosTipos)


        Scanner LeerTeclado = new Scanner(System.in);
        double numeroPositivo = 0.0;
        double numeroNegativo = 0.0;
        int cantidadCeros = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("\nInserte el %dº número", i + 1);
            int numero1 = LeerTeclado.nextInt();

            if (numero1 > 0) {
                numeroPositivo += numero1;
                cantidadPositivos++;
            } else if (numero1 < 0) {
                numeroNegativo += numero1;
                cantidadNegativos++;
            } else {
                cantidadCeros++;
            }

        }
        if (cantidadPositivos > 0) {
            System.out.printf("\nLa media de números positivos es de: %.2f", numeroPositivo / cantidadPositivos);
        } else {
            System.out.printf("\nNo hay ningún número positivo");
        }
        if (cantidadNegativos > 0) {
            System.out.printf("\nLa media de números negativos es de: %.2f", numeroNegativo / cantidadNegativos);
        } else {
            System.out.println("\nNo hay ningún número negativo");
        }
            System.out.printf("\nLa cantidad de ceros es de: %d", cantidadCeros);

    }
}
