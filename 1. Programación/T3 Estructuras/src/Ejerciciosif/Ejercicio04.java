package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //4. Hágase un programa que compruebe si un año pedido por teclado es bisiesto.
        // En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)
        //
        //    El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si
        //    es múltiplo de 4.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un año");
        Integer año = LeerTeclado.nextInt();

        if ((año%4)==0){
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("no es un año bisiesto");
        }


    }
}
