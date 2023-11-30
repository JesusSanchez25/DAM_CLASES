package Jesus_Sanchez_DAM1_24_11.Ejercicio2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    //2. (3 puntos) Crea un programa que permita calificar de forma aleatoria a alumnos.
    //Para ello el programa nada más iniciar pedirá el número de alumnos de la clase
    //y los nombres de cada uno de ellos. Una vez hecho esto pedirá confirmación de
    //si se quiere empezar a calificar. Una vez confirmado el sistema calificará entre 1-
    //10 a los alumnos. Una vez terminado el proceso, el sistema dará las opciones de:
    //a. Ver suspensos: mostrará el nombre y nota de los alumnos suspensos
    //b. Ver calificaciones: mostrará el nombre y nota de todos los alumos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        ArrayList<Object[]> alumnos = new ArrayList<>();
        System.out.println("Inserte el número de alumnos");
        int numAlumnos = scanner.nextInt();


        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Inserte el nombre del alumno");
            Object[] alumnoNota = new Object[]{scanner.next(),-1};
            alumnos.add(alumnoNota);
        }

        System.out.println("Estás seguro de que quieres empezar a calificar aleatoriamente a todos los alumnos?");
        System.out.println("Pula Y para empezar a calificar y cualquier otra tecla para salir");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("y")){
            for (int i = 0; i < numAlumnos; i++) {
                alumnos.get(i)[1]=(int)(Math.random()*10)+1;
            }

            int opcion;
            do {

                System.out.println("Inserte la opción que desees realizar");
                System.out.println("1.Ver todos los suspensos y sus respectivas notas");
                System.out.println("2.Ver todas las notas");
                System.out.println("3.Salir");
                opcion = scanner.nextInt();

                switch (opcion){
                    //A
                    case 1:
                        for (int i = 0; i < numAlumnos; i++) {
                            if ((int)alumnos.get(i)[1]<5){
                                System.out.println("Nombre: "+ alumnos.get(i)[0] + ", Nota: " + alumnos.get(i)[1]);
                            }
                        }

                        break;

                     //B
                    case 2:
                        for (int i = 0; i < numAlumnos; i++) {
                            System.out.println("Nombre: "+ alumnos.get(i)[0] + ", Nota: " + alumnos.get(i)[1]);
                        }
                        break;


                    case 3:
                        break;

                    default:
                        System.out.println("Inserte un número válido");



                }

            } while (opcion !=3);

        }

        System.out.println("Saliendo...");







    }


}
