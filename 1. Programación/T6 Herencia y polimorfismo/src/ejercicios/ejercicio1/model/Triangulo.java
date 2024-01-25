package ejercicios.ejercicio1.model;

public class Triangulo extends Poligono{

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        return getBase()*getAltura()/2;
    }
}
