package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicios10 {
    public static void main(String[] args) {
        //Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)

        Scanner LeerTeclado = new Scanner(System.in);
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        for (int i = 0; i < 6; i++) {
            System.out.printf("\nInserte la %dº nota",i+1);
            int numero = LeerTeclado.nextInt();

            if (numero>=5){
                aprobados++;
            } else if (numero<4){
                suspensos++;
            } else if (numero>=4){
                condicionados++;
            }else {
                System.out.println("la nota introducida es incorrecta");
            }
        }
        System.out.println("El número de aprobados es de: "+aprobados);
        System.out.println("El número de suspensos es de: "+suspensos);
        System.out.println("El número de condicionados es de: "+condicionados);


    }
}
