package ejercicios.ejercicioClase1.model;

import ejercicios.ejercicioClase1.model.Multimedia;

public final class Audio extends Multimedia {

    private int duracion;
    private String soporte;


    public Audio(){}
    public Audio(int duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public Audio(int tamano, String titulo, String autor, String formato, int duracion, String soporte) {
        super(tamano, titulo, autor, formato);
        this.duracion = duracion;
        this.soporte = soporte;
        System.out.println("Tipo: Libro");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo: Audi");
        super.mostrarDatos();
        System.out.println("Duracion: " + duracion);
        System.out.println("Soporte: " + soporte);

    }
}
