package ejercicios.ejercicioClase1.model;

public final class Libro extends Multimedia{

    private String ISBN;
    private int numeroPag;
    public Libro() {}

    public Libro(int tamano, String titulo, String autor, String formato, String ISBN, int numeroPag) {
        super(tamano, titulo, autor, formato);
        this.ISBN = ISBN;
        this.numeroPag = numeroPag;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo: Libro");
        super.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Número de páginas:: " + numeroPag);

    }
}
