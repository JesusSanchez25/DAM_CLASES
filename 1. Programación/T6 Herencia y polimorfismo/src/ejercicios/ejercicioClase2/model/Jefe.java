package ejercicios.ejercicioClase2.model;

public final class Jefe extends Trabajador{

    private int acciones, beneficio;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, int acciones, int beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }
}
