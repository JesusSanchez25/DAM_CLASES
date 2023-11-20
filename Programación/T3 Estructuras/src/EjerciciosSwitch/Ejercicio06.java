package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje
        // diferente para cada número utilizando una sentencia switch (por ejemplo, "Opción 1 seleccionada",
        // "Opción 2 seleccionada", etc.).

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número del 1 al 4");
        int numero = LeerTeclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("Has elegido la opción 1");
                break;
            case 2:
                System.out.println("Has elegido la opción 2");
                break;
            case 3:
                System.out.println("Has elegido la opción 3");
                break;
            case 4:
                System.out.println("Has elegido la opción 4");
                break;
            default: System.out.println("Número no en rango");
                break;

        }



    }
}
