package TODO_CASA.ejercicios.II_LecturaBasica;

import TODO_CASA.OperacionesFicheros;

public class Entrada {

    //(LecturaBásica) Sea un fichero llamado texto.txt localizado en un
    // paquete llamado documentos con el siguiente contenido
    public static void main(String[] args) {

        OperacionesFicheros operacionesFicheros = new OperacionesFicheros("src/TODO_CASA/ejercicios/II_LecturaBasica/texto.txt");
        System.out.println(operacionesFicheros.leerInformacion());
    }
}
