package ejercicios.ejercicioClase1;

import ejercicios.ejercicioClase1.constantes.Constantes;
import ejercicios.ejercicioClase1.model.Audio;
import ejercicios.ejercicioClase1.controlador.Coleccion;
import ejercicios.ejercicioClase1.model.Libro;
import ejercicios.ejercicioClase1.model.Video;

import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {


        Coleccion coleccion1 = new Coleccion();

        Scanner scanner = new Scanner(in);
    int respuesta = 0;

        do {

            System.out.println("Elige lo que deseas hacer");
            System.out.println("1. Añadir multimedia");
            System.out.println("2. Eliminar multimedia");
            System.out.println("3. Listar multimedia");
            System.out.println("4. Buscar por autor");
            System.out.println("5. Buscar por actor");
            System.out.println("6. Buscar por director");
            System.out.println("7. Salir");
            respuesta = scanner.nextInt();

            int respuesta2 = 0;
            switch (respuesta){

                case 1:
                    System.out.println("Qué tipo de multimedia quiere agregar?");
                    System.out.println("1. Libro");
                    System.out.println("2. Video");
                    System.out.println("3. Audio");
                    respuesta2 = scanner.nextInt();

                    switch (respuesta2){
                        case 1: System.out.println("Inserte el tamaño, titulo, autor, ISBN y número de páginas separado por espacios");
                        coleccion1.agregarMultimedia(new Libro(scanner.nextInt(), scanner.next(), scanner.next(), Constantes.SOPORTE_PAPEL, scanner.next(), scanner.nextInt()));
                        break;

                        case 2:
                            System.out.println("Inserte el tamaño, titulo, autor, formato, 2 actores y el director");
                            coleccion1.agregarMultimedia(new Video());
                            break;

                        case 3:
                            System.out.println("Inserte el tamaño, titulo, autor, formato, duración y  soporte");
                            coleccion1.agregarMultimedia(new Audio(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.next()));
                            break;
                    }



                    break;
                case 2:
                    System.out.println("Di el id de la multimedia que quieres eliminar");
                    coleccion1.eliminarMultimedia(scanner.nextInt());
                    break;

                case 3:
                    System.out.println("Qué tipo de multimedia quiere listar?");
                    System.out.println("1. Libro");
                    System.out.println("2. Video");
                    System.out.println("3. Audio");
                    respuesta2 = scanner.nextInt();

                    switch (respuesta2){
                        case 1:
                            coleccion1.listarMultimedia(Libro.class);
                            break;
                        case 2:
                            coleccion1.listarMultimedia(Video.class);
                            break;
                        case 3:
                            coleccion1.listarMultimedia(Audio.class);
                            break;
                        default:
                            System.out.println("Inserte un número válido");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("En base a qué autor quieres buscar");
                    coleccion1.buscarPorAutor(scanner.next());
                break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce un número válido");
                    break;

            }

        } while (respuesta != 7);


    }
}
