package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase09_Prueba2 {
    public static void main(String[] args) {
        int resultado1;
        int[] numeros = new int[5];
        int[] numerosOrdenados = new int[numeros.length];
        int NumeroMásGrande;
        int posicionPalabra = 0;
        int longitudAmpliada;
        Scanner scanner = new Scanner(in);

        for (int i = 0; i < numerosOrdenados.length; i++) {
            numerosOrdenados[i] = (int)(Math.random()*8);
        }
        for (int numero : numerosOrdenados) {
            System.out.print(numero+ ", ");
        }

        numeros = numerosOrdenados;
        for (int i = 0; i < numeros.length; i++) {
            NumeroMásGrande = numeros[0];
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] >= NumeroMásGrande) {
                    NumeroMásGrande = numeros[j];
                    posicionPalabra = j;
                }
            }
            numerosOrdenados[numeros.length - i - 1] = NumeroMásGrande;
            numeros[posicionPalabra] = -1;
        }


        System.out.println("");
        for (int numero : numerosOrdenados) {
            System.out.print(numero+ ", ");
        }

    }
}
