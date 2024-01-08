package Ejerciciosif;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        //Pedir el día, mes y anio de una fecha correcta y mostrar la fecha del día siguiente.
        // suponer que todos los meses tienen 30 días excepto febrero que tiene 28.

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el día del mes");
        int dia = LeerTeclado.nextInt();
        System.out.println("Inserte el mes del anio");
        int mes = LeerTeclado.nextInt();
        System.out.println("Inserte el anio");
        int anio = LeerTeclado.nextInt();


        if(dia<=30 && dia>0 && mes<=12 && mes>0){

            if (dia>28 && mes==2){
                System.out.println("La fecha introducida es incorrecta");
            }

            else if (dia==28 && mes==2) {

                dia = 0;
                mes++;

            }

            else if (mes != 2){

                System.out.println("La fecha introducida es correcta");
                    dia++;

                    if (dia==31){
                    mes++;
                    dia=0;
                                }

                    if (mes==13){
                    anio++;
                    mes = 0;
                                }

                                             }

        }else {
            System.out.println("La solución es incorrecta");
                                                            }
        System.out.println(dia+"/"+mes+"/"+anio);
    }


}







