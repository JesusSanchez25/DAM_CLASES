package ejerciciosClase.ejercicioClase3.model;

public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(Asignatura asignatura1,Asignatura asignatura2,Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int asignatura1,int asignatura2,int asignatura3){
    this.asignatura1 = new Asignatura(asignatura1);
    this.asignatura2 = new Asignatura(asignatura2);
    this.asignatura3 = new Asignatura(asignatura3);

    }


    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
}
