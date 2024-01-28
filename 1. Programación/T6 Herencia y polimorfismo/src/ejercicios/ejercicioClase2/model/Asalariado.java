package ejercicios.ejercicioClase2.model;

public final class Asalariado extends Contratados{
    private int numPagas;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int numPagas, boolean contratado) {
        super(nombre, apellido, dni, sueldo, contratado);
        this.numPagas = numPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario mensual: " + getSueldo());
        System.out.println("Número de pagas: " + numPagas);

    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }


}
