package genericos.explicacion;

import genericos.EjercicioGenericos.MiLista;
import genericos.explicacion.model.Dato;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Entrada {
    public static void main(String[] args) {
        Dato<Integer, Boolean, List<Integer>> dato = new Dato();
        Dato<Double, Character, ArrayList<String>> dato1 = new Dato();
        Dato<Float, Character, Array> dato2 = new Dato();

        MiLista<Integer> listaNumeros = new MiLista<>();
        listaNumeros.aniadirElemento(3);
        listaNumeros.aniadirElemento(5);
        listaNumeros.aniadirElemento(8);
        listaNumeros.aniadirElemento(10);

        MiLista<String> listaString = new MiLista<>();
        listaString.aniadirElemento("dhfkja");
        listaString.aniadirElemento("fhadkjs");
        listaString.aniadirElemento("adhjsfkl");




    }


}
