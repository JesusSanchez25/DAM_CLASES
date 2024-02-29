package excepciones.ejercicioCuenta.exceptions;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message){
        super(message);
        System.out.println(message);
        System.out.println("No tienes suficiente dinero en la cuenta");
    }

}
