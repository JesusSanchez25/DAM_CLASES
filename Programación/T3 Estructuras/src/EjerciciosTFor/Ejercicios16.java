package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios16 {
    public static void main(String[] args) {
        //Calcular el factorial de un número entre 0 y 20. El factorial de un número se define
        // del siguiente modo: F(0) = 1; F(1) = 1; F(n) = n(n-1)(n-2) ... 1 siendo n>1. (Factorial)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el número a factorizar");
        int numero = LeerTeclado.nextInt();
        int factor = numero;

        for (int i = 1; i < numero; i++) {
            factor *= numero-(i);
        }
        System.out.println(factor);
    }
}
