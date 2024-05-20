package ejercicios.ventanaFutbol.excepciones;

public class UsuarioNoEncontradoException extends Exception{
    public UsuarioNoEncontradoException() {
        super("Usuario no encontrado");
    }
}
