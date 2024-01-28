package ejercicios.ejercicioClase2.controler;

import ejercicios.ejercicioClase2.model.Trabajador;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> trabajadoresLista;

    public Empresa() {
        trabajadoresLista = new ArrayList<>();
    }

    public void agregarTrabajador(){
        System.out.println("Qué tipo de trabajador quieres añadir?");
        System.out.println("1.");

    }


}
