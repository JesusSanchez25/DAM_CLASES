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



}
