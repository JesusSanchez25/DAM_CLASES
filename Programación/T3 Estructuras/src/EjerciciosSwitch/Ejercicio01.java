package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Escribe un programa en Java que solicite al usuario ingresar un número del
        // 1 al 7 y muestre el día de la semana correspondiente utilizando una sentencia switch.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número del 1 al 7");
        int numero = LeerTeclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El día que has insertado se corresponde al lunes");
                break;
            case 2:
                System.out.println("El día que has insertado se corresponde al martes");
                break;
            case 3:
                System.out.println("El día que has insertado se corresponde al miercoles");

                break;
            case 4:
                System.out.println("El día que has insertado se corresponde al jueves");
                break;
            case 5:
                System.out.println("El día que has insertado se corresponde al viernes");
                break;
            case 6:
                System.out.println("El día que has insertado se corresponde al sábado");
                break;
            case 7:
                System.out.println("El día que has insertado se corresponde al domingo2");
                break;
            default:
                System.out.println("Número no en rango");
                break;
        }

    }
}
