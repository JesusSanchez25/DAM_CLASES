package ArrayListEjercicios.GarajeCoches;

import ArrayListEjercicios.GarajeCoches.Metodos.Metodos;
import ArrayListEjercicios.MarcaCoches.Ejercicios.*;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    // 1. (Garaje) Desarrollar una aplicación para el control de un garaje. El funcionamiento de la aplicación será desde consola mediante un menú que permita acceder a las diferentes opciones. Para la aplicación tendremos que tener en cuenta las siguientes cosas:
    //- Un coche está formado por los siguientes atributos: marca (string) modelo (string), coste reparacion (int), matricula (string).
    //
    //Las opciones de la aplicación serán las siguientes:
    //
    //- Añadirá un coche al taller, pidiéndome todos los datos necesarios. No se pueden añadir dos coches con la misma matricula
    //- Listar coches
    //- Buscar coches: Se pedirá una matrícula y se mostrarán los datos del coche.
    //- Mostrar costes: Se mostrará el coste acumulado de todos los coches de la lista.
    //- Eliminar coche: Se pedirá una matrícula y se eliminará el coche de la lista
    //- Vaciar garaje: Eliminará todos los coches de la lista

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(in);
        Object[] coche = new Object[4];



        int respuesta;


       do {
           System.out.println("Elige la opción que deseas realizar");
           System.out.println("1. Añadir coche ");
           System.out.println("2. listar coches ");
           System.out.println("3. buscar coche ");
           System.out.println("4. Mostrar costes ");
           System.out.println("5. Eliminar coche ");
           System.out.println("6. Vaciar garaje ");
           System.out.println("7. Salir");

           respuesta = scanner.nextInt();


           switch (respuesta){
               case 1:
                   System.out.println("Inserte la marca, el modelo, el coste de reparación y la matrícula *Entre comas*");
                   scanner.nextLine();
                   String input = scanner.nextLine();
                   String[] partes = input.split(",");
                   coche[0] = partes[0].trim();
                   coche[1] = partes[1].trim();
                   coche[2] = Integer.parseInt(partes[2].trim());
                   coche[3] = partes[3].trim();
                   metodos.añadirCoche(coche);
                   break;


               case 2:
                   metodos.listarCoches();
                   break;

               case 3:
                   System.out.println("Inserte la matrícula que quieras buscar");
                   metodos.buscarCoches(scanner.next());
                   break;

               case 4:
                    metodos.mostrarCostes();
                   break;

               case 5:
                   System.out.println("Inserte la matrícula del coche que quiers eliminar ");
                   String matricula = scanner.next();
                   metodos.eliminarCoche(matricula);
                   break;


               case 6:
                   metodos.vaciarGaraje();
                   System.out.println("Garaje vaciado con éxito");
                   break;

               case 7:
                   System.out.println("Saliendo...");
                   break;

               default:
                   System.out.println("Número introducido no se encuentra entre las opciones ");




        }} while (respuesta != 7);












    }


}
