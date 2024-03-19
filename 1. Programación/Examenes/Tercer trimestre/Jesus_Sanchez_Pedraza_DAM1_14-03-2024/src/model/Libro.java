package model;

public abstract class Libro {

    private String autor;
    private int numPaginas, ISBN;

    public Libro() {
    }

    public Libro(String autor, int numPaginas, int ISBN) {
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public void mostrarDatos(){
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("ISBN: " + ISBN);


    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
