package T3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3. Realiza un programa que simule el funcionamiento de la lotería. Para ello nada
        //más empezar realiza las siguientes acciones:
        //a. Genera un número aleatorio entre 1000 y 9999
        //b. Pide al usuario que introduzca un número de 4 dígitos (en el caso de no
        //meter un número que cumpla la condición lo seguirá pidiendo hasta que
        //lo introduzca).
        //Una vez realizado estas acciones el sistema deberá mostrar cual es el premio
        //obtenido, mostrando los siguientes mensajes:
        //- “Has ganado 10 euros” en el caso de acertar las unidades
        //- “Has ganado 100 euros” en el caso de acertar las unidades y las decenas
        //- “Has ganado 1000 euros” en el caso de acertar unidades, decenas y
        //centenas
        // - “Enhorabuena has ganado 10000 euros” en el caso de acertar todos los
        //números

        Scanner scanner = new Scanner(System.in);

        Integer numeroLoteria = (int)Math.floor((Math.random()*8999)+1000);
        Integer intentoLoteria;

        int unidades = 0;
        int decenas = 0;
        int centenas = 0;
        int miles = 0;

        do{System.out.println("Inserte un número de 4 dígitos");
            intentoLoteria = scanner.nextInt();
                if(intentoLoteria<0 || intentoLoteria>9999){
                    System.out.println("Número incorrecto, inténtalo de nuevo");}

            } while (intentoLoteria<0 || intentoLoteria>9999);



        for (int i = 0; i < 4; i++) {

            char cifraIntento= intentoLoteria.toString().charAt(i);
            char cifraNumero= numeroLoteria.toString().charAt(i);


            switch (i) {
                case 0 -> {
                    if (cifraIntento==cifraNumero) {
                        miles++;
                    }
                }

                case 1 -> {
                    if (cifraIntento==cifraNumero) {
                        centenas++;
                    }
                }
                case 2 -> {
                    if (cifraIntento==cifraNumero) {
                        decenas++;
                    }
                }
                case 3 -> {
                    if (cifraIntento==cifraNumero) {
                        unidades++;
                    }
                }

            }

        }
            if (unidades==1 && decenas==1 && centenas==1 && miles==1){
                System.out.println("Enhorabuena has ganado 10000 euros");
            } else if (unidades==1 && decenas==1 && centenas==1){
                System.out.println("Enhorabuena has ganado 1000 euros");
            } else if (unidades==1 && decenas==1){
                System.out.println("Enhorabuena has ganado 100 euros");
            } else if (unidades==1){
                System.out.println("Enhorabuena has ganado 10 euros");
            }

    }
}
