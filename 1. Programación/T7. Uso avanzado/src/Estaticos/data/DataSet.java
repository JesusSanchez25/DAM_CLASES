package Estaticos.data;

import Estaticos.model.Equipo;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataSet {

    /* De inicio a la instancia se le indica una liga
    * y la instancia retorna solo los equipos de la liga indicada
     */

    private String liga;

    public static DataSet instancia;

    private DataSet(){
        // Para crear un singleton
        // No permite crear dos objetos diferentes, ya que el constructor solo
        // se puede crear desde un método que impide que se vuelva a crear
        System.out.println("Objeto creado con éxito");
    }
    public static DataSet newInstance(){

        //INSTANCIA NECESITA SER ESTÁTICO ya que es un método estático
        if (instancia == null){
            instancia = new DataSet();
        }

        return instancia;

    }

    public ArrayList<Equipo> getAllEquipos(){
        ArrayList<Equipo> lista = new ArrayList<>();
        lista.add(new Equipo("Madrid", "Española", 1900));
        lista.add(new Equipo("City", "Inglesa", 1900));
        lista.add(new Equipo("Liverpool", "Inglesa", 1900));
        lista.add(new Equipo("Barcelona", "Española", 1900));
        lista.add(new Equipo("Intern", "Italiana", 1900));


        return lista;
    }

    public ArrayList<Equipo> getAllEquipos(String liga){
        ArrayList<Equipo> listaFiltrada = new ArrayList<>();
        for (Equipo item : getAllEquipos()) {
            if (item.getLiga().equals(liga)){
                listaFiltrada.add(item);
            }
        }
        return listaFiltrada;
    }




}
