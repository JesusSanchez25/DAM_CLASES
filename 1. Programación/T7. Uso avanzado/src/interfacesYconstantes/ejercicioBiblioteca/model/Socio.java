package interfacesYconstantes.ejercicioBiblioteca.model;

import java.util.ArrayList;

public class Socio extends Persona{

    private int numSocio;
    private ArrayList<Prestables> listaPrestables;

    public Socio() {
    }

    public Socio(String nombre, String apellido, String dni, int numSocio) {
        super(nombre, apellido, dni);
        this.numSocio = numSocio;
        this.listaPrestables = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de socio: " + numSocio);
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public ArrayList<Prestables> getListaPrestables() {
        return listaPrestables;
    }

    public void setListaPrestables(ArrayList<Prestables> listaPrestables) {
        this.listaPrestables = listaPrestables;
    }
}
