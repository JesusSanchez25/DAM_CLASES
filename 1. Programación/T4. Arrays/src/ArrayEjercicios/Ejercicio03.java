package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio03 {
    public static void main(String[] args) {
    //3. Escribe un programa que lea 10 números por teclado,
        // los guarde en un array y que luego los muestre:
        //    - en orden inverso, es decir, el primero que se introduce es el
        //      último en mostrarse
        //    - en orden normal, es decir, el primero que se muestra es el primero
        //      que se ha introducido


        Scanner scanner = new Scanner(in);
    int[] numeros = new int[10];
    String numeroInverso = "";
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número");
            numeros[i]= scanner.nextInt();

        }
        for (int i = numeros.length-1; i >= 0; i--) {
            numeroInverso+= (numeros[i])+",";
        }

        System.out.println("El orden inverso es: "+ numeroInverso);
        System.out.print("El orden original es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(numeros[i]+",");
        }
    }
}
