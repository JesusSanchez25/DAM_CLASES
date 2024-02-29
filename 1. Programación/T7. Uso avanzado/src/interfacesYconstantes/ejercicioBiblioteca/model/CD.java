package interfacesYconstantes.ejercicioBiblioteca.model;

import interfacesYconstantes.ejercicioBiblioteca.utils.TipoCine;

public class CD extends Formato {
    private int anioEdicion;
    private TipoCine tipoCine;

    public CD(String seccion, String titulo, int anioEdicion, TipoCine tipoCine) {
        super(seccion, titulo);
        this.anioEdicion = anioEdicion;
        this.tipoCine = tipoCine;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año de edicion: " + anioEdicion);
        System.out.println("Año de edicion: " + anioEdicion);
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public TipoCine getTipoCine() {
        return tipoCine;
    }

    public void setTipoCine(TipoCine tipoCine) {
        this.tipoCine = tipoCine;
    }
}
