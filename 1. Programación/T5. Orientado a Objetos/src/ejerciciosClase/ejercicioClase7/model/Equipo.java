package ejerciciosClase.ejercicioClase7.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int nivelAtaque,nivelCentro,nivelDefensa, goles;
    private ArrayList<Jugador> listaJugadores;

    // Constructor que inicializa aleatoriamente los niveles y los goles.
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelCentro = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
        this.goles = 0;
        this.listaJugadores = new ArrayList<>();

    }

    // Constructor que permite especificar los niveles.
    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.goles = 0;
        this.listaJugadores = new ArrayList<>();

    }

    // Método para simular un ataque.
    public boolean atacar(Equipo defensor) {
        double resultado = (nivelAtaque * Math.random()) + (nivelCentro * Math.random() / 2);
        if (resultado > defensor.getNivelDefensa()) {
            goles++;
            return true;
        } else {
            return false;
        }
    }

    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public void listarDelanteros(){
        System.out.println("Los delanteros son:");
    for (Jugador item : listaJugadores) {
        if (item.getPosicion().equalsIgnoreCase("delantero")){
            item.mostrarDatos();

        }
    }
        

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}