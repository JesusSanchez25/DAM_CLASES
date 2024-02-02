package EjercicioTrabajadores.model;

import EjercicioTrabajadores.constantes.Constantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asalariado extends Trabajador{

    private int numPagas;
    private boolean contratado;
    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int numPagas, boolean contratado) {
        super(nombre, apellido, dni, sueldo);
        this.numPagas = numPagas;
        this.contratado = contratado;
        setSueldo(calcularSueldo());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numro de pagas: " + numPagas);
        System.out.println("Contratado: " + contratado);

    }


    @Override
    public int calcularSueldo() {
        return (int)(getSueldo() - getSueldo()* Constantes.retencion);
    }
}
