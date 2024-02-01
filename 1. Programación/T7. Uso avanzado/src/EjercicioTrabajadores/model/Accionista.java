package EjercicioTrabajadores.model;

import EjercicioTrabajadores.interfaz.Votantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Accionista extends Personal implements Votantes {

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void votar() {

    }
}
