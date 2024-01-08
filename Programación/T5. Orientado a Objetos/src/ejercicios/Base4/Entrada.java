package ejercicios.Base4;


import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {
        //5. En la clase entrada creada en el ejercicio 2 crear los siguiente
        //    - La persona que tiene todos los datos (p1) muestra por pantalla su IMC
        //    - Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona. Para ello hay que tener en cuenta lo siguiente


        ArrayList<Persona> personas = new ArrayList<>();

        Scanner scanner = new Scanner(in);

        System.out.println("Ingrese nombre, apellido, dni, edad, peso y altura de una persona:");
        Persona persona1 = new Persona(
                scanner.next(),
                scanner.next(),
                scanner.next(),
                scanner.nextInt(),
                scanner.nextDouble(),
                scanner.nextInt()
        );


        Persona persona2 = new Persona("Juanjo", "Fernandez");
        Persona persona3 = new Persona();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);


        persona1.calcularImc();

    }
}
