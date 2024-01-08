import java.util.Scanner;

import static java.lang.System.in;

public class PracticaExamen {
    public static void main(String[] args) {
        //Clase Libro:
        //
        //Crea una clase Libro con los siguientes atributos: id (único), titulo, autor, prestado (booleano),
        // usuarioPrestamo (nombre del usuario que lo tiene prestado, nulo si no está prestado).
        //Implementa los métodos necesarios para acceder y modificar estos atributos.
        //Clase Biblioteca:
        //
        //Crea una clase Biblioteca que almacene una colección de libros.
        //Implementa un método para agregar un libro al catálogo.
        //Implementa un método para prestar un libro a un usuario (marcarlo como prestado y registrar el nombre del usuario).
        //Implementa un método para devolver un libro (marcarlo como no prestado y eliminar el nombre del usuario).
        //Implementa un método para mostrar la información de todos los libros en el catálogo.
        //Programa Principal:
        //
        //En el programa principal, crea una instancia de la clase Biblioteca.
        //Agrega algunos libros al catálogo.
        //Realiza algunas operaciones de préstamo y devolución de libros.
        //Muestra la información actualizada del catálogo.
        //Desafío Opcional:
        //
        //Implementa un método para buscar libros por autor en la clase Biblioteca.
        //Implementa un método para mostrar los libros prestados y quién los tiene en la clase Biblioteca.

        Scanner scanner = new Scanner(in);
        MetodosPracticaExamen metodos = new MetodosPracticaExamen();
        int respuesta;
        int idLibro = 1;

        do {
            System.out.println("Elige una opción del menú");
            System.out.println("1. Agregar libro a la biblio");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar catálogo");
            System.out.println("5. Salir");
            respuesta = scanner.nextInt();

            switch (respuesta){
                //Crea una clase Libro con los siguientes atributos: id (único), titulo, autor, prestado (booleano),
                // usuarioPrestamo (nombre del usuario que lo tiene prestado, nulo si no está prestado).
                //Implementa los métodos necesarios para acceder y modificar estos atributos.
                //Clase Biblioteca:
                //

                case 1:
                    Object[] libro = new Object[5];
                    libro[0] = idLibro;
                    System.out.println("Escriba el titulo del libro que quieras añadir");
                    scanner.nextLine();
                    libro[1] = scanner.nextLine();
                    System.out.println("Escriba el autor del libro que quieras añadir");
                    libro[2] = scanner.nextLine();

                    libro[3] = false;
                    libro[4] = "";

                    metodos.agregarLibro(libro);
                    break;
                case 2:
                    //Prestar libro
                    System.out.println("Inserte el id del libro que quieres prestar");
                    int id = scanner.nextInt();
                    System.out.println("Inserte el nombre de la persona a la que se le va a prestar el libro");
                    String nombre = scanner.nextLine();

                    metodos.prestarLibro(id, nombre);

                    break;
                case 3:
                    //Implementa un método para devolver un libro (marcarlo como no prestado y eliminar el nombre del usuario).
                    System.out.println("Inserte el id del elibro devuelto");
                    id = scanner.nextInt();
                    metodos.devolverLibro(id);


                    break;
                case 4:
                    metodos.mostrarLibros();
                    break;
                case 5:
                    //mostrar libros por autor
                    break;
            }

        } while (respuesta!=5);

    }
}
