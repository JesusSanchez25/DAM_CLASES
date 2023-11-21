import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Hágase un programa que lea dos variables enteras y haga lo siguiente:
        //a) Las muestre en una línea separadas por un espacio.
        //b) Intercambie el valor de las dos variables.
        //c) Se muestren de nuevo el valor de las dos variables de la misma forma que en
        //el apartado a). (intercambiar)

        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el primer número");
        int operando1 = LeerTeclado.nextInt();
        System.out.println("Inserte el segundo número");
        int operando2 = LeerTeclado.nextInt();
        int operando1_0 = operando1;

                System.out.println(operando1 + " " +operando2);

        operando1 = operando2;
        operando2 = operando1_0;
                System.out.println(operando1 + " " +operando2);



    }
}
