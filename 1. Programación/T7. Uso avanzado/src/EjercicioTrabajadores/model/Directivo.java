package EjercicioTrabajadores.model;

import EjercicioTrabajadores.interfaz.Votantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Directivo extends Personal implements Votantes {

    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void votar() {

    }
}
