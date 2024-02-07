package ejercicioBiblioteca.controler;

import ejercicioBiblioteca.model.Formato;
import ejercicioBiblioteca.model.Persona;
import ejercicioBiblioteca.model.Prestables;
import ejercicioBiblioteca.model.Socio;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Formato> listaFormatos;
    private short contadorSocios, contadorFormatos;

    public Biblioteca() {
        listaFormatos = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public void registrarPersona(Persona persona){

        for (Persona item : listaPersonas) {
            if (persona.getDni().equals(item.getDni())) {
                System.out.println("Ese dni ya ha sido introducido antes");
                return;
            }
        }
        listaPersonas.add(persona);
        System.out.println("La persona ha sido agregada con éxito");


        if (persona instanceof Socio){
            contadorSocios++;
            ((Socio) persona).setNumSocio(contadorSocios);
        }
    }

    public void agregarFormato(Formato formato){
        listaFormatos.add(formato);

        contadorFormatos++;
        formato.setId(contadorFormatos);
        formato.setEstado(true);

    }

    public void realizarPrestamo(Socio socio, Prestables prestable){

        if (prestable.prestar()){
            socio.getListaPrestables().add(prestable);
        }

    }

    public void devolver(Socio socio, Prestables prestable){

        if (prestable.devolver()){
            socio.getListaPrestables().remove(prestable);
        }
    }

    public void mostrarElementosPrestados(){
        for (Formato item : listaFormatos) {
            if (item instanceof Prestables && item.isEstado()){
                item.mostrarDatos();
            }
        }

    }

    public void mostrarElementosDisponibles(){
        for (Formato item : listaFormatos) {
            if (!item.isEstado()){
                item.mostrarDatos();
            }
        }

    }

    public void mostrarElementosSocio(Socio socio){
        for (Prestables item : (socio.getListaPrestables())) {
            ((Formato)(item)).mostrarDatos();
        }
    }


}
