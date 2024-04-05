package buscarURL_Basico;

import buscarURL_Basico.controller.OperacionesJSON;

public class Entrada {
    public static void main(String[] args) {

        OperacionesJSON operacionesJSON = new OperacionesJSON();
        operacionesJSON.lecturaAPI();
    }
}
