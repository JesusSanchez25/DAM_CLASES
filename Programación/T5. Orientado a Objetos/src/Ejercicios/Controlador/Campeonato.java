/*package Ejercicios.Controlador;

import Ejercicios.Controlador.Carrera;
import Ejercicios.model.Circuito;
import Ejercicios.model.Coche;

import java.util.ArrayList;

public class Campeonato {

    private String nombre;
    private Coche campeon;
    private ArrayList<Coche> listaParticipantes;
    private ArrayList<Carrera> listaCarreras;


    public Campeonato (){}

    public Campeonato(String nombre){
        this.nombre = nombre;
        this.listaParticipantes = new ArrayList<>();
        this.listaCarreras = new ArrayList<>();
    }


    public void añadirCarrera (Carrera carrera){

        this.listaCarreras.add(carrera);
    }

    // Este guarda en el Arraylist para luego pasar ese arraylist a la carrera
    public void inscribirParticipante(Coche participante){

        if (this.listaParticipantes.size()<21){

            if (estaCoche(participante.getMatricula())==-1){
                listaParticipantes.add(participante);
                System.out.println("Agregado correctamente");
            } else {
                System.out.println("Esa matrícula ya ha sido implementada antes");
            }

        } else {
            System.out.println("No se ha podido añadir el coche, no caben más participantes");
        }



    }


    private int estaCoche (String matricula){
        for (Coche coche : this.listaParticipantes) {
            if (matricula.equals(coche.getMatricula())){
                return listaParticipantes.indexOf(coche);
            }
        }

        return -1;
    }


    public void descalificarParticipantes(String matricula){

        int index = estaCoche(matricula);
        if (index==-1){
            listaParticipantes.remove(index);
            System.out.println("El participante se ha eliminado con éxito");
        } else {
            System.out.println("No se ha encontrado la matrícula a eliminar");
        }


    }

    public void agregarCarrera(Carrera carrera){
        // podríamos poner algún tipo de restricción aquí si fuese necesario
        listaCarreras.add(carrera);

    }


    // Muestra los participantes con sus puntos
    public void mostrarDatos(){
        // El campeonato con nombre: 'nombres' tiene los siguientes datos:
            //Participantes:
                //nombres matrícula
                // nombre matrícula
            // Carreras
                // nombre(circuito) vueltas km
                // nombre vueltas km

        System.out.printf("El campeonato con nombre: %s tiene los siguietnes datos:\n", this.nombre);
        System.out.printf("\tParticipantes:\n");

        System.out.printf("\tCarreras:");
        for (Coche item : listaParticipantes) {
            System.out.printf("\t\t nombre: %s, matrícula: \n", item.getNombre(), item.getMatricula());
        }

        System.out.printf("\tCarreras:");
        for (Carrera item : listaCarreras) {
            System.out.printf("\t\t nombre: %s, vueltas: %s, %d:\n",
                    item.getCircuito(),item.getCircuito().getVueltas(), item.getCircuito().getKmTotales());
        }

        }

    public void resetearKm ()

    public void iniciarCampeonato(){
        // inscribir participantes en carrera
        // correr la carrera

        for (Carrera item : listaCarreras) {
            System.out.printf("Procedemos a correr la carrera en: %s\n",item.getCircuito().getNombre());
            item.iniciarCarrera();
        }

        // Como teniamos un Arraylist de participantes creado ya en CARRERA
        // Puedes usar esa variable y pasarles el Arraylist entero.
        for ( Carrera item : listaCarreras) {
            item.setParticipantes(listaParticipantes);

        }



    }



    public void agregarCarrera(){}






    }


*/


