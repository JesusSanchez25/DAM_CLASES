package ArrayEjercicios;

import java.util.Scanner;

import static java.lang.System.in;

public class Clase09_Prueba {
    public static void main(String[] args) {
        //1. (MenuArray)Crear un programa que mediante un menú permita:
        //    - Crear un array de números enteros con n posiciones pedidas.
        //    - Rellenar el array creado con números aleatorios.
        //    - Rellenar el array creado con números pedidos por consola.
        //    - Ordenar el array de mayor a menor
        //    - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud
        //    (si esta es inferior a la que la existe continuar pidiendo)
        //    - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
        //    - Mostrar por pantalla el array según está

        int resultado1;
        int[] numeros = new int[1];
        int[] numerosOrdenados = new int[numeros.length];
        int NumeroMásGrande;
        int posicionPalabra = 0;
        int longitudAmpliada;
        Scanner scanner = new Scanner(in);


        while (true) {
            System.out.println("Elige una opción a relaizar");
            System.out.println("1. Crear un array de números enteros con n posiciones pedidas");
            System.out.println("2. Rellenar el array con números aleatorios");
            System.out.println("3. Rellenar el array creado con númros pedidos por consola");
            System.out.println("4. Ordenar el aray de mayor a menor");
            System.out.println("5. Clonar el array con una mayor longitud");
            System.out.println("6. Mover todas las posiciones a un lado");
            System.out.println("7. Mostrar en pantalla ");
            resultado1 = scanner.nextInt();

            switch (resultado1) {
                case 1:
                    System.out.println("Inserte la longitud del array");
                    numeros = new int[scanner.nextInt()];
                    numerosOrdenados = new int[numeros.length];



                    break;
                case 2:
                    for (int i = 0; i < numerosOrdenados.length; i++) {
                        numeros[i] = (int) (Math.random() * 11);
                    }
                    numerosOrdenados = numeros;

                    break;
                case 3:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Inserte el número a implementar");
                        numeros[i] = scanner.nextInt();
                    }
                    numerosOrdenados= numeros;
                    break;
                case 4:
                    for (int i = 0; i < numeros.length; i++) {
                        NumeroMásGrande = numerosOrdenados[0];
                        for (int j = 0; j < numeros.length; j++) {
                            if (numerosOrdenados[j] >= NumeroMásGrande) {
                                NumeroMásGrande = numeros[j];
                                posicionPalabra = j;
                            }
                        }
                        numerosOrdenados[numeros.length - i - 1] = NumeroMásGrande;
                        numeros[posicionPalabra] = -1;
                    }


                    break;
                case 5:
                    do {
                        System.out.println("Inserte la nueva longitud a duplicar");
                        longitudAmpliada = scanner.nextInt();
                    } while (longitudAmpliada < numeros.length);

                    int[] numerosAmpliado = new int[longitudAmpliada];
                    int j = 0;
                    for (int i = 0; i < longitudAmpliada; i++) {
                        if (numerosOrdenados.length * (j + 1) < i + 1) {
                            j++;
                        }
                        if (i < numeros.length) {
                            numerosAmpliado[i] = numerosOrdenados[i];
                        } else {
                            numerosAmpliado[i] = numerosOrdenados[i - (numeros.length * j)];
                        }
                        System.out.print(numerosAmpliado[i] + ", ");
                    }
                    numerosOrdenados = numerosAmpliado;
                    numeros = numerosOrdenados;

                    break;
                case 6:
                    System.out.println("Elige dirreción para mover");
                    System.out.println("1.Derecha");
                    System.out.println("2.Izquierda");
                    final int Aux1 = numerosOrdenados[numerosOrdenados.length-1];
                    final int Aux2 = numerosOrdenados[0];
                    int respuesta = scanner.nextInt();
                    for (int i = 0; i < numerosOrdenados.length; i++) {

                        switch (respuesta) {
                            case 1:
                                if(i==numerosOrdenados.length-1){
                                    numerosOrdenados[0]=Aux1;
                                } else {
                                    numerosOrdenados[numerosOrdenados.length-i-1]=numerosOrdenados[numerosOrdenados.length-i-2];

                                }
                                break;

                            case 2:
                                if(i==numerosOrdenados.length-1){
                                    numerosOrdenados[numerosOrdenados.length-1]=Aux2;
                                } else {
                                    numerosOrdenados[i]=numerosOrdenados[i+1];

                                }


                                break;


                        }







            }
                case 7:
                    for (int numero : numerosOrdenados) {
                        System.out.print(numero+ ", ");
                    }
                    System.out.println("");

                    break;


        }
    }
}}
