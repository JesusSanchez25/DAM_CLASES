package ejercicios.ejercicioClase2.model;

public class Contratados extends Trabajador{
    private int sueldo;
    private boolean contratado;

    public Contratados() {
    }

    public Contratados(String nombre, String apellido, String dni, int sueldo, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario anual: " + sueldo*12);

    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
