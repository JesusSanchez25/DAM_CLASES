package ejercicioBiblioteca.model;

public class Revista extends Formato {
    private String ISBN;

    public Revista(String seccion, String titulo, String ISBN) {
        super(seccion, titulo);
        this.ISBN = ISBN;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
