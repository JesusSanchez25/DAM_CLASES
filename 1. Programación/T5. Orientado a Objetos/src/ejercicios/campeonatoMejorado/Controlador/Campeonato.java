package ejercicios.campeonatoMejorado.Controlador;

import ejercicios.campeonatoMejorado.Entrada;
import ejercicios.campeonatoMejorado.model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato {

    private String nombre;
    private ArrayList<Carrera> listaCarreras;
    private ArrayList<Coche> listaParticipantes;
    private Coche campeon;


    public Campeonato() {
    }

    public Campeonato(String nombre) {
        this.nombre = nombre;
        this.listaCarreras = new ArrayList<>();
        this.listaParticipantes = new ArrayList<>();
    }

    // inscribirParticipantes
    // agregar un particiopante a la lista

    public void inscribirParticipante(Coche coche) {
        if (listaParticipantes.size() == 20) {
            System.out.println("Error en la inscripcion: no hay plazas");
        } else {
            // esta la matricula del coche que quiero agregar en la lista?
            // true o false
            if (estaCoche(coche.getMatricula()) != null) {
                System.out.println("Error en la inscripcion. Datos duplicados");
            } else {
                listaParticipantes.add(coche);
            }
        }
    }

    private Coche estaCoche(String matricula) {

        Coche coincideCoche = null;
        // recorre la lista y pregunta por las matriculas
        for (Coche coche : this.listaParticipantes) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                coincideCoche = coche;
                break;
            }
        }
        return coincideCoche;
    }


    // descalificarParticiapante
    // elimina un particiopante a la lista
    public void descalificarParticipante(String matricula) {

        // esta el coche en la lista?
        Coche cocheEncontrado = estaCoche(matricula);

        if (cocheEncontrado != null) {
            listaParticipantes.remove(cocheEncontrado);
            System.out.println("El coche se ha borrado");
        } else {
            System.out.println("No está el coche en la lista");
        }

    }


    // agregarCarrera
    // agregar una carrera a la lista
    public void agregarCarrera(Carrera carrera) {
        // restriccion de numero o repetir circuito?
        listaCarreras.add(carrera);
    }

    // mostrar los datos del campeonato
    // Participantes:
    // nombre matricula
    // nombre matricula
    // Carrera
    // nombre_circuito vueltas km
    // nombre_circuito vueltas km
    public void mostrarDatos() {

        System.out.printf("El campeonato con nombre '%s', tiene los siguientes datos:\n", nombre);
        System.out.println("Los participantes son:");
        for (Coche item : listaParticipantes) {
            System.out.printf("\tNombre: %s\t/\tMatrícula: %s\n", item.getNombre()
                    , item.getMatricula());
        }
        System.out.println("\nLas carreras son:");
        for (Carrera item : listaCarreras) {
            System.out.printf("\tNombre: %s\t/\tVueltas: %d\t/\t Km: %d\n"
                    , item.getCircuito().getNombre(),
                    item.getCircuito().getVueltas(),
                    item.getCircuito().getKmTotales()
            );
        }
        System.out.println("\n");
    }

    public void ordenarParrilla() {
        Collections.sort(listaParticipantes, new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getPuntos() < o2.getPuntos()) {
                    return 1;
                } else if (o1.getPuntos() > o2.getPuntos()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public void mostrarPuntos() {
        for (int i = 0; i < listaParticipantes.size(); i++) {
            System.out.printf("%dº - %s con %d puntos\n", i + 1,
                    listaParticipantes.get(i).getNombre()
                    , listaParticipantes.get(i).getPuntos());
        }

    }


    // iniciarCampeonato
    public void iniciarCampeonato() {

        for (Carrera item : listaCarreras) {

            // inscribir participates en carrera
            // (Por cada participante en la lista, lo inscribe en esa carrera)
            for (Coche element : listaParticipantes) {
                item.inscribirParticipante(element);
            }

            // Pasa la lista de participantes a la carrera también
            item.setParticipantes(listaParticipantes);


            // correr la carrera
            item.iniciarCarrera();


            // tras cada carrera quiero
            // ver la clasificacion con puntos del campeonato
            System.out.println("\nLa situacion del campeonato tras correr la carrera es:");
            ordenarParrilla();
            mostrarPuntos();
            System.out.println("\n");
            pararTiempo(5);


        }


    }

    // recorrer todas las carreres e iniciarlas
    // mostrarClasficiacion
    // muestra los participantes con sus puntos




    public void pararTiempo(int segundos){
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(segundos*1000);
        } catch (Exception e) {
            System.out.println("e");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public ArrayList<Coche> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Coche> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public Coche getCampeon() {
        return campeon;
    }

    public void setCampeon(Coche campeon) {
        this.campeon = campeon;
    }
}

