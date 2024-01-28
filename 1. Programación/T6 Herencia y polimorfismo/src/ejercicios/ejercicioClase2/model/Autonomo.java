package ejercicios.ejercicioClase2.model;

public class Autonomo extends Contratados {

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo, boolean contratado) {
        super(nombre, apellido, dni, sueldo, contratado);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

}
