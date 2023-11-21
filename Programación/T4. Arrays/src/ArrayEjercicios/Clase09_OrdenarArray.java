package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase09_OrdenarArray {
    public static void main(String[] args) {
        //1. (MenuArray)Crear un programa que mediante un menú permita:
        //    - Crear un array de números enteros con n posiciones pedidas.
        //    - Rellenar el array creado con números aleatorios.
        //    - Rellenar el array creado con números pedidos por consola.
        //    - Ordenar el array de mayor a menor
        //    - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud
        //    (si esta es inferior a la que la existe continuar pidiendo)
        //    - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
        //    - Mostrar por pantalla el array según está

        Scanner scanner = new Scanner(in);
        System.out.println("Dime el tamaño del array deseado");
        int[] numeros = new int[scanner.nextInt()];
        int[] numerosOrdenados = new int[numeros.length];
        int NumeroMásGrande = 0;
        int posicionPalabra = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
        }
        /*
        *  for (int i = 0; i < numeros.length; i++) {
            numeros[i]= scanner.NextInt;
        * */


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


        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numerosOrdenados[i] + ", ");
        }
        System.out.println("");


        int longitudAmpliada = 0;
        do {
            System.out.println("Inserte la nueva longitud a duplicar");
            longitudAmpliada = scanner.nextInt();
        } while (longitudAmpliada < numeros.length);

        int[] numerosAmpliado = new int[longitudAmpliada];
        int j = 0;
        for (int i = 0; i < longitudAmpliada; i++) {
            if (numerosOrdenados.length * (j + 1) < i + 1) {
                j++;
            }
            if (i < numeros.length) {
                numerosAmpliado[i] = numerosOrdenados[i];
            } else {
                numerosAmpliado[i] = numerosOrdenados[i - (numeros.length * j)];
            }
            System.out.print(numerosAmpliado[i] + ", ");
        }
        numerosOrdenados = numerosAmpliado;


        System.out.println("Elige dirreción para mover");
        System.out.println("1.Derecha");
        System.out.println("2.Izquierda");
        final int Aux1 = numerosOrdenados[numerosOrdenados.length-1];
        final int Aux2 = numerosOrdenados[0];
        int respuesta = scanner.nextInt();
        for (int i = 0; i < numerosOrdenados.length; i++) {

            switch (respuesta) {
                case 1:
                    if(i==numerosOrdenados.length-1){
                        numerosOrdenados[0]=Aux1;
                    } else {
                        numerosOrdenados[numerosOrdenados.length-i-1]=numerosOrdenados[numerosOrdenados.length-i-2];

                    }
                    break;

                case 2:
                    if(i==numerosOrdenados.length-1){
                        numerosOrdenados[numerosOrdenados.length-1]=Aux2;
                    } else {
                        numerosOrdenados[i]=numerosOrdenados[i+1];

                    }


                    break;


            }

            //DA PROBLEMAS CUANDO DUPLICAS Y LUEGO LO MUEVES PORQUE SON DIFERENTES VARIABLES
        }
        System.out.println("");
        for (int numero : numerosOrdenados) {
            System.out.print(numero+ ", ");
        }

    }


}
