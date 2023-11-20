package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase08 {
    public static void main(String[] args) {
        //1. (InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible.
        // Para ello el programadebe:
        //- pedir el número de participantes (de ser impar saltará un fallo)
        //- pedir el nombre de cada uno de los participantes
        //- sacar por pantalla el orden de las parejas resultantes


        Scanner scanner = new Scanner(in);
        System.out.println("Dime la cantidad de participantes (tiene que ser un número par)");
        int numeropar = scanner.nextInt();
        while ((numeropar%2)==1){
            System.out.println("Número incorrecto, escribe un número par");
            numeropar = scanner.nextInt();
        }

        String[] nombres = new String[numeropar];
        String[] nombresSacados = new String[numeropar];

        for (int i = 0; i < numeropar; i++) {
            System.out.println("Escribe el nombre de un participante");
            nombres[i] = scanner.next();
        }

        for (int i = 0; i < numeropar; i++) {

            do{nombresSacados[i] = nombres[(int)(Math.random()*(numeropar))];}
            while (repetido(nombresSacados,i));

        }

        for (int i = 0; i < numeropar-1; i+=2) {
            System.out.println(nombresSacados[i]+" dará su regalo a: "+ nombresSacados[i+1]);
        }



    }
    public static boolean repetido (String[] personas, int x){
        boolean repetidos = false;
        for (int i = 0; i < personas.length; i++) {
            if(personas[x].equals(personas[i]) && x!=i){
                repetidos= true;
                return repetidos;
            }
        }
        return repetidos;
    }
}
