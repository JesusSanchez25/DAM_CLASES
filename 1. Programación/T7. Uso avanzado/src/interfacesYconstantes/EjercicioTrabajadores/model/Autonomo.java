package interfacesYconstantes.EjercicioTrabajadores.model;

import interfacesYconstantes.EjercicioTrabajadores.constantes.Constantes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Autonomo extends Trabajador{

    private int cuotaSS;
    private boolean contratado;
    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo, int cuotaSS, boolean contratado) {
        super(nombre, apellido, dni, sueldo);
        this.cuotaSS = Constantes.cuotaSS;
        this.contratado = contratado;
        setSueldo(calcularSueldo());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public int calcularSueldo() {
        return (getSueldo() - (12 * Constantes.cuotaSS));
    }

    public int getCuotaSS() {
        return cuotaSS;
    }

    public void setCuotaSS(int cuotaSS) {
        this.cuotaSS = cuotaSS;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
