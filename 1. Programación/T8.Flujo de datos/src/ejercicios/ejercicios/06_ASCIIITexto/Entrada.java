package TODO_CASA.ejercicios.VI_ASCIITexto;

import TODO_CASA.OperacionesFicheros;

public class Entrada {

    //(ASCIIFichero) Modifica el ejercicio anterior para que al mismo tiempo que se lee el
    // contenido del fichero del ejercicio3 se cree un nuevo documento donde se guarden los
    // códigos ASCII de cada una de las lecturas
    public static void main(String[] args) {

        OperacionesFicheros operacionesFicheros = new OperacionesFicheros("src/TODO_CASA/ejercicios/VI_ASCIITexto/documentos/codigo.txt");
        System.out.println(operacionesFicheros.leerInformacion());
        System.out.println(operacionesFicheros.traducirASCIITexto(operacionesFicheros.leerInformacion()));


    }
}
