import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //En una clase llamada Ejercicio3, calcula la cantidad que debe pagar un cliente en la
        //compra de un coche a plazos en un periodo determinado, siendo el interés mensual
        //
        //progresivo del 3.5 %. Lo primero que debes pedir por consola es el precio del coche
        //y en cuantos plazos se va a pagar. Una vez introducido esto aparecerá el siguiente
        //texto (para un valor de 30.000 y en un plazo de 6, siendo estos datos un ejemplo):
        //“Vas a pagar el coche de 30000€ en 6 meses, con un total de 5000€ cada plazo (sin
        //tener en cuenta los intereses)”

        Scanner LeerTeclado = new  Scanner(System.in);

        System.out.println("Dime la cantidad a pagar");
        final Double DEUDA = LeerTeclado.nextDouble();
        System.out.println("Dime los meses para realizar el pago");
        final Double MESESPAGAR = LeerTeclado.nextDouble();
        Double DineroMes = DEUDA/MESESPAGAR;
        System.out.printf("Vas a pagar el coche de %.0f€ en %.0f meses, con un total de %.2f€ cada plazo (sin tener en cuenta " +
                "los intereses)", DEUDA, MESESPAGAR,DineroMes);
    }
}
