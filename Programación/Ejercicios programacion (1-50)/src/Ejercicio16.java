import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        //Hágase un programa que convierta segundos en horas, minutos y segundos.

        Scanner LecturaTeclado = new Scanner(System.in);
        System.out.print("Introduce el número de segundos que desea convertir");
        int numeroSegundos = LecturaTeclado.nextInt();

        int horas = numeroSegundos/3600;
        int minutos = numeroSegundos%3600/60;
        int segundos = numeroSegundos%3600-minutos*60;

        System.out.println("Horas: " +horas);
        System.out.println("minutos: " +minutos);
        System.out.println("segundos: " +segundos);


    }
}