package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //7. Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado
        // a 3 coincide con dicho número. Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar
        // si es o no un número Armstrong. Se comprobará previamente que el número introducido tiene 3 dígitos.
        // En la salida se mostrará uno de los siguientes mensajes:
        //    1. “El número no tiene 3 dígitos”
        //    2. “Es un número Armstrong”
        //    3. “No es un número Armstrong”.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número de 3 cifras");
        Integer numero1 = LeerTeclado.nextInt();


        if (numero1<1000 && numero1>99){
            System.out.println("El número tiene 3 dígitos");
            boolean suma = numero1==(Math.pow((numero1/100),3)+Math.pow((numero1%100/10),3)+Math.pow((numero1%10),3));
            if (suma)
            {
                System.out.println("El número es un número armstrong");
            } else {
                System.out.println("El número no es un número armstrong");
            }
        } else {
            System.out.println("El número no tiene 3 dígitos");}

    }


}
