package practica2Examen.model;

import java.util.Scanner;

import static java.lang.System.in;

public class Coche extends Vehiculo implements Conducible{

    private String tipoGasolina;

    public Coche() {
    }

    public Coche(int anio, String marca, String modelo, String tipoGasolina) {
        super(anio, marca, modelo);
        this.tipoGasolina = tipoGasolina;
    }


    @Override
    public void conducir() {
        System.out.println("Quieres acelerar o frenar");
        System.out.println("1. Acelerar");
        System.out.println("2. Frenar");
        Scanner scanner = new Scanner(in);
        int respuesta = scanner.nextInt();

        if (respuesta==1){
            acelerar();
        } else {
            frenar();
        }

    }

    @Override
    public void acelerar() {
        System.out.println("Fiaumm");
    }

    @Override
    public void frenar() {

        System.out.println("Priiii");
    }
}
