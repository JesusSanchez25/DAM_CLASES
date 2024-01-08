package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y
        // muestre la estación del año correspondiente (por ejemplo, "Primavera", "Verano",
        // "Otoño", "Invierno") utilizando una sentencia switch.



        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número del 1 al 12");
        int numero = LeerTeclado.nextInt();

        switch (numero){
            case 1,2,3:
            System.out.println("Es invierno");
                break;
            case 4,5,6:
            System.out.println("Es primavera");
                break;
            case 7,8,9:
            System.out.println("Es verano");
                break;
            case 10,11,12:
            System.out.println("Es otoño");
                break;
            default:
                System.out.println("Número introducido no está dentro del rango");



        }




    }
}
