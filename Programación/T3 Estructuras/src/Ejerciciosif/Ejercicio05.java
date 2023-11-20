package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa.
        // Se comprobará previamente que el número introducido tiene 4 dígitos. En la salida se mostrará uno
        // de los siguientes mensajes:
        //    1. “El número no tiene 4 dígitos”;
        //    2. “Es capicúa”
        //    3. “No es capicúa”.
        //    - * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte número natural de 4 dígitos");
        String numero1 = LeerTeclado.next();

        boolean digitos = numero1.length()==4;
        boolean capicua = numero1.charAt(0)==numero1.charAt(3) && numero1.charAt(1)==numero1.charAt(2);

        if (digitos){
            System.out.println("El número tiene 4 dígitos");
            if (capicua){
                System.out.println("El número es capicua");
            } else {
                System.out.println("El número no es capicua");
            }


        } else {
            System.out.println("El número no tiene 4 dígitos");
        }


    }
}
