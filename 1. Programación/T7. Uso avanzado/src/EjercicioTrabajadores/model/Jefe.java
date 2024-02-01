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

    public Jefe(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
        setSueldo(calcularSueldo(sueldo));
    }

    @Override
    public int votar() {
        return Constantes.voto/2 + beneficio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones: " + acciones);
    }

    @Override
    public int calcularSueldo(int sueldo) {
        return (int)(sueldo-(sueldo*0.2));
    }




}
