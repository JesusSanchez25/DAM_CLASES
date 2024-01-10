package ejerciciosClase.ejercicioClase2;

import ejerciciosClase.ejercicioClase2.model.Circulo;
import ejerciciosClase.ejercicioClase2.model.Triangulo;

public class Entrada {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(4,4);
        Circulo circulo = new Circulo(5);

        System.out.println(triangulo.calcularArea());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularDiametro());

    }



}
