import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        //Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
        //a) Son iguales
        //b) La primera es menor que la segunda
        //c) Son distintas
        //(CompararCadenas)

        Scanner LeerTeclado = new Scanner(System.in);
        String palabra1 = "Hol";
        String palabra2 = "Hola";

        Boolean Comprobante = palabra1==palabra2;
        Boolean ComprobanteLongitud = palabra1.length()<palabra2.length();
        Boolean Comprobante1 = palabra1!=palabra2;
        System.out.println("Son iguales: "+Comprobante);
        System.out.println("La primera es menor que la segunda: "+ComprobanteLongitud);
        System.out.println("Son distintas: "+Comprobante1);
    }
}
