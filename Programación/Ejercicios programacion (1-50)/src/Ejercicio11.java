import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        //11. Hágase un programa que lea 5 variables enteras y haga lo siguiente:
        //a) Las muestre en una línea separadas por un espacio.
        //b) Rote los valores hacia la izquierda (la primera variable tome el valor de la
        //segunda; la segunda, la de la tercera; la tercera, la de la cuarta; la cuarta, la de
        //la quinta; y la quinta, la de la primera.
        //c) Se muestren de nuevo el valor de las cinco variables de la misma forma que
        //en el apartado a). (rotar)

        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("Inserte el primer número");
        int operando1 = LeerTeclado.nextInt();
        System.out.println("Inserte el segundo número");
        int operando2 = LeerTeclado.nextInt();
        System.out.println("Inserte el tercer número");
        int operando3 = LeerTeclado.nextInt();
        System.out.println("Inserte el cuarto número");
        int operando4 = LeerTeclado.nextInt();
        System.out.println("Inserte el quinto número");
        int operando5 = LeerTeclado.nextInt();

        int operando1_0 = operando1;

        System.out.println(operando1 + " " +operando2 + " " +operando3 + " " +operando4 + " " +operando5);

        operando1 = operando2;
        operando2 = operando3;
        operando3 = operando4;
        operando4 = operando5;
        operando5 = operando1_0;
        System.out.println(operando1 + " " +operando2 + " " +operando3 + " " +operando4 + " " +operando5);
    }
}
