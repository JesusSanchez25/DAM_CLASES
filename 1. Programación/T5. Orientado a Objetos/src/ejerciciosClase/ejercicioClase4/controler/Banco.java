package ejerciciosClase.ejercicioClase4.controler;

import ejerciciosClase.ejercicioClase4.model.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Banco {

    private ArrayList<Cuenta> cuentas;
    public Banco(){
        cuentas = new ArrayList<>();
    }

    public void iniciarSistema(){
        Scanner scanner = new Scanner(in);
        int respuesta = 0;

        System.out.println("BBVA o SANTANDER?");
        System.out.println("Entrando a " + scanner.next());

        while (respuesta != 6) {
            System.out.println("Elige la opción que desees");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Ver cuentas de un cliente");
            System.out.println("5. Ver todas las cuentas");
            System.out.println("6. Salir");
            respuesta = scanner.nextInt();


            switch (respuesta) {
                case 1:
                    System.out.println("Inserte el dni, el pin y el saldo inicial");
                    cuentas.add(new Cuenta(scanner.next(), scanner.next(), scanner.nextInt()));
                    break;
                // PONER EN TODOS VERIFICACIÓN DE DNI
                case 2:
                    System.out.println("Inserte el dni y el pin");
                    String dni = scanner.next();
                    String pin = scanner.next();

                    for (Cuenta item : cuentas) {
                        if (dni.equalsIgnoreCase(item.getDni()) && pin.equalsIgnoreCase(item.getPin()) ){
                            System.out.println("Inserte el dinero a ingresar");
                            item.ingresarDinero(scanner.nextInt());

                        }
                    }
                    break;

                case 3:
                    System.out.println("Inserte el dni y el pin");
                    dni = scanner.next();
                    pin = scanner.next();

                    for (Cuenta item : cuentas) {
                        if (dni.equalsIgnoreCase(item.getDni()) && pin.equalsIgnoreCase(item.getPin()) ){
                            System.out.println("Inserte el dinero a sacar");
                            item.sacarDinero(scanner.nextInt());

                        }
                    }
                    break;


                case 4:
                    System.out.println("Inserte el dni");
                    dni = scanner.next();

                    for (Cuenta item : cuentas) {
                        if (dni.equalsIgnoreCase(item.getDni())){
                            item.mostrarDatos(dni);
                        }
                    }
                    break;

                case 5:

                    for (Cuenta item : cuentas) {
                        item.mostrarDatos(item.getDni());

                        }

                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }

        }


    }






}
