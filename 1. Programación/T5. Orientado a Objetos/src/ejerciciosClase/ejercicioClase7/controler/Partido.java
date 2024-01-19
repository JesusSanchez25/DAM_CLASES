package ejerciciosClase.ejercicioClase7.controler;

import ejerciciosClase.ejercicioClase7.model.Equipo;

import java.util.Random;

public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;
    private boolean partidoEnJuego;
    private int parte;

    // Constructor que inicializa los equipos y otros atributos
    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.partidoEnJuego = false;
        this.parte = 0;
    }

    // Método para iniciar el partido
    public void iniciarPartido() {
        if (!partidoEnJuego) {
            partidoEnJuego = true;

            // Se juegan tres partes
            for (int i = 0; i < 3; i++) {
                // Realizar tres ataques por cada parte
                realizarAtaque(equipoA, equipoB);
                realizarAtaque(equipoB, equipoA);

                // Incrementar el número de parte
                parte++;

                // Mostrar el resultado después de cada parte
                mostrarResultado();
            }

            // El partido ha terminado
            partidoEnJuego = false;
        } else {
            System.out.println("El partido ya está en juego."); 
        }
    }

    private static void realizarAtaque(Equipo atacante, Equipo defensor) {
        boolean gol = atacante.atacar(defensor);
        if (gol) {
            System.out.println("¡Gol! " + atacante.getNombre() + " ha marcado un gol contra " + defensor.getNombre());
        } else {
            System.out.println("¡Fallo! " + atacante.getNombre() + " no ha marcado contra " + defensor.getNombre());
        }
    }

    // Método para mostrar el resultado final del partido
    public void mostrarResultado() {
        System.out.println("Resultado del Partido: " + equipoA.getNombre() + " " + equipoA.getGoles() +
                " - " + equipoB.getNombre() + " " + equipoB.getGoles());
    }

    // Otros métodos, getters y setters, según sea necesario
    // ...
}
