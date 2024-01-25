package ejercicios.ejercicioClase1.model;

public abstract class Multimedia {
    private int identificador, tamano;
    private String titulo, autor, formato;


    public Multimedia(){}
    public Multimedia(int tamano, String titulo, String autor, String formato) {
        this.tamano = tamano;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

    public void mostrarDatos(){
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getautor());
        System.out.println("Formato: " + getFormato());

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

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
