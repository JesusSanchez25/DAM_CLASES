package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios14 {
    public static void main(String[] args) {
        //Pedir una palabra por teclado y comprobar si es o con capicua. Una palabra es palíndromo cuando
        // se lee igual de izquieda a derecha que de derecha a izquierda. Por ejemplo ana, oro, radar.
        // Para poder hacer la comprobacion no se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra = LeerTeclado.next();
        String palabraInversa = "";

        for (int i = 0; i < palabra.length(); i++) {
            palabraInversa += palabra.charAt(palabra.length()-1-i);
        }
        if ((palabra.equals(palabraInversa))){
            System.out.println("La palabra es capicua");
        } else {
            System.out.println("La palabra no es capicua");
        }

    }
}
