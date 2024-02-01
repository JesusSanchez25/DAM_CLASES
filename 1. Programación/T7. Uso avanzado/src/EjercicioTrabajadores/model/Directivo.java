package EjercicioTrabajadores.model;

import EjercicioTrabajadores.constantes.Constantes;
import EjercicioTrabajadores.interfaz.Votantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Directivo extends Personal implements Votantes {

    public boolean porcentajeResponsabilidad;
    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public int votar() {
        return Constantes.voto*2;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Responsabilidad " + porcentajeResponsabilidad + "%");
    }
}
