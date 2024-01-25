package ejercicios;

import ejercicios.ejercicio1.model.Figura;
import ejercicios.ejercicio1.model.Triangulo;
import org.w3c.dom.ls.LSOutput;

public class Entrada {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 5);

        System.out.println(triangulo.calcularArea());
    }

}
