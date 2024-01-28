package ejercicios.ejercicioClase2.controler;

import ejercicios.ejercicioClase2.model.Asalariado;
import ejercicios.ejercicioClase2.model.Autonomo;
import ejercicios.ejercicioClase2.model.Jefe;
import ejercicios.ejercicioClase2.model.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Empresa {
    Scanner scanner = new Scanner(in);

    private ArrayList<Trabajador> trabajadoresLista;
    private boolean hayJefe;

    public Empresa() {
        trabajadoresLista = new ArrayList<>();
    }

    public void agregarTrabajador(){
        System.out.println("Qué tipo de trabajador quieres añadir?");
        System.out.println("1. Jefe");
        System.out.println("2. Asalariado");
        System.out.println("3. Autónomo");
        int respuesta = scanner.nextInt();

        if (respuesta==1){
            if (hayJefe){
                System.out.println("Error, ya existe un jefe");
            } else {
                System.out.println("Inserte los datos del jefe (nombre, apellido, dni, acciones, beneficio)");
                trabajadoresLista.add(new Jefe(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt()));
                System.out.println("Jefe agregado con éxito");
                hayJefe = true;
            }
        }

        if (respuesta==2){
            System.out.println("Inserte el dni del asalariado a agregar)");
            String dni = scanner.next();
            if (comprobarDni(dni)){
                System.out.println("Ese dni ya se encuentra en la base de datos");
            } else {
                System.out.println("Inserte los datos del asalariado (nombre, apellido, sueldo, número de pagas)");
                trabajadoresLista.add(new Asalariado(scanner.next(), scanner.next(), dni, scanner.nextInt(), scanner.nextInt(), true));
            }

                System.out.println("Jefe agregado con éxito");
        }

        if (respuesta==3){
            System.out.println("Inserte el dni del autonomo a agregar)");
            String dni = scanner.next();
            if (comprobarDni(dni)){
                System.out.println("Ese dni ya se encuentra en la base de datos");
            } else {
                System.out.println("Inserte los datos del autonomo (nombre, apellido, sueldo)");
                trabajadoresLista.add(new Autonomo(scanner.next(), scanner.next(), dni, scanner.nextInt(), true));
            }

            System.out.println("Jefe agregado con éxito");
        }






    }

    public void listarTrabajador(){
        System.out.println("Qué tipo de trabajador quieres listar?");
        System.out.println("1. Jefe");
        System.out.println("2. Asalariado");
        System.out.println("3. Autónomo");
        int respuesta = scanner.nextInt();

        if (respuesta==1){
            System.out.println("Jefe:");
            for (Trabajador item : trabajadoresLista) {
                if (item instanceof Jefe){
                    System.out.println("-" + item.getNombre());
                    return;
                }
            }
        }

        if (respuesta==2){
            for (Trabajador item : trabajadoresLista) {
                if (item instanceof Asalariado){
                    System.out.println("-" + item.getNombre());
                }
            }
        }

        if (respuesta==3){
            for (Trabajador item : trabajadoresLista) {
                if (item instanceof Autonomo){
                    System.out.println("-" + item.getNombre());
                }
            }
        }

    }


    public void mostrarDatos(String dni){
        for (Trabajador item : trabajadoresLista) {
            if (item.getDni().equalsIgnoreCase(dni)){
                item.mostrarDatos();
            }
        }


    }



    public boolean comprobarDni(String dni){
        for (Trabajador item : trabajadoresLista) {
            if (item.getDni().equalsIgnoreCase(dni)){
                return true;
            }
        }
        return false;
    }

    public void despedirTrabajador(Jefe jefe){
        System.out.println("Escribe el dni");
        jefe.despedirTrabajador(scanner.next(), this);
    }

    public Jefe hayJefe(){
        for (Trabajador item : trabajadoresLista) {
            if (item instanceof Jefe){
                return (Jefe)item;
            }
        }
        return null;
    }

    public ArrayList<Trabajador> getTrabajadoresLista() {
        return trabajadoresLista;
    }

    public void setTrabajadoresLista(ArrayList<Trabajador> trabajadoresLista) {
        this.trabajadoresLista = trabajadoresLista;
    }
}
