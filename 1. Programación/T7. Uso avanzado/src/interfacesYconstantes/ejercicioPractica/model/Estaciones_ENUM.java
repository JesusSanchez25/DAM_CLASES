package interfacesYconstantes.ejercicioPractica.model;

public enum Estaciones_ENUM {

    // PLANTILLAS
    invierno ("invierno", 1, false),
    primavera("primavera", 20, true),
    verano("verano", 30, true),
    otonio("otoño", 10, false);

    private String nombre;
    private int temperaturaMedia;
    private boolean indiceUV;

    Estaciones_ENUM(String nombre, int temperaturaMedia, boolean indiceUV) {

        this.nombre = nombre;
        this.temperaturaMedia = temperaturaMedia;
        this.indiceUV = indiceUV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public boolean isIndiceUV() {
        return indiceUV;
    }

    public void setIndiceUV(boolean indiceUV) {
        this.indiceUV = indiceUV;
    }
}
