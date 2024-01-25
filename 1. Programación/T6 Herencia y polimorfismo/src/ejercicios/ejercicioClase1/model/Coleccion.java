package ejercicios.ejercicioClase1.model;

import java.util.ArrayList;

public class Coleccion {
    int contador;
    private ArrayList<Multimedia> multimediaArrayList;
    //CREAR IDENTIFICADOR ÚNICO


    public Coleccion() {
        multimediaArrayList = new ArrayList<>();
    }

    public void agregarMultimedia(Multimedia multimedia){
        multimediaArrayList.add(multimedia);
        multimedia.setIdentificador(contador++);
    }

    public void eliminarMultimedia(int identificador){
        for (Multimedia item : multimediaArrayList) {
            if (item.getIdentificador()==identificador){
                multimediaArrayList.remove(item);
            }
        }
    }



}
