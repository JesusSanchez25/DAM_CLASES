package genericos.EjGenericosComparables;

import java.lang.Comparable;
import java.util.ArrayList;

public class MiColeccion<T extends Comparable<T>> {

    //Crea una clase que acepte una lista de objetos de tipo comparable. En dicha clase define
    // un método genérico llamado **`encontrarMaximo`** que acepte una lista de elementos comparables
    // y devuelva el elemento máximo
    //

    private ArrayList<T> lista;

    public MiColeccion() {
        lista = new ArrayList<>();
    }

    public MiColeccion(ArrayList<T> lista) {
        this.lista = lista;
    }

    public void agregarElemento(T item){
        lista.add(item);
    }

    public T encontrarMaximo(){
        T max = lista.get(0);
        for (T item : this.lista) {
            if (item.compareTo(max) == 1){
                max = item;
            }

        }
        return max;
    }
    public T encontrarMaximo(ArrayList<T> lista){
        T max = null;
        for (T item : lista ) {
            if (item.compareTo(max) == 1){
                max = item;
            }

        }
        return max;
    }



}