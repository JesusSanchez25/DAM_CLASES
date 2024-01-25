package ejercicios;

import ejercicios.ejercicio0.model.Triangulo;

public class Entrada {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 5);

        System.out.println(triangulo.calcularArea());
    }

}
