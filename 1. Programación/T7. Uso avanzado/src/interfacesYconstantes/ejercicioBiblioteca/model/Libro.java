package interfacesYconstantes.ejercicioBiblioteca.model;

public class Libro extends Formato implements Prestables{

    private String ISBN, autor, editorial;
    private int numPaginas;

    public Libro(String seccion, String titulo, String ISBN, String autor, String editorial, int numPaginas) {
        super(seccion, titulo);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Isbn: " + ISBN);
        System.out.println("Autor: " + ISBN);
        System.out.println("Editorial: " + ISBN);
        System.out.println("Número de páginas: " + ISBN);
    }

    @Override
    public boolean prestar() {
        if (isEstado()){
            this.setEstado(false);
            System.out.println("Libro prestado correctametne");
            return true;
        } else {
            System.out.println("El libro no se encuentra disponible");
            return false;
        }
    }

    @Override
    public boolean devolver() {
        if (!isEstado()){
            this.setEstado(true);
            System.out.println("Libro devuelto correctametne");
            return true;
        } else {
            System.out.println("El libro ya está en la biblioteca");
            return false;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
