import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        //Léase un número de doble precisión y conviértase al resto de tipos básicos. Se
        //mostrarán cada uno de los valores convertidos. (Convertir)

        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el número a converetir");
        int númeroEntero = LeerTeclado.nextInt();
        System.out.println("byte: " + (byte)númeroEntero);
        System.out.println("short: " + (short)númeroEntero);
        System.out.println("int: " + númeroEntero);
        System.out.println("long: " + (long)númeroEntero);
        System.out.println("float: " + (float)númeroEntero);

    }
}
