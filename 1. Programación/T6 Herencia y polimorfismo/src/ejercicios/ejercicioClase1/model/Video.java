package ejercicios.ejercicioClase1.model;

import ejercicios.ejercicioClase1.model.Multimedia;

import java.time.Period;
import java.util.ArrayList;

public class Video extends Multimedia {

    private ArrayList<Personas> actores;
    private Persona director;

    public Video() {
    }

    public Video(ArrayList<Personas> actores, Persona director) {
        this.actores = actores;
        this.director = director;
    }

    public Video(int identificador, int tamano, String titulo, String director, String formato, ArrayList<Personas> actores, Persona director1) {
        super(identificador, tamano, titulo, director, formato);
        this.actores = actores;
        this.director = director1;
    }
}
