package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //1-Pedir al usuario un número
        //Comprobar que es un número positivo > 0
        //Mostrra su tabla de multiplicar hast el 10

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número");
        int numero = LeerTeclado.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.printf("\n%d*%d=%d",numero,i,numero*i);

        }
    }
}
