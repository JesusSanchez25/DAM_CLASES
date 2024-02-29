package excepciones.ejercicioCuenta;

import excepciones.ejercicioCuenta.model.Cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Entrada {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("2131A", 0);
        Scanner scanner = new Scanner(in);

        try {
            System.out.println("Introduce el dinero a sacar");
            cuenta.sacarDinero(scanner.nextInt());
        } catch (InputMismatchException e){
            System.out.println("El saldo debe ser un número");
        } catch (Exception e){}


    }

}
