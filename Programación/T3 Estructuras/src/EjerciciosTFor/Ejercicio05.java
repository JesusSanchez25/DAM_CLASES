package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado
        // al segundo sin utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
        // Casos particulares: 00 = Error y n0 = 1.(BaseExponente)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte la base");
        int base = LeerTeclado.nextInt();
        System.out.println("Inserte el exponente");
        int exponente = LeerTeclado.nextInt();
        int resultado = base;

        for (int i = 0; i < exponente-1; i++) {
            resultado *= base;
        }
        System.out.println(resultado);

    }
}
