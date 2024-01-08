package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Calcúlese el mínimo común múltiplo de dos números entre 1 y 100.
        // Para obtener el mcm se tomará uno de los valores introducidos y
        // se irá multiplicando por 1, 2, 3, etc, hasta que el valor obtenido
        // sea múltiplo del otro número, que sería el valor buscado. (MinimoComunMultiplo)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el primer número");
        int numero1 = LeerTeclado.nextInt();
        int numero1_0 = numero1;
        System.out.println("Inserte el segundo número");
        int numero2 = LeerTeclado.nextInt();
        int numero2_0 = numero2;
        int i = 0;
        while (numero1 != numero2){
            i++;
            numero2 = numero2_0;
            numero2 *=i;
            while (numero1 != numero2 && numero1<=numero2){
                numero1 += numero1_0;
        }
        }
        System.out.println("El mínimo común múltiplo es: "+numero1);



}
}
