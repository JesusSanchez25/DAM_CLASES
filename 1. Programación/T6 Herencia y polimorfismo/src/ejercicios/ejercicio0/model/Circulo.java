package ejercicios.ejercicio0.model;

import ejercicios.ejercicio0.model.Figura;

public class Circulo extends Figura {
    private int radio, diametro;

    public Circulo() {
    }
    public Circulo(int radio, int diametro) {
        this.radio =radio;
        this.diametro=diametro;
    }

    @Override
    public int calcularArea() {
        return (int)(Math.PI*Math.pow(radio,2));
    }


}
