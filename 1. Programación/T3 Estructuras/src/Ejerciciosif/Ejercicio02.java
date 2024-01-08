package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de
        // los otros dos. En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6”
        // (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        int numero1 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        int numero2 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        int numero3 = LeerTeclado.nextInt();

        boolean condicion1 = numero1==(numero2+numero3) ;
        boolean condicion2 = numero2==(numero1+numero3);
        boolean condicion3 = numero3==(numero1+numero2);

        if(condicion1){
            System.out.println(numero1+"="+numero2+"+"+numero3);
        } else if(condicion2){
            System.out.println(numero2+"="+numero1+"+"+numero3);
        } else if(condicion3){
            System.out.println(numero3+"="+numero1+"+"+numero2);
        } else {
            System.out.println("ninguno es la suma de los otros dos");
        }





    }
}
