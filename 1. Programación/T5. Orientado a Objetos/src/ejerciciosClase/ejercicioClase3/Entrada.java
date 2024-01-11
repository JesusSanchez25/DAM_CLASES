package ejerciciosClase.ejercicioClase3;

import ejerciciosClase.ejercicioClase3.controler.Profesor;
import ejerciciosClase.ejercicioClase3.model.Alumno;
import ejerciciosClase.ejercicioClase3.model.Asignatura;

public class Entrada {

    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);


        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();


        profesor.ponerNotas(alumno);
        System.out.println("Nota de asignatura 1: "+alumno.getAsignatura1().getCalificacion());
        System.out.println("Nota de asignatura 2: "+alumno.getAsignatura2().getCalificacion());
        System.out.println("Nota de asignatura 3: "+alumno.getAsignatura3().getCalificacion());
        System.out.println("Nota media: "+ profesor.calcularMedia(alumno));








    }



}
