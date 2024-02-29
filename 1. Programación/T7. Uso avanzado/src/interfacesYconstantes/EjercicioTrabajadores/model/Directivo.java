package interfacesYconstantes.EjercicioTrabajadores.model;

import interfacesYconstantes.EjercicioTrabajadores.constantes.Constantes;
import interfacesYconstantes.EjercicioTrabajadores.interfaz.Votantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Directivo extends Personal implements Votantes {

    public int responsabilidad;
    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni, int responsabilidad) {
        super(nombre, apellido, dni);
        this.responsabilidad = responsabilidad;
    }

    @Override
    public int votar() {
        return Constantes.voto*2;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Resondabilidad: " + responsabilidad);
    }


    public int getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(int responsabilidad) {
        this.responsabilidad = responsabilidad;
    }
}
