package excepciones.ejercicioExcepcionMultiples.utils;

public class EdadInvalidaException extends Exception{

    public EdadInvalidaException(String message){
        super(message);
        System.out.println(message);
    }


}
