package ejercicios.ejercicioClase1.model;

import ejercicios.ejercicioClase1.model.Multimedia;

import java.time.Period;
import java.util.ArrayList;

public class Video extends Multimedia {

    private ArrayList<Persona> actores;
    private Persona autor;

    public Video() {
    }

    public Video(ArrayList<Persona> actores, Persona autor) {
        this.actores = actores;
        this.autor = autor;
    }

    public Video(int tamano, String titulo, String autor, String formato, ArrayList<Persona> actores, Persona autor1) {
        super(tamano, titulo, autor, formato);
        this.actores = actores;
        this.autor = autor1;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo: video");
        super.mostrarDatos();
        System.out.println("autor: " + autor);
        System.out.println("actores: ");
        for (Persona item : actores) {
            System.out.println("\t" + item.getNombre());
        }

    }
}
