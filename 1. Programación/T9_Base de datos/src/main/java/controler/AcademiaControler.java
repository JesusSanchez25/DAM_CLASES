package controler;

import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

public class AcademiaControler {
    private AlumnoCrudRepository alumnoCrudRepository;
    private ProfesorCrudRepository profesorCrudRepository;

    public AcademiaControler() {
        alumnoCrudRepository =  new AlumnoCrudRepository();
        profesorCrudRepository = new ProfesorCrudRepository();
    }

    Alumno mario = new Alumno("Mario", "Galan", "marito@gmail.com", 123324);
    Alumno jorge = new Alumno("Jorge", "Lopez", "jorgitoputon@gmail.com", 123324);

    public void inscribirAlumno(){

        alumnoCrudRepository.darAltaAlumno(jorge);
    }

    public void borrarAlumno(){
        alumnoCrudRepository.borrarAlumno(jorge);
    }
    public ArrayList<Alumno> obtenerAlumnos(){

        for (Alumno alumno : alumnoCrudRepository.obtenerAlumnos()) {
            System.out.println(alumno.toString());
        }
        return alumnoCrudRepository.obtenerAlumnos();
    }

    public void cambiarNombre(){
        alumnoCrudRepository.cambiarNombreAlumno(jorge, mario);
    }

    public void contratarProfesor(Profesor profesor){
        profesorCrudRepository.insertarProfesor(profesor);
    }

    public void eliminarProfesor(Profesor profesor){
        profesorCrudRepository.borrarProfesor(profesor);
    }

    public void cambiarNombreProfesor(Profesor profesor, Profesor profesor2){
        profesorCrudRepository.cambiarNombreProfesor(profesor,profesor2);
    }

    public void obtenerProfesores(){
        for (Profesor item : profesorCrudRepository.obtenerProfesores(1)) {
            System.out.println(item.toString());
        }
    }

}
