package ejercicios.ejercicio1.model;

public class Circulo extends Figura{
    private int r;
    public Circulo() {
    }

    @Override
    public int calcularArea() {
        return (int)(Math.PI*Math.pow(r,2));
    }
}
