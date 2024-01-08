package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //3. Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20,
        // y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los
        // siguientes menasajes:
        //    1. “Es múltiplo de 20 y está entre -100 y 100”.
        //    2. “Es múltiplo de 20 y no está entre -100 y 100”.
        //    3. “No es múltiplo de 20 y está entre -100 y 100”-
        //    4. “No es múltiplo de 20 y no está entre -100 y 100”.
        //    - * Un número es múltiplo de otro cuando su resto es igual a 0 **

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");

        Double numero1 = LeerTeclado.nextDouble();
        boolean multiplo20 =(numero1%20)==0;
        boolean rango =(numero1>=-100 && numero1<=100);

        if (multiplo20 && rango){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if (multiplo20 && !rango){
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        }else if (!multiplo20 && rango){
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        }else if (!multiplo20 && !rango){
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }



    }
}
