package ArrayListEjercicios.MarcaCoches.Ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio8_Coches {
    //5. Crea un programa que permita meter una lista de coches, donde cada coche consta de marca
    // (String), modelo (String) y caballos (int). Mete tres coches manualmente
    //6. Modifica el ejercicio anterior para que una vez metodos los coches se listen todos con
    // el siguiente formato: "Modelo: Ford	Marca: Focus	CV: 100"
    //7. Modifica el ejercicio anterior para que pida por teclado una marca y muestre por
    // consola todos los coches que sean de la marca introducida
    //8. Crea un programa que permita realizar las funcionalidades de los ejercicions 5, 6 y 7
    // mediante un menú

    ArrayList<Object[]> listaCoches;
    Scanner scanner = new Scanner(in);
    public void iniciarEjercicio(){
        Scanner scanner = new Scanner(in);
        iniciarlista();
        int respuesta;

        do {
            System.out.println("Escribe en la opción que desea realizar");
            System.out.println("1. Añadir coches");
            System.out.println("2. Mostrar coches");
            System.out.println("3. Filtrar datos");
            System.out.println("4. Reprogramar coches");
            System.out.println("5. Salir");
            respuesta = scanner.nextInt();

            switch (respuesta){
                case 1-> añadirCoches();
                case 2-> MostrarCoches();
                case 3-> filtrarDatos();
                case 4-> reprogramarCoches();
                case 5-> System.out.println("Saliendo...");
                default -> System.out.println("Inserte un número entre las opciones");
            }

            System.out.print("\nPulse cualquier tecla para continuar");
            scanner.next();
        }while (respuesta != 5);



    }


    private void iniciarlista (){
        listaCoches = new ArrayList<>();
        // marca modelo cv --> coche
        Object[] coche1 = new Object[]{"Ford", "Focus", 150};
        Object[] coche7 = new Object[]{"Ford", "Mustang", 300};
        Object[] coche3 = new Object[]{"Seat", "León", 120};
        Object[] coche6 = new Object[]{"Seat", "Ibiza", 130};
        listaCoches.add(coche1);
        listaCoches.add(coche3);
        listaCoches.add(coche6);
        listaCoches.add(coche7);

        //Puedes sacar una posición concreta de cada array de la lista
        //System.out.println("Los caballos del Seat León son: "+listaCoches.get(2)[2]);
    }

    private void añadirCoches(){
        int cantidadCoches = 0;
        for (int i = 0; i < 1; i++) {
            try{
                System.out.println("Ingrese la cantidad de coches a añadir:");
                cantidadCoches = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Debes introducir un número");
                i--;
            }
        }



        for (int i = 0; i < cantidadCoches; i++) {
            System.out.println("Inserte la marca del coche, el modelo y los caballos separados por *comas*");

            String input = scanner.nextLine();

            Object[] coche = new Object[3];
            String[] partes = input.split(",");

            //Inserta marca, modelo y caballos(este como int)
            if (partes.length == 3) {
                coche[0] = partes[0].trim();
                coche[1] = partes[1].trim();
                coche[2] = Integer.valueOf((partes[2]).trim());
            } else {
                System.out.println("Formato incorrecto. Ingrese la información correctamente.");
                i--;

            }

            if (coche[0]!=null){
                listaCoches.add(coche);
            }
        }





    }

    private void MostrarCoches (){

        for (Object[] coche : listaCoches) {
            System.out.printf("Marca: %s, Modelo: %s, Caballos: %d\n", coche[0],coche[1],coche[2]);
        }

    }

    private void filtrarDatos (){
        //sacar todos los coches de una marca pedida por parámetros
        System.out.println("Inserte la marca y los caballos mínimos separados por *comas*");
        String input = scanner.nextLine();
        String marca = input.substring(0, input.indexOf(','));
        int caballos = Integer.parseInt(input.substring(input.indexOf(',')+1).trim());

        System.out.println("Los coches encontrados son:");
        for (Object[] coche : listaCoches) {
            if (coche[0].toString().equalsIgnoreCase(marca) && (int)coche[2]>caballos){
                System.out.println(coche[0]+","+coche[1]+","+coche[2]);
            }
        }


    }

    private void reprogramarCoches (){
        Scanner scanner = new Scanner(in);
        System.out.println("Inserte la marca y los caballos a sumar, separados por *comas*");
        String input = scanner.nextLine();
        String marca = input.substring(0, input.indexOf(','));
        int caballos = Integer.parseInt(input.substring(input.indexOf(',')+1).trim());

        for (Object[] coche : listaCoches) {
            if (coche[0].toString().equalsIgnoreCase(marca)){
                coche[2] = (int)coche[2]+caballos;

            };
        }


    }


}
