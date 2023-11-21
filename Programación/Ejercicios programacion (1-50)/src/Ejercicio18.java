import java.util.Scanner;
import java.lang.Math;

public class Ejercicio18 {
    public static void main(String[] args) {
        //18. Hágase un programa que lea un número real y realice los siguientes redondeos y
        //truncamientos:
        //a) Truncar (a las unidades)
        //b) Redondear (a las unidades)
        //c) Redondear a las milésimas.
        //d) Truncar a las decenas.



        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Escribe un número real");
        Double número = LeerTeclado.nextDouble();
        System.out.println(Math.floor(número));
        System.out.println(Math.round(número));
        número *= 1000;
        System.out.println(Math.round(número)/(float)1000);
        número /=100000;
        System.out.println(número.intValue()*(float)100);

    }
}
