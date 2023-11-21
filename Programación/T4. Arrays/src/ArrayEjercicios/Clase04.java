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

        int longitud = 5;

        int[] array = new int[]{2,3,4,5,6};

        //Mover a la derecha
        int aux = array[array.length-1];
        for (int i = 0; i < longitud-1; i++) {
            array[longitud-i-1]=array[longitud-i-2];
        } array[0] = aux;

        //Mover a la izquierda
        int aux2 = array[0];
        for (int i = 0; i < longitud-1; i++) {
            array[i]=array[i+1];
        } array[longitud-1] = aux2;

        for (int numero : array) {
            System.out.print(numero+", ");
        }




    }
}
