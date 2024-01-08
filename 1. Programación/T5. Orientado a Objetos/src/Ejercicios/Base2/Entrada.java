package ejercicios.Base2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {
    public static void main(String[] args) {
        //2. Crear una clase llamada entrada que tenga un método main el cual:
        //    - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
        //    - Cree la persona asociada a los datos leídos por teclado (p1)
        //    - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
        //    - Crear una persona sin datos asociados
        //    - Mostrar los datos de todas las personas
        //    - Modificar la edad de todas las personas a 20

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



        for (Persona item : personas) {
            System.out.printf("Nombre: %s\n", item.getNombre());
            System.out.printf("apellido: %s\n", item.getApellido());
            System.out.printf("dni: %s\n", item.getDni());
            System.out.printf("edad: %s\n", item.getEdad());
            System.out.printf("peso: %s\n", item.getPeso());
            System.out.printf("altura: %s\n", item.getAltura());
        }

        for (Persona item : personas) {
            item.setEdad(20);
        }





    }
}
