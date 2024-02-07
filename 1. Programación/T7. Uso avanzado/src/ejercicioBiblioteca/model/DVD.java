package ejercicioBiblioteca.model;

import ejercicioBiblioteca.utils.TipoCine;

import java.lang.invoke.StringConcatException;

public class DVD extends Formato implements Prestables {

    private int anioEdicion;
    private String director, actores;
    private TipoCine tipoCine;

    public DVD() {
    }

    public DVD(String seccion, String titulo, int aniooEdicion, String director, String actores, TipoCine tipoCine) {
        super(seccion, titulo);
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
        this.tipoCine = tipoCine;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director" + director);
        System.out.println("Actores" + actores);
        System.out.println("Año edición" + anioEdicion);
        System.out.println("Tipo" + tipoCine.getNombre());
    }

    @Override
    public boolean prestar() {
        if (isEstado()){
            this.setEstado(false);
            System.out.println("dvd prestado correctametne");
            return true;
        } else {
            System.out.println("El dvd no se encuentra disponible");
            return false;
        }
    }

    @Override
    public boolean devolver() {
        if (!isEstado()){
            this.setEstado(true);
            System.out.println("dvd devuelto correctametne");
            return true;
        } else {
            System.out.println("El dvd ya está en la biblioteca");
            return false;
        }
    }


}
