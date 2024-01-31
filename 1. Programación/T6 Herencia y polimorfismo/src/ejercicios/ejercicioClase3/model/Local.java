package ejercicios.ejercicioClase3.model;
import ejercicios.ejercicioClase3.constantes.Constantes;

public class Local extends Llamada{

    public Local() {
    }

    public Local(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    @Override
    public int calcularCoste() {
        // Lo dejo así por si algún día cuesta dinero una llamada local
        return getDuracion()*Constantes.costeLocal;
    }
}
