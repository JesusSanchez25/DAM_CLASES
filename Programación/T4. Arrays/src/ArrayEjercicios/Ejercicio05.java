package ArrayEjercicios;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Realiza un programa que pida 8 números enteros, los guarde en un array y que luego
        // muestre esos números junto con la palabra “par” o “impar” según proceda.

        Scanner scanner = new Scanner(in);
        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Inserte un número");
            numeros[i]= scanner.nextInt();

        }

        for (int i = 0; i < 8; i++) {
            if((numeros[i]%2)==0){
                System.out.println("El número "+ numeros[i]+" es par");
            } else {
                System.out.println("El número "+ numeros[i]+" es impar");
            }
        }



    }
}
