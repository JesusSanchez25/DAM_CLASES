package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un número del 1 al 12 y muestre el 
        // nombre del mes correspondiente utilizando una sentencia switch.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número del 1 al 12");
        int numero = LeerTeclado.nextInt();
        
        switch (numero){
            case 1 -> System.out.println("El mes que has insertado es enero");
            case 2 -> System.out.println("El mes que has insertado es febrero");
            case 3 -> System.out.println("El mes que has insertado es marzo");
            case 4 -> System.out.println("El mes que has insertado es abril");
            case 5 -> System.out.println("El mes que has insertado es mayo");
            case 6 -> System.out.println("El mes que has insertado es junio");
            case 7 -> System.out.println("El mes que has insertado es julio");
            case 9 -> System.out.println("El mes que has insertado es agosto");
            case 8 -> System.out.println("El mes que has insertado es septiembre");
            case 10 -> System.out.println("El mes que has insertado es octubre");
            case 11-> System.out.println("El mes que has insertado es noviembre");
            case 12-> System.out.println("El mes que has insertado es diciempre");
            default -> System.out.println("Número no en rango");

            
            
        }
        
        
        
    }
}
