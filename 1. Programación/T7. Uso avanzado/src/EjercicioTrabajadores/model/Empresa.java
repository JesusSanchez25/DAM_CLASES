package EjercicioTrabajadores.model;

import EjercicioTrabajadores.interfaz.Votantes;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Personal> listaPersonas;


    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Personal personal){
        // restriccion -> por dni si está o no

        for (Personal item : listaPersonas) {
            if (item.getDni().equals(personal.getDni())){
                item.mostrarDatos();
            }
        }

        listaPersonas.add(personal);



    }

    public void mostrarTrabajadores(){
        for (Personal item : listaPersonas) {
            if (item instanceof Trabajador){
                item.mostrarDatos();
            }
        }
    }

    public void realizarVotacion(){
        int numeroVotos = 0;

        for (Personal item : listaPersonas) {
            if (item instanceof Votantes){
                numeroVotos += ((Votantes) item).votar();
            }
        }

    }


}
