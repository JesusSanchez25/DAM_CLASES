package ArrayEjercicios;

import java.util.Scanner;

public class Ejercicio01 {
    //Realiza un programa que pida 10 números por teclado y que los almacene en un array.
    // A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime el número a insertar");
            numeros[i]=scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El número en la posición "+(i+1)+" es: "+numeros[i]);
        }

}
}