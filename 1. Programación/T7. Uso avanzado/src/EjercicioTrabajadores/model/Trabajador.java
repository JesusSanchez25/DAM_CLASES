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
        // El sueldo se calcula en cada clase
    }

    public abstract int calcularSueldo();

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: " + sueldo);
    }


    public abstract int calcularSueldo(int sueldo);


    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
