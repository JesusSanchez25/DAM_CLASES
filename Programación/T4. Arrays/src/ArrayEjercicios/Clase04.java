package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase04 {
    public static void main(String[] args) {
        //4. (PosicionesArray) Crea una aplicación que:
        //    - pida por teclado la longitud de un array
        //    - cree el array de enteros de la longitud introducida
        //    - pida al usuario que introduzca todos los datos del array
        //    - mueva una posición todos los elementos. el elemento de la posición
        //    0 pasa a la posición 1 y así sucesivamente. El elemento que está en la
        //    última posición pasa a la primera
        //    - realizar la tarea anterior pero al contrario. El elemento que está
        //      en la primera posición pasa a la última y así sucesivamente

        Scanner scanner = new Scanner(in);
        System.out.println("Inserte la longitud deseada del array");
        int longitudArray= scanner.nextInt();
        int[] numeros = new int[longitudArray];
        int[] numerosInversa = new int[longitudArray];
        int[] numerosCopia = new int[longitudArray];

        for (int i = 0; i < longitudArray; i++) {
            System.out.println("Inserte un valor del array");
            numeros[i]= scanner.nextInt();
            numerosCopia[i]= numeros[i];
        }


        for (int i = 0; i < longitudArray; i++) { //esto está mal porque hace 2 veces el fori, lo tengo que cambiar todavía
            System.out.println(ArrayMoverDerecha(longitudArray, numeros, numerosCopia)[i]);
        }
        for (int i = 0; i < longitudArray; i++) {
            System.out.println(ArrayMoverIzquierda(longitudArray, numerosInversa, numerosCopia)[i]);

        }



    }

    public static int[] ArrayMoverDerecha(int longitudArray, int[] numeros, int[]numerosCopia){
        for (int i = 0; i < longitudArray; i++) {
            if(i<longitudArray-1){
                numeros[i+1]=numerosCopia[i];
            } else if (i==longitudArray-1) {
                numeros[0]=numerosCopia[i];
            }
        }
        return numeros;
    }

    public static int[] ArrayMoverIzquierda(int longitudArray, int[] numerosInversa, int[]numerosCopia){
        for (int i = longitudArray-1; i >= 0; i--) {
            if(i>0){
                numerosInversa[i-1]=numerosCopia[i];
            } else if (i==0) {
                numerosInversa[longitudArray-1]=numerosCopia[0];
            }
        }
        return numerosInversa;
    }
}
