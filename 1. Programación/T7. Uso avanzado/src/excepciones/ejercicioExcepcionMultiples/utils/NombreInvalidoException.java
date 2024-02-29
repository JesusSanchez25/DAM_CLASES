package excepciones.ejercicioExcepcionMultiples.utils;

public class NombreInvalidoException extends Exception{

    public NombreInvalidoException(String message){
        super(message);
        System.out.println("Edad no válida");
        System.out.println(message);
    }
}
