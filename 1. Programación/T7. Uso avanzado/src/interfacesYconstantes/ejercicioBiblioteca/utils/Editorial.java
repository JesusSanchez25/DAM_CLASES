package interfacesYconstantes.ejercicioBiblioteca.utils;

public enum Editorial {
    SM("sm", 2000), RAMA("RAMA", 2010), LIBROSA("libros s.a", 2009), LECTURAS("Lecturas s.l", 1999);

    private String nombre;
    private int fundacion;

    // EL CONSTRUCTOR ES PRIVADO PORQUE LO NOMBRAS AQUI
    Editorial(String nombre, int fundacion) {
        this.nombre = nombre;
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }
}
