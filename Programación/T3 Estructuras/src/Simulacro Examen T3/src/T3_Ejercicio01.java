import java.util.Scanner;

public class T3_Ejercicio01 {

    public static void main(String[] args){
        //Realizar un programa que permita números mayores o iguales a cero por teclado hasta
        //que se introduzca un número negativo y nos visualice el siguiente menú:
        //
        //1-Suma de los números pares introducidos.
        //2-Media de los números pares introducidos con dos decimales.
        //3-Media de los números impares introducidos con dos decimales.
        //4-Cuántos números hemos introducido.
        //5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares
        //y cuantos impares.
        //6.-Salir.

        Scanner scanner = new Scanner(System.in);
        int numero1;
        int contadorTotales= 0;
        int ContadorCeros= 0;
        double contadorPares =0.0;
        double contadorImpares = 0.0;
        double sumaPares = 0.0;
        double sumaImpares = 0.0;
        int opcion = 0;


        do {
            System.out.println("Inserte un número positivo");
            numero1 = scanner.nextInt();
            contadorTotales++;
            if (numero1%2==0 && numero1!=0){
                contadorPares++;
                sumaPares+=numero1;
            } else if (numero1%2==1 ){
                contadorImpares++;
                sumaImpares+=numero1;
            } else if (numero1==0){
                ContadorCeros++;
            }

            } while (!(numero1 <0));

        Double mediaPares= sumaPares/contadorPares;
        Double mediaImpares= sumaImpares/contadorImpares;

        while (opcion!=6){
            System.out.println("\nElige una de estas opciones");
            System.out.println("1-Suma de los números pares introducidos");
            System.out.println("2-Media de los números pares introducidos con dos decimales.");
            System.out.println("3-Media de los números impares introducidos con dos decimales.");
            System.out.println("4-Cuántos números hemos introducido.");
            System.out.println("5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares y cuantos impares.");
            System.out.println("6.Salir.");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1-> System.out.println("La suma de los números pares es: "+sumaPares);
                case 2-> System.out.printf("La media de los números pares es: %.2f",mediaPares);
                case 3-> System.out.printf("La media de los números impares es: %.2f",mediaImpares);
                case 4-> System.out.println("El número total de números introducidos es: "+contadorTotales);
                case 5-> System.out.println("La cantidad de ceros ha sido: "+ContadorCeros);

            }

        }
        System.out.println("Saliendo...");


    }

}