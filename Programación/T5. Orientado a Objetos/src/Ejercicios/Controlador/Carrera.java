package Ejercicios.Controlador;

import Ejercicios.model.Circuito;
import Ejercicios.model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carrera {

    private Circuito circuito;
    private Coche ganador;
    private ArrayList<Coche> participantes;


    public Carrera(){}

    public Carrera(Circuito circuito, ArrayList<Coche> participantes){}

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
        ordenarParrilla();
        for (int i = 0; i < participantes.size(); i++) {
            System.out.printf("%d - %s, %d \n",i+1, participantes.get(i).getNombre(), participantes.get(i).getKm());
        }
    }

    public void decidirGanador(){

        // gana el primero de la lista porque se ordena en cada vuelta
        ganador = participantes.get(0);

        if (ganador.getKm() >= circuito.getKmTotales()){
            System.out.printf("El ganador de la carrera es %s con %dkm\n", ganador.getNombre(),ganador.getKm());
        } else {
            ganador = null;
            System.out.println("No hay ganador, ninguno ha llegado a la meta");

        }


    }

    public void repartirPuntos (){
        // primero 10 puntos más

        participantes.get(0).setPuntos(participantes.get(0).getPuntos()+10);
        participantes.get(1).setPuntos(participantes.get(1).getPuntos()+5);
        participantes.get(2).setPuntos(participantes.get(2).getPuntos()+2);


    }

    public void ordenarParrilla(){
        Collections.sort(participantes, new Comparator<Coche>() {
            @Override
            // sobreescribres un metodo para decirle como funciona
            // estamos usando esto para ordenar los coches de mas KM a menos
            public int compare(Coche o1, Coche o2) {

                //Si el 1º con el 2º, 1<2 se INVIERTEN
                if (o1.getKm() < o2.getKm()){
                    return 1;

                }
                //Si el 1º con el 2º, 1>2 se QUEDAN IGUAL
                else if(o1.getKm() > o2.getKm()){
                    return -1;
                }
                // Si son iguales no hace nada
                return 0;
            }
        });
    }

    public void mostrarClasificacion(){
        order

    }

    public void ordenarPorPuntos(){}

    public void resetearKm(){
        for (Coche item : participantes) {
            item.setKm(0);
        }
    }

    public void iniciarCarrera(){
        resetearKm();
        // La carrera se ejecutará según la cantidad de vueltas
        for (int i = 0; i < circuito.getVueltas(); i++) {
            System.out.println(" Vuelta " +(i+1));

            //cada coche acelera
            // Por cada coche en participantes acelera
            for (Coche item : participantes) {
             item.acelerar((int)(Math.random()*51)+25);
            }

            ordenarParrilla();
            mostrarParticipantes();

        }
        System.out.println("Vueltas oficiales terminadas");

        // Si no hay ganador -> vuelta extra
        // Si hay ganador -> muestro datos
        decidirGanador();

        while(ganador == null){
            System.out.println("Vuelta extra!!");
            for (Coche item : participantes) {
                item.acelerar((int)(Math.random()*50)+25);
            }


            ordenarParrilla();
            decidirGanador();
            mostrarParticipantes();
        }

            repartirPuntos();

    }

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


