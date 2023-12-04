package Estructura.modelo;

import Estructura.modelo.Persona;

import java.util.ArrayList;

public class Entrada {


    public static void main(String[] args) {

        Persona persona1 = new Persona("Borja", "Martín", 123);
        Persona persona2 = new Persona("Mek", "Martinez", 445, "javiermartinezherrera@gmail.char");
        Persona persona3 = new Persona(); // usa el tercer constructor que no hace nada

        // 1.Sacar personas
        // imprimir el nombre de la persona
        System.out.println(persona1.getNombre());

        //imprimir todos los datos de la persona
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();


        // 2. Forma actualizada de sacarlo
        //IMPORTANTE el ArrayList del nombre del objeto que has creado
        ArrayList<Persona> listaPersona = new ArrayList<>();

        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);

        //Sacar todos los datos de TODOS los utuarios
        for (Persona item : listaPersona) {
            // if (item instanceof Persona){
            // item.mostrarDatos();
            // }
            item.mostrarDatos();
        }

    }
}