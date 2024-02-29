package excepciones.ejercicioCuenta.model;

import excepciones.ejercicioCuenta.exceptions.SaldoInsuficienteException;

public class Cuenta {
    //- Crea una clase llamada Cuenta que tenga los siguientes atributos: numeroCuenta (String) y saldo (double). Implementa un constructor que permita inicializar la cuenta con un número de cuenta y un saldo inicial. Agrega un método llamado realizarTransaccion que acepte un monto como parámetro y realice una transacción. El comportamiento el método será el siguiente:
    //
    //- Si lo que estoy intentando sacar es una cantidad negativa, lanza una
    // excepción de tipo IllegalArgumentException indicando que la cantidad debe ser positiva.
    //- Si lo que estoy intentando sacar es mayor que el saldo actual,
    // Lanza la excepción personalizada SaldoInsuficienteException.
    //- En caso contrario, actualiza el saldo restando el monto.


    private String numeroCuenta;
    private double saldo;


    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void sacarDinero(int saldoSacar) throws Exception{

        if (saldoSacar < 0 ){
            throw new IllegalArgumentException("Saldo a sacar debe ser positivo");
        } else if (this.saldo < saldoSacar){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        } else {
            this.saldo -= saldoSacar;
        }


        if (saldo-saldoSacar<0){
            throw new SaldoInsuficienteException("No tienes suficiente saldoSacar en la cuenta");
        }
        
        
        
        

    }
}
