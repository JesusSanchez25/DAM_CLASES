package excepciones.ejercicioExcepcionMultiples;

import excepciones.ejercicioExcepcionMultiples.model.Persona;

import java.util.InputMismatchException;

public class Entrada {

    public static void main(String[] args) {

        try {
            Persona persona = new Persona("Pedro", 2000);
            System.out.println(persona.getNombre());
        } catch (InputMismatchException e){
            System.out.println("La edad debe de ser un número");
        }


    }


}
