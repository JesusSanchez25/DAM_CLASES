package _Estructuras;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        ArrayList<String> listaRemoveAll = new ArrayList();

        for (int i = 0; i < 3; i++) {
            lista.add("Hola");
            lista.add("Adios");
        }

        lista.add("Mek");
        lista.add(2, "Caracola");

        //elimina el primer valor que encuentre
        lista.remove("Hola");

        //Va de valor en valor revisando si se cumple la condición y la ejecuta
        lista.removeIf(elemento -> elemento.equals("Hola"));

        //Cambia un valor por otro en el primer valor que encuentra
        lista.set(lista.indexOf("Caracola"), "Almeja");

        //Reemplaza absolutamente todos los valores que encuentre
        Collections.replaceAll(lista, "Adios ", "lista");


        System.out.println(lista);

    }
}
