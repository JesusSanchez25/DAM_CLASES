package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y
        // muestre un mensaje de calificación utilizando una sentencia switch (por ejemplo,
        // "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número del 1 al 5");
        int numero = LeerTeclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("Casi no tienes ni nota");
                break;
            case 2:
                System.out.println("Has suspendido");
                break;
            case 3:
                System.out.println("Has aprobado");
                break;
            case 4:
                System.out.println("Has sacado un sobresaliente");
                break;
            case 5:
                System.out.println("Literalmente no puedes sacar más nota");
                break;
            default: System.out.println("Número no en rango");
                break;

        }


    }
}
