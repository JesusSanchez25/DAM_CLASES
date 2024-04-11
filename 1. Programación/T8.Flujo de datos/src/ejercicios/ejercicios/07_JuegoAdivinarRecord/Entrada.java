package TODO_CASA.ejercicios.VIII_JuegoAdivinarRecord;

import TODO_CASA.OperacionesFicheros;

import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    //1. (JuegoAdivinar) Crea una aplicación de adivinación.
    // Para ello nada más empezar se pedirá el nombre del jugador y se generará un número aleatorio
    // entre 0 y 20. El sistema irá pidiendo números por teclado hasta que se acierte el número.
    // Cuando se adivine se deben producir las siguientes acciones:
    //    - Se escribe en un fichero llamado juego.txt el nombre del usuario y el número de intentos
    //    realizados con el siguiente formato: nombre, intentos (Borja,6)
    //    - Se preguntará si se quieren seguir introduciendo datos:
    //        - En caso de contestar si se volverán a pedir los mismos datos, crear el usuario y meterlo en la lista
    //        - En caso de contestar no se deberá pedir el nombre del siguiente concursante


    public static void main(String[] args) {
        // Nota: Está asignado a la hoja de registros del otro ejercicio
        String ruta = "src/TODO_CASA/ejercicios/VII_JuegoAdivinar/registro.txt";
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros(ruta);


        int respuesta = 0;
        Scanner scanner = new Scanner(in);
        while (respuesta!= 2){
            // PREPARATIVOS
            int intentos = 1;
            System.out.println("Escribe tu nombre");
            scanner = new Scanner(in);
            String nombre = scanner.nextLine();

            // RECORD
            System.out.println("El RECORD actual está en " + comprobarRecord(ruta));
            System.out.println("Crees que puedes superarlo??!?!?!");

            // EMPIEZA EL JUEGO
            int numeroRandom = (int)(Math.random()*21);
            System.out.println("Escribe un número del 0-20 para intentar adivinar");

            while (scanner.nextInt() != numeroRandom){
                System.out.println("Número equivocado, intenta de nuevo");
                intentos++;
            }

            // JUEGO TERMINADO
            System.out.println("\n\n");
            if (intentos < comprobarRecord(ruta)){
                // RECORD SUPERADO
                System.out.println("NO PUEDE SER");
                System.out.println("HAS SUPERADO EL RECORD DEL ANTIGUO CONTRINCANTE");
            }

            // NÚMERO ADIVINADO
            System.out.println("ENORABUENA GANADOR");
            System.out.println("Has tenido suerte esta vez trozo de meirda");
            System.out.println("Has ganado una palmadita en la espalda y un pañuelo mojado");
            System.out.println("Esperemos que lo hayas pasado bien (^.^)");
            operacionesFicheros.escribirInformacion(
                    "Nombre: " + nombre + "\n"
                    + "Intentos: " + intentos + "\n\n"
            );



            // OTRA PARTIDITA?
            System.out.println("Pulsa 1 para seguir jugando, 2 para salir");
            respuesta = scanner.nextInt();



        }




    }

    public static int comprobarRecord(String ruta){
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros(ruta);
        String[] lineas = operacionesFicheros.leerInformacion().split("\n");
        ArrayList<Integer> intentos = new ArrayList();

        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i].split(":")[0].equals("Intentos")){
               intentos.add(Integer.parseInt(lineas[i].split(":")[1].trim()));
            }
        }

        return Collections.min(intentos);


    }








}
