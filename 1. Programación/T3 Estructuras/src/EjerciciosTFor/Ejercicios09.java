package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios09 {
    public static void main(String[] args) {
        //Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)
        Scanner LeerTeclado = new Scanner(System.in);


        int suma = 0;
        int mayores1000€ = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("\nInserte el %dº sueldo",i+1);
            int sueldos = LeerTeclado.nextInt();
            suma += sueldos;
            if (sueldos>1000){mayores1000€++;}
        }
        System.out.println("La suma de todos los sueldos es de: "+suma);
        System.out.println("La media de todos los sueldos es de: "+suma/10);
        System.out.println("La cantidad de sueldos mayores de 1000€ es de: "+mayores1000€);
    }
}
