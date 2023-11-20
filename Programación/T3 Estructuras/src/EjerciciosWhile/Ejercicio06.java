package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Modifica el ejercicio anterior para que una vez adivinado el número
        // el sistema muestre el siguiente mensaje: "Quieres volver a jugar (S/N)":

        Scanner LeerTeclado = new Scanner(System.in);
        int adivinacion =-1;
        int intentos = 0;
        int record= 100;
        int contador = 0;
        String seguir = "";
        Character CharSeguir = 'd';
        int numero1 = (int)Math.floor(Math.random()*21);

        while (numero1 != adivinacion && CharSeguir!='N'){
            System.out.println("Inserte tu número");
            adivinacion = LeerTeclado.nextInt();
            intentos++;
            if (numero1 != adivinacion){

                System.out.println("Lo siento, número incorrecto ");


            } else {
                System.out.printf("\nHas acertado en %d intentos", intentos);
                if (intentos<record){
                    record = intentos;
                    if(contador>0){
                        System.out.print("\nHas superado tu antiguo record");
                    }
                }
                intentos = 0;
                contador++;
                numero1 = (int)Math.floor(Math.random()*21);
                System.out.println("\nQuieres volver a jugar(S/N)");
                seguir = LeerTeclado.next();
                CharSeguir = seguir.charAt(0);
            }
        }
    }
}
