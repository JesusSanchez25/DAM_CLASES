package ejerciciosClase.ejercicioClase3_Agenda.controler;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Agenda {

    private ArrayList<Persona> agenda;


    public Agenda(){
        agenda = new ArrayList<Persona>();

    }

    public void agregarPersona(Persona persona) {

        for (Persona item : agenda) {
            if (item.getDni().equalsIgnoreCase(persona.getDni())) {
                System.out.println("DNI duplicado");
                return;
            }
        }
        agenda.add(persona);
        System.out.println("Persona agregada con éxito");

    }

    public void iniciarAgenda() {
        Scanner scanner = new Scanner(in);
        int respuesta = 0;
        while (respuesta != 6) {
            System.out.println("Elige la opción que desees");
            System.out.println("1: Agregar persona a la agenda");
            System.out.println("2: Borrar persona (según el DNI introducido)");
            System.out.println("3: Editar persona (según el DNI introducido)");
            System.out.println("4: Buscar persona (recupera la persona que tenga un DNI introducido)");
            System.out.println("5: Listar agenda (lista todos los contactos de la agenda con sus datos)");
            System.out.println("6. Salir");
            respuesta = scanner.nextInt();


            switch (respuesta) {
                case 1:
                    System.out.println("Inserte el nombre, dni y telefono separado por espacios");
                    agregarPersona(new Persona(scanner.next(), scanner.next(), scanner.nextInt()));
                    break;
                case 2:
                    System.out.println("Inserte el dni");
                    borrarPersona(scanner.next());
                    break;
                case 3:
                    System.out.println("Inserte el dni");
                    editarPersona(scanner.next());
                    break;

                case 4:
                    System.out.println("Inserte el dni");
                    buscarPersona(scanner.next());
                    break;
                case 5:
                    listarAgenda();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    break;
            }

        }


    }




    public void borrarPersona(String DNI) {

        for (Persona item : agenda) {
            if (item.getDni().equalsIgnoreCase(DNI)) {
                agenda.remove(item);
                System.out.println("Persona eliminada con éxito");
                return;
            }
        }
        System.out.println("No se ha encontrado el DNI en la base de datos");


    }

    public void editarPersona(String DNI) {
        for (Persona item : agenda) {
            if (item.getDni().equalsIgnoreCase(DNI)) {
                Scanner scanner = new Scanner(in);
                int respuesta = 0;
                while (respuesta != 3) {
                    System.out.println("Que dato quieres editar?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Teléfono");
                    System.out.println("3. Salir");
                    respuesta = scanner.nextInt();


                    switch (respuesta) {
                        case 1:
                            System.out.println("Inserte el nuevo nombre");
                            item.setNobre(scanner.next());
                            break;
                        case 2:
                            System.out.println("Inserte el nuevo número de tefléfono");
                            item.setTelefono(scanner.nextInt());
                            break;
                        case 3:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Inserte un número válido");
                            break;
                    }

                }


                return;

            }
        }
        System.out.println("No se ha encontrado el DNI en la base de datos");


    }

    public void buscarPersona(String DNI) {

        for (Persona item : agenda) {
            if (item.getDni().equalsIgnoreCase(DNI)) {
                System.out.println("Persona encontrada con exito");
                item.mostrarDatos();
                return;
            }
        }
        System.out.println("No se ha encontrado el DNI en la base de datos");


    }

    public void listarAgenda() {

        for (Persona item : agenda) {

            System.out.println("Contacto: ");
            item.mostrarDatos();
            System.out.println("");
        }
    }


}
