package clasesAnidadas.ejercicioTienda.Utils;

public enum TipoBici {

    MTB("mountain bike"), CARRETERA("Carrera"), PASEO("Paseo");

    String nombre;

    TipoBici(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
