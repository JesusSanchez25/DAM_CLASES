package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o
        // descendentemente. Se mostrarán los valores leídos ordenados.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        Integer numero1 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        Integer numero2 = LeerTeclado.nextInt();
        System.out.println("Inserte otro número entero");
        Integer numero3 = LeerTeclado.nextInt();
        System.out.println("Indica `True` para ordenarlos ascendentemente o `False` para ordenarlos descendentemente ");
        boolean orden = LeerTeclado.nextBoolean();

        int posicion1 =0;
        int posicion2 =0;
        int posicion3 =0;

            if(numero1<=numero2){
                if(numero3<=numero1){
                    posicion1 = numero3;
                    posicion2 = numero1;
                    posicion3 = numero2;
                } else if (numero3>=numero2){
                    posicion1 = numero1;
                    posicion2 = numero2;
                    posicion3 = numero3;
                } else {
                    posicion1 = numero1;
                    posicion2 = numero3;
                    posicion3 = numero2;
                }
            }if(numero1>numero2){
                if(numero3<=numero2){
                    posicion1 = numero3;
                    posicion2 = numero2;
                    posicion3 = numero1;
                } else if (numero3>=numero1){
                    posicion1 = numero2;
                    posicion2 = numero1;
                    posicion3 = numero3;
                } else {
                    posicion1 = numero2;
                    posicion2 = numero3;
                    posicion3 = numero1;
                 }
            }
            int posicion1_5 = posicion1;

            if(!orden){
                posicion1 = posicion3;
                posicion3 = posicion1_5;


        }
        System.out.println(posicion1+","+posicion2+","+posicion3);





    }
}
