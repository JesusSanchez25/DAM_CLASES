package ejercicios.ejercicioClase3.model;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Centralita {

    ArrayList<Llamada> listaLlamadas;
    private int costeTotal;

    public Centralita() {
        this.listaLlamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        costeTotal += llamada.getCoste();

    }

    public void mostrarLlamadas(){
        for (Llamada item : listaLlamadas) {
            System.out.println("Número origen: " + item.getNumOrigen());
            System.out.println("Número destino: " + item.getNumDestino());
            System.out.println("Duración: " + item.getDuracion() + " segundos");
            System.out.println("Coste: " + item.getCoste() + " céntimos");
            System.out.println("");
        }
    }

    public void mostrarCostesTotales(){
        System.out.println("Costes totales: " + costeTotal + " centimos");
    }

    public ArrayList<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(ArrayList<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    public int getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(int costeTotal) {
        this.costeTotal = costeTotal;
    }
}
