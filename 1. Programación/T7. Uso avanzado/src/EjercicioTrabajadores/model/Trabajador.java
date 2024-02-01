package EjercicioTrabajadores.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Trabajador extends Personal{

    private int sueldo;

    public Trabajador(){}

    public Trabajador(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: " + sueldo);
    }


    public int void calcularSueldo(int sueldo);


}
