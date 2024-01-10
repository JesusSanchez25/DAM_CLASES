package ejerciciosClase.ejercicioClase1.model;

public class Garaje {

    private Coche coche;
    private String averia;
    private int cochesAtendidos;


    public Garaje(){}

    public void aceptarCoche(Coche coche, String averia){
        if (coche==null){
            System.out.println("Coche añadido con exito.");
            this.coche = coche;
            this.averia = averia;


        } else {
            System.out.println("No se puede agregar coche, garaje lleno.");
        }


    }

    public void devolverCoche(){
        this.coche = null;

    }

}
