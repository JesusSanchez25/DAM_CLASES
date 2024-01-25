package ejercicios.ejercicioClase1.model;

public class Libro extends Multimedia{

    private String ISB,numeroPag;
    public Libro() {}

    public Libro(int identificador, int tamano, String titulo, String director, String formato, String ISB, String numeroPag) {
        super(identificador, tamano, titulo, director, formato);
        this.ISB = ISB;
        this.numeroPag = numeroPag;
    }
}
