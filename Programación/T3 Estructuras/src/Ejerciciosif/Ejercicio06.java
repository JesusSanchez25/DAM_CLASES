package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango,
        // se obtendrá la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros
        // en el rango se mostrará el mensaje “Alguno de los números no está entre -100 y 100”. No se sumará
        // el inverso de aquellos valores que sean 0. Por ejemplo, se introducen los enteros 20, -4 y 100,
        // y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero entre -100 y 100");
        Double numero1 = LeerTeclado.nextDouble();
        System.out.println("Inserte otro número entero entre -100 y 100");
        Double numero2 = LeerTeclado.nextDouble();
        System.out.println("Inserte otro número entero entre -100 y 100");
        Double numero3 = LeerTeclado.nextDouble();

        if((numero1<=100 && numero1>=-100)&&(numero2<=100 && numero2>=-100)&&(numero3<=100 && numero3>=-100)){
            System.out.println("La suma de sus inverso es ="+((1/numero1) + (1/numero2) + (1/numero3)));
        } else {
            System.out.println("Alguno de los números no está dentro del rango");
        }


    }
}
