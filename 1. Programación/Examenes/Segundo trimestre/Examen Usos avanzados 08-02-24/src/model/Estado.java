package model;

public enum Estado {

    Nuevo("nuevo"), Seminuevo("seminuevo"), Usado("usado");

    private String nombre;

    Estado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
