package Ejerciciosif;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws InterruptedException{


        //Pedir el día, mes y año de una fecha e indicar si la fecha
        // es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el día del mes");
        int dia = LeerTeclado.nextInt();
        System.out.println("Inserte el mes del año");
        int mes = LeerTeclado.nextInt();
        System.out.println("Inserte el año");
        int año = LeerTeclado.nextInt();



        if(dia<=31 && dia>0 && mes<=12 && mes>0 && año>=0){

            if (dia==31 && (mes==2||mes==4||mes==6||mes==9||mes==11)){
                System.out.println("La fecha introducida es incorrecta");
            } else if (dia>28 && mes==2){
                System.out.println("La fecha introducida es incorrecta");
            } else {
                System.out.println("La fecha introducida es correcta");
            }

        } else {System.out.println("La fecha introducida es incorrecta");

        }
    }
}
