package model;

public class Comedia extends Libro{

    private String tipoHumor;

    public Comedia() {
    }

    public Comedia(String autor, int numPaginas, int ISBN, String tipoHumor) {
        super(autor, numPaginas, ISBN);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de humor: " + tipoHumor);
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
