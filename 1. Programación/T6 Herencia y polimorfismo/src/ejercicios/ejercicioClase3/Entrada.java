package ejercicios.ejercicioClase3;

import ejercicios.ejercicioClase3.model.Centralita;
import ejercicios.ejercicioClase3.model.Local;
import ejercicios.ejercicioClase3.model.Nacional;
import ejercicios.ejercicioClase3.model.Provincial;

public class Entrada {
    public static void main(String[] args) {

        Provincial llamada = new Provincial(213213, 213321, 23);
        Nacional llamadaNacional = new Nacional(12321,21321321,58, 'B');

        Centralita centralita = new Centralita();


        centralita.registrarLlamada(llamadaNacional);

        centralita.mostrarLlamadas();
        centralita.mostrarCostesTotales();
    }

}

