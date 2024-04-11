package TODO_CASA.ejercicios.III_PalabrasOraciones;

import TODO_CASA.OperacionesFicheros;

public class Entrada {

    //(PalabrasOraciones) Modifica el ejercicio anterior para que:
    //- Una vez muestra el contenido del fichero por consola aparezcan los siguientes mensajes:
    //    - El número de letras es de: X
    //    - El número de palabras es de: X
    //    - El número de oraciones es de: X
    public static void main(String[] args) {

        OperacionesFicheros operacionesFicheros = new OperacionesFicheros("src/TODO_CASA/ejercicios/III_PalabrasOraciones/texto.txt");
        System.out.println(operacionesFicheros.leerInformacion());
        operacionesFicheros.contarInformacion(operacionesFicheros.leerInformacion());


    }
}
