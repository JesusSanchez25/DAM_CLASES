package ejercicios.ejercicioClase2.model;

public final class Asalariado extends Trabajador{
    private int sueldo, numPagas;
    private boolean contratado;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int numPagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numPagas = numPagas;
        this.contratado = contratado;
    }
}
