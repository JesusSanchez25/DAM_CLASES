package ejercicios.ejercicioClase1.model;

public abstract class Multimedia {
    private int identificador, tamano;
    private String titulo, director, formato;


    public Multimedia(){}
    public Multimedia(int tamano, String titulo, String director, String formato) {
        this.tamano = tamano;
        this.titulo = titulo;
        this.director = director;
        this.formato = formato;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
