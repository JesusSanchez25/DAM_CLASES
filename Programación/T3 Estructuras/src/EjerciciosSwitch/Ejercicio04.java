package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Realiza un programa que solicite al usuario ingresar un mes
        // (como un número del 1 al 12) y muestre la cantidad de días
        // que tiene ese mes, considerando años no bisiestos

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el número del mes");
        int numero = LeerTeclado.nextInt();

        switch (numero){
            case 1,3,5,7,8,10,12:
                System.out.println("Tu més tiene 31 días");
                break;
            case 4,6,9,11:
                System.out.println("Tu més tiene 30 días");
                break;
            case 2:
                System.out.println("Tu més tiene 28 días");
                break;
            default:
                System.out.println("Número no en rango");
                break;
        }


    }
}
