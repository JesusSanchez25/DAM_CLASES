import java.util.ArrayList;

public class MetodosPracticaExamen {
    //Clase Libro:
    //
    //Crea una clase Libro con los siguientes atributos: id (único), titulo, autor, prestado (booleano), usuarioPrestamo (nombre del usuario que lo tiene prestado, nulo si no está prestado).
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


    ArrayList<Object[]> biblioteca = new ArrayList<>();
    public void agregarLibro (Object[] libro){
        biblioteca.add(libro);

    }

    public void prestarLibro (int id, String usuario){
        for (Object[] libro : biblioteca) {
            if ((int)libro[0]==id && !(boolean)libro[3]){
                System.out.println("El libro ha sido encontrado y establecido como prestado ");
                libro[3] = true;
                libro[4] = usuario;
            }else {
                System.out.println("No se ha encontrado el id del libro o el libro se encuentra prestado ");
        }}

    }

    public void devolverLibro (int id){
        for (Object[] libro : biblioteca) {
            if ((int)libro[0]==id && (boolean)libro[3]){
                System.out.println("El libro ha sido encontrado y establecido como devuelto ");
                libro[3] = false;
                libro[4] = "";


            } else {
                System.out.println("No se ha encontrado el id del libro o el libro se encuentra en la biblioteca ");
            }
        }
    }


    public void mostrarLibros (){
        for (Object[] libro : biblioteca) {
            for (Object item : libro) {
                System.out.print(item+", ");
            }
            System.out.println("");
        }

    }
}

