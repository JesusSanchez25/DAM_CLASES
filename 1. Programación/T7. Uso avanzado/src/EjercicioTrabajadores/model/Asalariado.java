package EjercicioTrabajadores.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asalariado extends Trabajador{
    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, int sueldo) {

        super(nombre, apellido, dni, sueldo);
        setSueldo(calcularSueldo(sueldo));

    }
}
