package EjercicioTrabajadores.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autonomo extends Trabajador{

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo) {

        super(nombre, apellido, dni);
        setSueldo(calcularSueldo(sueldo));
    }

    @Override
    public int calcularSueldo(int sueldo) {
        return ((int)(sueldo()*0.8);;
    }



    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
