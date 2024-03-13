package ejercicioTienda.Utils;

public enum TamanioBici {

    S("pequeño"), M("mediano"), L("grande");

    String nombre;

    TamanioBici(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
