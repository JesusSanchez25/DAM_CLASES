import exception.LibroException;
import model.*;

public class Entrada {
    public static void main(String[] args) {

        Biblioteca<Terror> bibliotecaTerrorifica = new Biblioteca<>("Biblioteca pepito", "Pepito");
        Terror libroTerror = new Terror("Quevedo", 240, 2738, "Pegi 18");
        Terror libroTerror2 = new Terror("Quevedo", 240, 2730, "Pegi 18");
        Terror libroTerror3 = new Terror("Quevedo", 240, 2778, "Pegi 18");
        Terror libroTerror4 = new Terror("Quevedo", 240, 2718, "Pegi 18");
        Terror libroTerror5 = new Terror("Quevedo", 240, 218, "Pegi 18");

        bibliotecaTerrorifica.construirCatalogo(4);


        try {
            bibliotecaTerrorifica.agregarLibro(libroTerror);
            bibliotecaTerrorifica.agregarLibro(libroTerror);
            bibliotecaTerrorifica.agregarLibro(libroTerror3);
            bibliotecaTerrorifica.agregarLibro(libroTerror4);
            bibliotecaTerrorifica.agregarLibro(libroTerror5);


        } catch (NullPointerException e) {
            System.out.println("La bibliotecaTerrorifica no tiene catálogo, agrega un catálogo primero");
        } catch (LibroException e){
            System.out.println("Alguno de los libros que has introducido da problemas:");
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("\n");
            bibliotecaTerrorifica.mostrarLibros();

        } catch (NullPointerException e){
            System.out.println("No has creado el catálogo todavía");
        }


        Biblioteca<Libro> bibliotecaVariada = new Biblioteca("Biblioteca todo vale", "Juan");

    }
}
