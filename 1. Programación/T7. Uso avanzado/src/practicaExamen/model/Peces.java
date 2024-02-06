package practicaExamen.model;

import practicaExamen.constantes.Constantes;

import java.util.Scanner;

import static java.lang.System.in;

public class Peces extends Animal{

    private String tipoAgua;

    public Peces() {
    }

    public Peces(int edad, String nombre, String tipoAgua) {
        super(edad, nombre);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de agua preferida: " + tipoAgua);
    }

    public void nadar(){
        System.out.println("¿En qué tipo de agua va a nadar tu pez?");
        System.out.println("1. Agua dulce");
        System.out.println("2. Agua salada");

        Scanner scanner = new Scanner(in);
        int respuesta = scanner.nextInt();

        if ((respuesta == 1 && tipoAgua.equalsIgnoreCase(Constantes.aguaDulce)) ||
                (respuesta == 2 && tipoAgua.equalsIgnoreCase(Constantes.aguaSalada))){
            System.out.println("Tu pez está nadando felizmente");
        } else{
            System.out.println("Acabas de matar a " + getNombre());
            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(3*1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Hijo de puta");
        }



    }


}
