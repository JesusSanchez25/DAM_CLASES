package ejercicios.ejercicioClase1.model;

import java.util.ArrayList;

public class Coleccion {
    int contador;
    private ArrayList<Multimedia> multimediaArrayList;

    public Coleccion() {
        multimediaArrayList = new ArrayList<>();
    }

    public void agregarMultimedia(Multimedia multimedia){
        for (Multimedia item : multimediaArrayList) {
            if (multimedia == item){
                System.out.println("Esa multimedia ya se encuentra en la colección");
                return;
            }
        }
        multimediaArrayList.add(multimedia);
        multimedia.setIdentificador(contador++);
        System.out.println("Ha sido agregado con éxito");
    }

    public void eliminarMultimedia(int identificador){
        for (Multimedia item : multimediaArrayList) {
            if (item.getIdentificador()==identificador){
                System.out.println("Eliminado con éxito");
                multimediaArrayList.remove(item);
                return;
            }
        }
        System.out.println("No se ha podido eliminar");
    }

    public void listarMultimedia(Class multimedia){
        for (Multimedia item : multimediaArrayList) {
            if (item.getClass() == multimedia){
                item.mostrarDatos();
            }
        }


    }

    public void buscarPorAutor(String autor){

        for (Multimedia item : multimediaArrayList) {
            if (item.getautor().equalsIgnoreCase(autor)){
                item.mostrarDatos();
            }
        }

    }

    public void buscarPorActor(String actor){

        for (Multimedia item : multimediaArrayList) {
            if (item instanceof Video){
               for (Persona object : ((Video) item).getActores()) {
                   if (object.getNombre().equals(actor)){
                       item.mostrarDatos();
                   }
               }
            }
        }

    }

    public void buscarPorDirector(String director){
        for (Multimedia item : multimediaArrayList) {
            if (item instanceof Video && ((Video) item).getdirector().getNombre().equalsIgnoreCase(director)){
                item.mostrarDatos();
            }
        }
    }

    }




