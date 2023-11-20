package Ejerciciosif;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //12. Leer un número entero, se realizarán las siguientes acciones:
        //    - incrementará en 2 unidades si es par
        //    - en 3 unidades si es múltiplo de 3
        //    - en 5 unidades si es múltiplo de 5
        //    - en el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte un número entero");
        Integer numero1 = LeerTeclado.nextInt();

        int resultado = numero1;
        if(numero1%2==0){
            resultado += 2;
        } else if (numero1%3==0){
            resultado +=3;
        } else if(numero1%5==0){
            resultado +=5;
        } if (resultado==numero1){
            resultado +=1;
        }
        System.out.println(resultado);
    }
}

