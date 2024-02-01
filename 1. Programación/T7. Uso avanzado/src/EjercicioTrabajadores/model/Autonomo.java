package EjercicioTrabajadores.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autonomo extends Trabajador{

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    @Override
    public void calcularSueldo() {

    }
}
