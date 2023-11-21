package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y
        // lo guarde en una variable. El sistema irá pidiendo números al usuario hasta
        // que coincida con el aleatorio generado (en caso de no coincidir mostrará el
        // mensaje "Lo siento, intentalo de nuevo"). Cuando coincida el sistema deberá
        // mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)

        Scanner LeerTeclado = new Scanner(System.in);
        int adivinacion =-1;
        int intentos = 0;
        int numero1 = (int)Math.floor(Math.random()*21);

        do {
            System.out.println("Inserte tu número");
            adivinacion = LeerTeclado.nextInt();
            intentos++;

            if (numero1 != adivinacion){

                System.out.println("Lo siento, inténtalo de nuevo ");
            } else {
                System.out.printf("\nHas acertado en %d intentos", intentos);
            }
        } while(numero1 != adivinacion);
    }
}
