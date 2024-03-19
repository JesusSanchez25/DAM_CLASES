package Estaticos;

import Estaticos.data.DataSet;
import Estaticos.model.Equipo;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {



        for (Equipo item: DataSet.newInstance().getAllEquipos()) {
            System.out.println(item.getNombre());
        }

        for (Equipo item : DataSet.newInstance().getAllEquipos()) {
            System.out.println(item.getNombre());

        }
        System.out.println("\n");




    }


}
