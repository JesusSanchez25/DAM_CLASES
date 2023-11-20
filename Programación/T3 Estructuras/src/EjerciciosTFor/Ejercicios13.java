package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios13 {
    public static void main(String[] args) {
        //Pedir una palabra por teclado y mostrar su contraria. Por ejemplo se introducirá la
        // palabra programacion y se mostrará por consola la palara noicamargorp (InversaPalabra)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra = LeerTeclado.next();
        String palabraInversa = "";

        for (int i = 0; i < palabra.length(); i++) {
            palabraInversa += palabra.charAt(palabra.length()-1-i);
        }
        System.out.println(palabraInversa);

    }
}
