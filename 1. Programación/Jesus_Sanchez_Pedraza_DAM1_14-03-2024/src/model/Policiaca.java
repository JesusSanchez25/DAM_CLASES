package model;

import utils.Trama;

import java.util.ArrayList;

public class Policiaca extends Libro{


    private Trama trama;
    private String personajes;



    public Policiaca() {

    }

    public Policiaca(String autor, int numPaginas, int ISBN, Trama trama, String personajes) {
        super(autor, numPaginas, ISBN);
        this.trama = trama;
        this.personajes = personajes;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trama: " + trama);
        System.out.println("Personajes: " + personajes);
    }

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }
}
