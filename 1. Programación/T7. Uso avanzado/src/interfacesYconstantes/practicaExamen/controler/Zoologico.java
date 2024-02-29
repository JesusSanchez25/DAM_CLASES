package interfacesYconstantes.practicaExamen.controler;

import interfacesYconstantes.practicaExamen.model.Animal;

import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> listaAnimales;

    public Zoologico() {
        listaAnimales = new ArrayList<>();
    }

    public void registrarAnimal(Animal animal){
        for (Animal item : listaAnimales) {
            if (item.equals(animal.getNombre())){
                System.out.println("Ese nombre ya ha sido metido antes, prueba otro");
                return;
            }
        }
        listaAnimales.add(animal);
        System.out.println("Animal agregado con éxito");

    }




}
