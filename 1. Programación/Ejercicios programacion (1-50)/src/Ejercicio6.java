import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Programa que lee el nombre completo y la edad de una persona, y muestra los datos
        //leídos. (leerNombreEdad)

        Scanner LeerNombreEdad = new Scanner(System.in);

        System.out.println("Inserte nombre y aprellidos");
        System.out.println("''Pulsa enter para continuar''");
            String nombre = LeerNombreEdad.next();
        System.out.println("inserte edad");
        System.out.println("''Pulsa enter para continuar''");
            Integer edad = LeerNombreEdad.nextInt();


        System.out.println("Te llamas " +nombre);
        System.out.println("tienes " +edad +" años");
    }
}
