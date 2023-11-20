package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
        //los números positivos. (SumarPositivos)

        Scanner LeerTeclado = new Scanner(System.in);
        int numeroDados =1;
        int suma = 0;

        do{
        System.out.println("Inserte un número");
        numeroDados = LeerTeclado.nextInt();
        suma +=numeroDados;
        } while (numeroDados!=0);
        System.out.println("La suma total es: "+suma);

    }
}
