package PruebasyCosas;

import java.util.Scanner;

// Inicio del programa y declaración de variables:
public class ElProblemaSupremo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numPrimos;
        int contador;
        boolean esPrimo;
        int divisor;
        int num;
// Inicio del programa, explicación al usuario
        System.out.println("El programa nos muestra una cantidad solicitada de números primos.");
// Pedimos datos al usuario
        System.out.print("Indicanos la cantidad de los primeros números primos que deseas conocer: ");
        numPrimos = scanner.nextInt();
// Iniciamos el ciclo para calcular el tiempo.
        System.out.println("1: 2");
        contador = 1;
        num = 3;
        while (contador < numPrimos){
            esPrimo = true;
            divisor=3;
            while ((divisor<=Math.sqrt((num))) && esPrimo) {
                if (num%divisor==0) {
                    esPrimo = false;
                }
                divisor +=2;
            }
            if (esPrimo){

                System.out.println(contador + ": " + num);
            }
            num +=2;
        }
    }
}