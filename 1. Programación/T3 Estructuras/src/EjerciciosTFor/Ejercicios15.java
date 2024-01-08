package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios15 {
    public static void main(String[] args) {
        //Crear un programa que permita realizar un juego de adivinación. Para ello el sistema nada más
        // empezar generará un número aleatorio entre 1 y 30. Tras la generación de este número el usuario
        // contará con 10 intentos para poder adivinarlo. Para lo cual se irá pidiendo un números y en el
        // caso de aceptarlo terminará el proceso con el mensaje "Has adivinado el número en X intentos".
        // En el caso de agotar los intentos aparecerá el menaje "Lo siento, has agotado todos los intentos”

        Scanner LeerTeclado = new Scanner(System.in);

        int numeroAleatorio = (int)((Math.random()+0.01)*30.0);
        System.out.println(numeroAleatorio);
        for (int i = 0; i < 10; i++) {

            System.out.println("Adivina el número del 1 al 30:");
            int numero = LeerTeclado.nextInt();

            if (numero==numeroAleatorio){
                System.out.println("has acertado bro siuu");
                break;
            } else {
                System.out.println("Vuelve a intentarlo");
            }

        }


    }
}
