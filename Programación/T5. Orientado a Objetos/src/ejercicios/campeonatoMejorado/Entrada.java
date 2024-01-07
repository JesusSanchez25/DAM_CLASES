package ejercicios.campeonatoMejorado;

import ejercicios.campeonatoMejorado.Controlador.Campeonato;
import ejercicios.campeonatoMejorado.Controlador.Carrera;
import ejercicios.campeonatoMejorado.model.Circuito;
import ejercicios.campeonatoMejorado.model.Coche;

public class Entrada {

    public static void main(String[] args) {
        Coche participante1 = new Coche("Caballo","1234",70,3000,"\uD83C\uDFC7");
        Coche participante2 = new Coche("Ferrari","2345",90,3000,"\uD83C\uDFCE\uFE0F");
        Coche participante3 = new Coche("Moto","3456",100,3000,"\uD83C\uDFCD\uFE0F");
        Coche participante4 = new Coche("Persona en bicicleta","4567",110,3000,"\uD83D\uDEB4");
        Coche participante5 = new Coche("Autobús","5678",80,3000,"\uD83D\uDE8C");
        Coche participante6 = new Coche("Cerdo","6789",75,3000,"\uD83D\uDC16 ");


        Circuito ciruito1 = new Circuito("Imola",1800, 5);
        Circuito ciruito2 = new Circuito("Jarama",1500, 4);
        Circuito ciruito3 = new Circuito("Suzuka",900, 3);
        Carrera carrera1 = new Carrera(ciruito1);
        Carrera carrera2 = new Carrera(ciruito2);
        Carrera carrera3 = new Carrera(ciruito3);
        Carrera carrera4 = new Carrera(ciruito1);
        Carrera carrera5 = new Carrera(ciruito2);


        Campeonato campeonato = new Campeonato("Campeonato CES");

        campeonato.inscribirParticipante(participante1);
        campeonato.inscribirParticipante(participante2);
        campeonato.inscribirParticipante(participante3);
        campeonato.inscribirParticipante(participante4);
        campeonato.inscribirParticipante(participante5);
        campeonato.inscribirParticipante(participante6);

        campeonato.agregarCarrera(carrera1);
        campeonato.agregarCarrera(carrera2);
        campeonato.agregarCarrera(carrera3);
        campeonato.agregarCarrera(carrera4);
        campeonato.agregarCarrera(carrera5);

        campeonato.iniciarCampeonato();










        // Ejemplos anteriores (antes del campeonato)

        /*carrera1.inscribirParticipante(participante1);
        carrera1.inscribirParticipante(participante2);
        carrera1.inscribirParticipante(participante3);
        carrera1.inscribirParticipante(participante4);
        carrera1.inscribirParticipante(participante5);
        carrera1.inscribirParticipante(participante6);*/
        //carrera1.mostrarDatos();
        //carrera1.mostrarParrilla();
        //carrera1.iniciarCarrera();
        //carrera1.mostrarParrilla();


        // velocidad = 0
        // acelerar(50)
        // velocidad = 0 + (0-50);
        /*participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.mostrarDatos();
        System.out.println("Frenando......");
        participante1.frenar(100);
        participante1.mostrarDatos();
        System.out.println("Frenando......");
        participante1.frenar(100);
        participante1.mostrarDatos();*/






    }
}
