package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase01 {
    public static void main(String[] args) {
        //1. (MultiplicarArray) Crear un array de 5 posiciones:
        //    - se le pedirá al usuario que introduzca cada unos de los elementos del array
        //    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
        //    - Saca por consola la suma de todos los números
        //    - Saca la media de todos los elementos


        Scanner scanner = new Scanner(in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("inserte un número");
            numeros[i] = scanner.nextInt();
            numeros[i] *=2;

        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de todos los elemntos da como resultado: "+suma);
        System.out.println("La medida de todos los elemntos da como resultado: "+(suma/ numeros.length));

    }




}
