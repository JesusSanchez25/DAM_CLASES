package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Se lee un número entero. Dicho número se incrementará en una unidad si es par,
        // y se decrementará en una unidad si es impar. Se muestra por consola el nuevo valor del número.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        Integer numero1 = LeerTeclado.nextInt();

        if((numero1%2)==0){
            numero1++;
        } else {numero1--;}
        System.out.println(numero1);
    }

}