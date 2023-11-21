package Ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado
        // (de no ser positivo, se establecerá a 100). (Dado)



        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el número de tiradas");
        int numeroDados = LeerTeclado.nextInt();
        int dado = 0;

        if(numeroDados==0){numeroDados=100;}
        for (int i = 0; i < numeroDados; i++) {
            dado = (int)Math.ceil(Math.random()*6);
            System.out.printf("\nEl %dº múmero es: %d",i+1,dado);

        }




    }
}
