package utils;

public enum Trama {

    misterio("misterio"), intriga("intriga");

    private String nombre;

    Trama(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
