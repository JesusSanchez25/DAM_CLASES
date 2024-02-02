package EjercicioTrabajadores.model;

import EjercicioTrabajadores.constantes.Constantes;
import EjercicioTrabajadores.interfaz.Votantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jefe extends Trabajador implements Votantes {

    private int acciones, beneficio;
    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, int sueldo, int beneficio, int acciones) {
        super(nombre, apellido, dni, sueldo);
        this.beneficio = beneficio;
        this.acciones = acciones;

        // Se calcula de nuevo el sueldo para haber assignado los Beneficios
        // si no cogería los beneficios como 0.
        setSueldo(calcularSueldo());
    }

    @Override
    public int votar() {
        return Constantes.voto/2;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones: " + acciones);
    }

    @Override
    public int calcularSueldo() {
        return beneficio + (int)(getSueldo()-(getSueldo()*0.2));
    }






}
