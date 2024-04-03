package TODO_CASA.ejercicios.IV_TextoASCII;

import TODO_CASA.OperacionesFicheros;

public class Entrada {

    //(TextoASCII) Modifica el ejercicio 3
    // para que una vez leído el contenido del fichero aparezca por consola el texto pero traducido a códigos ascii
    public static void main(String[] args) {

        OperacionesFicheros operacionesFicheros = new OperacionesFicheros("src/TODO_CASA/ejercicios/IV_TextoASCII/texto.txt");
        System.out.println(operacionesFicheros.leerInformacion());
        System.out.println(operacionesFicheros.traducirTextoASCII(operacionesFicheros.leerInformacion()));


    }
}
