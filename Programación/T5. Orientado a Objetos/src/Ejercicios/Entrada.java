ackage Ejercicios;

import Ejercicios.Controlador.Carrera;
import Ejercicios.model.Circuito;
import Ejercicios.model.Coche;

public class Entrada {

    public static void main(String[] args) {


        Coche participante1 = new Coche("Participante1", "1234A", 240, 150);
        Coche participante2 = new Coche("Participante2", "1234B", 240, 170);
        Circuito circuito1 = new Circuito("Imola", 300, 5);
        Carrera carrera1 = new Carrera(circuito1);

        // participantes = (participantes1, participantes2)
        // km = 300 (los del circuito)
        carrera1.mostrarDatos();
        carrera1.inscribirParticipante(participante1);
        carrera1.inscribirParticipante(participante1);
        carrera1.descalificarParticipantes(participante1.getMatricula());
        carrera1.mostrarParticipantes();

/*
        // para cambiar los km totales en el model de circuito1
        circuito1.setKmTotales(500);

        participante1.acelerar(500);
        participante1.mostrarDatos();*/




    }
}
