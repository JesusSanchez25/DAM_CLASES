package ejercicios.ejercicio0.model;

public class Cuadrado extends Poligono{

    public Cuadrado(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        return getBase()*getAltura();
    }
}
