package Ejercicios.Controlador;

import Ejercicios.model.Circuito;
import Ejercicios.model.Coche;

import java.util.ArrayList;

public class Carrera {

    private Circuito circuito;
    private Coche ganador;
    private ArrayList<Coche> participantes;


    public Carrera(){}

    public Carrera (Circuito circuito){
        this.circuito = circuito;
        // ganador = null

        this.participantes = new ArrayList<>();
    }

    //Mostrar datos
    public void mostrarDatos (){
        //esta carrera se corre en
        // Km totales = xxx
        // vueltas = xxx
        // Nº participantes = xxx

        System.out.println("Esta carrera se corre en: "+circuito.getNombre());
        System.out.println("Los kilómetros totales son: "+ circuito.getKmTotales());
        System.out.println("El número de vueltas es: "+ circuito.getVueltas());
        System.out.println("El número de participantes es: "+ participantes.size());


    }

    public void inscribirParticipante(Coche participante){

        if (this.participantes.size()<21){

            if (estaCoche(participante.getMatricula())==-1){
                participantes.add(participante);
                System.out.println("Agregado correctamente");
            } else {
                System.out.println("Esa matrícula ya ha sido implementada antes");
            }

        } else {
            System.out.println("No se ha podido añadir el coche, no caben más participantes");
        }



    }

    private int estaCoche (String matricula){
        for (Coche coche : this.participantes) {
            if (matricula.equals(coche.getMatricula())){
                return participantes.indexOf(coche);
            }
        }

        return -1;
    }

    public void descalificarParticipantes(String matricula){

        int index = estaCoche(matricula);
        if (index==-1){
            participantes.remove(index);
            System.out.println("El participante se ha eliminado con éxito");
        } else {
            System.out.println("No se ha encontrado la matrícula a eliminar");
        }


    }

    public void mostrarParticipantes(){
        for (int i = 0; i < participantes.size(); i++) {
            System.out.printf("%dº pariticipante: %s",i+1, participantes.get(i).getNombre());
        }
    }

    public void decidirGanador(){}
    public void empezarCarrera(){}



    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}


