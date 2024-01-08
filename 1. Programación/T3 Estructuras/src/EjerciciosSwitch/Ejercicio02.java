package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Crea un programa que permita al usuario ingresar un carácter y luego
        // determine si es una vocal o una consonante utilizando una sentencia switch.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte una letra");
        Character caracter = LeerTeclado.next().charAt(0);
        
        switch (caracter.toString().toLowerCase()){
            case "a","e","i","o","u":
                System.out.println("La letra es una vocal");
                break;
            default:
                System.out.println("La letra es una consonante");
        }
        
        
    }
}
