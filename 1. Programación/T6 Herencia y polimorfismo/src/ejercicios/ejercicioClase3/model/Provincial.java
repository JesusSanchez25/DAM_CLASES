package ejercicios.ejercicioClase3.model;

import ejercicios.ejercicioClase3.constantes.Constantes;

public class Provincial extends Llamada{

    public Provincial() {
    }

    public Provincial(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);

    }

    @Override
    public int calcularCoste() {
        return getDuracion()* Constantes.costeProvincial;
    }

}
