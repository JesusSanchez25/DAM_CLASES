package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase02 {
    public static void main(String[] args) {
        //2. (MayorArray) Crea una aplicación que realice lo siguiente:
        //    - pida por pantalla la longitud del array de enteros
        //    - crea el array de enteros con la longitud introducida
        //    - pida al usuario que introduzca todos los datos del array
        //    - saque por pantalla el elemento mayor y el elemento menor

        Scanner scanner = new Scanner(in);
        int longitudArray = scanner.nextInt();
        int[] numeros = new int[longitudArray];
        int numeroMayor = 0;
        int numeroMenor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserte un número para el array");
            numeros[i] = scanner.nextInt();
            if (i==0){
                numeroMayor = numeros[0];
                numeroMenor = numeros[0];
            }
            if (numeroMenor>numeros[i]) {
                numeroMenor=numeros[i];
            }
            if (numeroMayor>numeros[i]) {
                numeroMayor=numeros[i];
            }

        }


        }


    }

