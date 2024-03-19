package model;

import exception.LibroException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca <T extends Libro>{

    private Catalogo catalogo;
    private String nombre, director;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }

    public void construirCatalogo(int almacenamiento) throws NullPointerException{
        catalogo = new Catalogo<T>(almacenamiento);
    }

    public void mostrarLibros() throws NullPointerException{
        catalogo.mostrarLibros();
    }

    public void agregarLibro(T libro) throws LibroException, NullPointerException{
            catalogo.agregarLibros(libro);


    }

    public void consultarNumeroLibros() throws NullPointerException{
        catalogo.consultarNumeroLibros();
    }

    public void buscarLibro(int ISBN) throws LibroException, NullPointerException{
        catalogo.buscarLibro(ISBN);
    }

    public void sacarLibro(int ISBN) throws LibroException{
        catalogo.sacarLibro(ISBN);
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    class Catalogo<S extends Libro>{

        private ArrayList<S> almacen;
        int almacenamientoMaximo;

        public Catalogo() {
        }

        public Catalogo(int almacenamiento) {
            this.almacen = new ArrayList<>(almacenamiento);
            almacenamientoMaximo = almacenamiento;
        }

        public void mostrarLibros(){
            for (S libro : almacen) {
                libro.mostrarDatos();
                System.out.println("");
            }
        }

        public void agregarLibros(S libro) throws LibroException{
            for (S item : almacen) {
                if (libro.getISBN() == item.getISBN()){
                    throw new LibroException("Ese ISBN ya ha sido metido antes");
                }
            }

            if (almacen.size() < almacenamientoMaximo){
                System.out.println("Libro almacenado con éxito");
                almacen.add(libro);
            } else{
                throw new LibroException("Almacenamiento insuficiente");
            }

        }

        public void consultarNumeroLibros(){
            System.out.println("El número de libros actual es" + almacen.size());
        }


        public void buscarLibro(int ISBN) throws LibroException{
            for (S item : almacen) {
                if (item.getISBN() == ISBN){
                    System.out.println("Libro encontrado");
                    item.mostrarDatos();

                } else {
                    throw new LibroException("Libro no encontrado");
                }

            }
        }




        public void sacarLibro(int ISBN) throws LibroException{
            for (S item : almacen) {
                if (item.getISBN() == ISBN){
                    System.out.println("Libro encontrado");
                    almacen.remove(item);
                    System.out.println("Libro eliminado con éxtio");

                } else {
                    throw new LibroException("Libro no encontrado");
                }

            }
        }



    }
}