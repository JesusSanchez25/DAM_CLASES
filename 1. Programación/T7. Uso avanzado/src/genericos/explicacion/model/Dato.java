package genericos.explicacion.model;

import java.util.List;

public class Dato<T extends Number,S, V> {

    private T dato;
    private int instancia;
    public Dato() {
    }

    public Dato(T dato, int instancia) {
        this.dato = dato;
        this.instancia = instancia;
    }

    public void mostrarDatos(){}

    public S registrarDato(){

        return null;
    }
}
