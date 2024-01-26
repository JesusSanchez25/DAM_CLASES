package ejercicios.ejercicioClase1.model;

import ejercicios.ejercicioClase1.model.Multimedia;

import java.time.Period;
import java.util.ArrayList;

public final class Video extends Multimedia {

    private ArrayList<Persona> actores;
    private Persona director;

    public Video() {
    }

    public Video(ArrayList<Persona> actores, Persona director) {
        this.actores = actores;
        this.director = director;
    }

    public Video(int tamano, String titulo, String director, String formato, ArrayList<Persona> actores, Persona director1) {
        super(tamano, titulo, director, formato);
        this.actores = actores;
        this.director = director1;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo: video");
        super.mostrarDatos();
        System.out.println("director: " + director);
        System.out.println("actores: ");
        for (Persona item : actores) {
            System.out.println("\t" + item.getNombre());
        }

    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public Persona getdirector() {
        return director;
    }

    public void setdirector(Persona director) {
        this.director = director;
    }
}
