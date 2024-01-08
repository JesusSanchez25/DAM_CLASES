package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
        // En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        int numero1 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        int numero2 = LeerTeclado.nextInt();


        if(numero1>numero2){
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }


    }
}
