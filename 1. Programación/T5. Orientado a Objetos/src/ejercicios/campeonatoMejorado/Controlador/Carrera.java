package ejercicios.campeonatoMejorado.Controlador;

import ejercicios.campeonatoMejorado.model.Circuito;
import ejercicios.campeonatoMejorado.model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carrera {

    private Circuito circuito;
    private Coche ganador;
    private ArrayList<Coche> participantes;

    public Carrera() {
    }

    public Carrera(Circuito circuito) {
        this.circuito = circuito;
        // ganador = null
        this.participantes = new ArrayList<>();
    }

    // crear un metodo mostrarDatos
    // Esta carrera se corre en XXX.
    // Los datos de la carrera son:
    // KM totales: XXX
    // Vueltas: XXX
    // Nº participantes: XXX

    public void mostrarDatos() {
        System.out.println("Los datos de la carrera son:");
        System.out.println("KM: " + circuito.getKmTotales());
        System.out.println("Curvas: " + circuito.getCurvas());
        System.out.println("Nº de participantes: " + participantes.size());
    }

    // inscribir un participante
    // obtengo como parametro un coche
    // no puede haber dos participantes con la misma matricula
    // como máximo hay 20 participantes
    // si un participante se inscribe -> Participante inscrito con existo
    // si no puede se inscribe -> Problema en la inscripcion


    public void decidirGanador() {

        for (Coche item : participantes) {
            if (item.getKm() > circuito.getKmTotales() && ganador==null){
                ganador = item;

            } else if (ganador!=null) {
                if (ganador.getKm()<item.getKm()){
                    ganador=item;
                }
            }
        }






    }

    public void resetear(){
        for (Coche coche : participantes ) {
            coche.setKm(0);
            coche.setVelocidad(0);
        }
    }

    private void acelerarCoches(){

        for (Coche item : participantes) {

            int velocidadAcelerada = (int) (Math.random() * 100) + 10;

            item.acelerar(velocidadAcelerada);

            // Los coches frenan en caso de encontrarse con una curva
            if (pasaCurva(item.getVelocidad(), item)){
                item.setVelocidad(20);
                System.out.println("acaba de pasar una curva");
            };






        }


    }

    private boolean pasaCurva (int distanciaRecorrida, Coche coche){

            // Calcula si en la distancia que acaba de recorrer el coche se ha topado con alguna de las
            // curvas del circuito
            for (int i = 0; i < circuito.getCurvas(); i++) {
                if (coche.getKm()>=circuito.getLocalizacionCurvas().get(i)
                        && (coche.getKm()-distanciaRecorrida) <= (circuito.getLocalizacionCurvas().get(i))){
                    return true;
                };
            }
            return false;

    }

    public static void limpiarPantalla (){

        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }

    }



    public void iniciarCarrera() {



        // Presentación de la carrera
        System.out.println("\nProcedemos a correr la carrera en -"
                + circuito.getNombre()+"-:");
        mostrarDatos();
        pararTiempo(5);
        limpiarPantalla();

        while (ganador == null) {
            acelerarCoches();

            decidirGanador();

            mostrarCarrera();



            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(1*1500);
            } catch (Exception e) {
                System.out.println("e");
            }

            if(ganador == null){limpiarPantalla();
            } else {pararTiempo(2);}
        }



        // Muestra el GANADOR y los datos finales de la carrera
        System.out.printf("\nEl ganador de la carrera es '%s' con %dkm.\n", ganador.getNombre(), ganador.getKm());
        System.out.println("Estos han sido los resultados finales de la carrera:");
        mostrarParrilla();

            pararTiempo(5);


        // Reparte los puntos para la clasificación del campeonato
        limpiarPantalla();
        repartirPuntos();

        // Resetea todos los coches
        resetear();




    }

    public void repartirPuntos(){
        ordenarParrilla();
        // primero 10 puntos más
        participantes.get(0).setPuntos(participantes.get(0).getPuntos()+10);
        participantes.get(1).setPuntos(participantes.get(1).getPuntos()+5);
        participantes.get(2).setPuntos(participantes.get(2).getPuntos()+2);
    }

    public void inscribirParticipante(Coche coche) {
        if (participantes.size() == 20) {
            System.out.println("Hay un error en la inscripcion: plazas insuficientes");
        } else {
            // esta la matricula del coche que quiero agregar en la lista?
            // true o false
            if (estaCoche(coche.getMatricula()) != null) {
                System.out.println("Hay un error en la inscripcion. Datos duplicados");
            } else {
                participantes.add(coche);
            }
        }
    }

    public void pararTiempo(int segundos){
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(segundos*1000);
        } catch (Exception e) {
            System.out.println("e");
        }
    }

    private Coche estaCoche(String matricula) {

        Coche coincideCoche = null;
        // recorre la lista y pregunta por las matriculas
        for (Coche coche : this.participantes) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                coincideCoche = coche;
                break;
            }
        }
        return coincideCoche;
    }

    public void descalificarParticipante(String matricula) {
        // esta el coche en la lista?
        // coche

        Coche cocheEncontrado = estaCoche(matricula);

        if (cocheEncontrado != null) {
            participantes.remove(cocheEncontrado);
            System.out.println("El coche se ha borrado ok");
        } else {
            System.out.println("No esta");
        }

        /*if (participantes.remove(estaCoche(matricula))){
            System.out.println("Borrado correctamente");
        }else {
            System.out.println("No esta");
        }*/
    }


    public void ordenarParrilla(){
        Collections.sort(participantes, new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getKm() < o2.getKm()) {
                    return 1;
                } else if (o1.getKm() > o2.getKm()) {
                    return -1;
                }
                return 0;
            }
        });
    }
    public void mostrarParrilla() {

        ordenarParrilla();

        for (int i = 0; i < participantes.size(); i++) {
            System.out.printf("%d - %s con %d km\n", i + 1, participantes.get(i).getNombre()
                    , participantes.get(i).getKm());
        }
        System.out.println("");

        /*int posicion = 1;
        for (Coche item: participantes) {
            System.out.printf("%d %s\n",posicion,item.getNombre());
            posicion++;
        } */
    }

    public void mostrarCarrera() {

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Coche item : participantes) {
            for (int i = 0; i < (double)item.getKm() / circuito.getKmTotales() * 155; i++) {
                System.out.print("=");
                if (i==155){break;}
            }
            System.out.print(item.getSimbolo());
            if (item==ganador){
                System.out.print("\t GANADOR");
            }
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }    }


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


