package Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Introducir un entero no negativo, y convertirlo a binario, octal y hexadecimal. (BinarioOctalHexadecimal)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el número a convertir");
        int numero1 = LeerTeclado.nextInt();
        int numero2 = numero1;
        int numero1_Octal = numero1;
        int numero2_Octal = numero1;
        int numero1_hexa = numero1;
        int numero2_hexa = numero1;
        int i = 65536;

        String binario = "";
        String octal = "";
        String octalVerdadero = "";
        String hexadecimal = "";
        String hexadecimalVerdadero= "";


            while (numero1>0){
                i /= 2;
                while (i<=numero2 && i>0){
                    numero1 -=i;

                    if(numero1>=0){
                        binario += "1";
                    } else {
                        binario += "0";
                    }

                    if (numero1<0){
                        numero1 +=i;
                    }
                    i /= 2;
                }


            }

            while (numero1_Octal>0){
            numero2_Octal = numero1_Octal%8;
            numero1_Octal /=8;

                octal+=numero2_Octal;

            }
        for (int z = 0; z < octal.length(); z++) {
            octalVerdadero += octal.charAt(octal.length()-1-z);
        }

            while (numero1_hexa>0){
            numero2_hexa = numero1_hexa%16;
            numero1_hexa /=16;

            if (numero2_hexa>=10){
                switch (numero2_hexa){
                    case 10-> hexadecimal+="A";
                    case 11-> hexadecimal+="B";
                    case 12-> hexadecimal+="C";
                    case 13-> hexadecimal+="D";
                    case 14-> hexadecimal+="E";
                    case 15-> hexadecimal+="F";

        }
            } else if (numero2_hexa<10) {
                hexadecimal+=numero2_hexa;

            }
        }
        for (int j = 0; j < hexadecimal.length(); j++) {
            hexadecimalVerdadero += hexadecimal.charAt(hexadecimal.length()-1-j);
        }







        System.out.println("El número en binario es: "+binario);
        System.out.println("El número en octal es: "+octalVerdadero);
        System.out.println("El número en hexadecimal es: "+hexadecimalVerdadero);

    }




}



