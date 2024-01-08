package ejercicios.Base5;

import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {
        //Modifica el ejercicio anteriore para que el IMC se pueda calcular según el genero de la persona.
        // En este caso, para poder calcular el IMC según genero se utilizan las siguientes tablas

        Scanner scanner = new Scanner(in);

        System.out.println("Ingrese nombre, apellido, dni, edad, peso, altura y género (m/f)");
        Persona persona1 = new Persona(
                scanner.next(),
                scanner.next(),
                scanner.next(),
                scanner.nextInt(),
                scanner.nextDouble(),
                scanner.nextInt(),
                scanner.next()
        );

        persona1.calcularImc();


    }
}
