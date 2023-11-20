package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática
        // (+, -, *, /) y dos números. Luego, utiliza una sentencia switch para realizar la operación
        // correspondiente y mostrar el resultado.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un tipo de operación matemática");
        Character caracter = LeerTeclado.next().charAt(0);
        System.out.println("Inserte el primer número a operar");
        Double numero = LeerTeclado.nextDouble();
        System.out.println("Inserte el segundo número a operar");
        Double numero1 = LeerTeclado.nextDouble();

        switch (caracter){
            case '+':
                System.out.printf("La suma da como resultado %.0f", numero+numero1);
                break;
            case '-':
                System.out.printf("La resta da como resultado %.0f", numero-numero1);
                break;
            case '*':
                System.out.printf("La multiplicación da como resultado %.0f", numero*numero1);
                break;
            case '/':
                System.out.printf("La división da como resultado %.2f", numero/numero1);
                break;


        }



    }
}
