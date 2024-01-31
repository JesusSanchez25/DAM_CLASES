package ejercicios.ejercicioClase3.model;

public abstract class Llamada {

    private int coste, numOrigen, numDestino, duracion;

    public Llamada() {
    }

    public Llamada(int numOrigen, int numDestino, int duracion) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
        coste = calcularCoste();
    }

    public abstract int calcularCoste();

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(int numOrigen) {
        this.numOrigen = numOrigen;
    }

    public int getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
