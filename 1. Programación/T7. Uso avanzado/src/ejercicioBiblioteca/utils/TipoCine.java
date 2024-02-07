package ejercicioBiblioteca.utils;

public enum TipoCine {

    intriga("intriga"), terror("terror"),comedia("comedia"), drama("drama");

    private String nombre;

    TipoCine(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
