import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //17. Hágase un programa que lea una letra en mínusculas y la muestre en mayúsculas. No
        //se pueden introducir vocales con acento ni diéresis, ni tampoco la letra ‘ñ’.
        //(MinusculaAMayuscula)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Escribe la letra en mínuscula");
        String letra = LeerTeclado.next();

        System.out.println(letra.toUpperCase());
    }
}
