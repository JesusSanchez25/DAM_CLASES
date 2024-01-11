package ejerciciosClase.ejercicioClase3_Agenda;

import ejerciciosClase.ejercicioClase3_Agenda.controler.Agenda;
import ejerciciosClase.ejercicioClase3_Agenda.controler.Persona;

public class Entrada {

    public static void main(String[] args) {

        Persona persona = new Persona("Jose", "4314132M", 123);

        Agenda agenda = new Agenda();
        agenda.agregarPersona(persona);

        agenda.iniciarAgenda();

    }






}
