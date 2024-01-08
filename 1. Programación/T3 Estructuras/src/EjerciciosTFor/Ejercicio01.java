package EjerciciosTFor;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //1. Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
        // Obténgase la media con dos decimales de las temperaturas inroducidas por consola. (TemperaturasIntroducidas)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Inserte el número de temperaturas a introducir");
        int numero = LeerTeclado.nextInt();
        Double media = 0.00;
        if (numero<=0){
            numero = 10;
        }

        for (int i = 0; i < numero; i++) {
            System.out.printf("\nInserte la %dº temperatura", (i+1));
            int temperatura = LeerTeclado.nextInt();
            media +=temperatura;
    }
        System.out.printf("\nLa media de las temperaturas es de: %.2f",(media/numero));
}
}
