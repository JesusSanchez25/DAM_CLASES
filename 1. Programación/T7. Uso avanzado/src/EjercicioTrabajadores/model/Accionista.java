package EjercicioTrabajadores.model;

import EjercicioTrabajadores.interfaz.Votantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public final class Accionista extends Personal implements Votantes {

    private int acciones;

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, String dni, int acciones) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones: " + acciones);
    }


    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    @Override
    public int votar() {
        return 0;
    }
}
