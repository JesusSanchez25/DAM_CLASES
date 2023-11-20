package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch,
        // determine si es par o impar.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        int numero = LeerTeclado.nextInt();


        switch (numero%2){
            case 0:
                System.out.println("el número es par");
                break;
            case 1:
                System.out.println("el número es impar");
                break;
            default:
                System.out.println("Número no en rango");
                break;


        }

    }
}
