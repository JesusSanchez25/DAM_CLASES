package ejerciciosClase.ejercicioClase4.model;

public class Cuenta {
    private String dni, pin;
    private int saldo,isbn;

    public Cuenta(String dni, String pin, int saldo) {
        this.pin = pin;
        this.dni = dni;
        this.saldo = saldo;
        isbn = (int)(Math.random()*10000)+1;
    }

    public void ingresarDinero(int ingreso){
        if (ingreso>0){
            this.saldo += ingreso;
            System.out.println("Dinero ingresado con exito");
        } else {
            System.out.println("Ingrese un número positivo");
        }
    }

    public void sacarDinero(int ingreso){
        if (ingreso>0 && (saldo - ingreso >= 0)){
            System.out.println("Dinero sacado con exito");
            this.saldo -= ingreso;
        } else if (ingreso>0){
            System.out.println("No posee tanto dinero en la cuenta");
        } else {
            System.out.println("Ingrese un número positivo");
        }
    }

    public void mostrarDatos(String dni){

        System.out.printf("Isbn: %s\n", isbn);
        System.out.printf("Saldo: %s\n", saldo);


    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
