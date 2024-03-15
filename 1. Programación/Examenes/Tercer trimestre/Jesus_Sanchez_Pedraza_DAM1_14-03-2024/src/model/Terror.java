package model;

public class Terror extends Libro{

    private String calificacion;

    public Terror() {
    }

    public Terror(String autor, int numPaginas, int ISBN, String calificacion) {
        super(autor, numPaginas, ISBN);
        this.calificacion = calificacion;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Calificacion: " + calificacion);
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
