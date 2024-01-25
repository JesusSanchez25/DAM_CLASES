package ejercicios.ejercicioClase1.model;

import ejercicios.ejercicioClase1.model.Multimedia;

public class Audio extends Multimedia {

    private int duracion;
    private String soporte;


    public Audio(){}
    public Audio(int duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public Audio(int identificador, int tamano, String titulo, String director, String formato, int duracion, String soporte) {
        super(identificador, tamano, titulo, director, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }
}
