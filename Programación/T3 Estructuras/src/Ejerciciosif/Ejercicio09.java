package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida
        //“Son consecutivos” o “No son consecutivos”.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        Integer numero1 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        Integer numero2 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        Integer numero3 = LeerTeclado.nextInt();

        if (numero1<numero2 && numero2<numero3){
            System.out.println("Son números consecutivos");
        } else {
            System.out.println("No son números consecutivos");
        }

    }
}
