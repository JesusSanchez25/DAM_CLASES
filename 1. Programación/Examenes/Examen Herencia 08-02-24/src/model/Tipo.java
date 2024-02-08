package model;

public enum Tipo {

    mtb("mtb"), carrera("carrera"), cross("cross");


    private String nombre;

    Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
