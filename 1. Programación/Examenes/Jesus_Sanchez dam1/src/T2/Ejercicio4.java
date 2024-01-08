
public class Ejercicio4 {
    public static void main(String[] args) {
        //Realiza una clase llamada Ejercicio4 y modifica el ejercicioanterior donde los datos
        //de compra y plazos son fijos (no pedidos por consola), siendo 30000 y 3,5
        //respectivamente. Añade la siguiente funcionalidad al ejercicio anterior para aplicar
        //el porcentaje progresivo. Deberá aparecer por pantalla los siguientes mensajes:
        //
        //• “El interés pagado (3,5) en el primer mes es de 1050” à3,5 de 30000
        //• “El interés pagado (7) en el segundo mes es de 1750” à 7 de 25000
        //• “El interés pagado (10,5) en el tercer mes es de 2100” à 10,5 de 20000
        //• “El interés pagado (14) en el cuarto mes es de 2500” à 14 de 15000
        //• “El interés pagado (17,5) en el quinto mes es de 1750” à 17,5 de 10000
        //• “El interés pagado (21) en el sexto mes es de 1050” à 21 de 5000


        System.out.println("Dime la cantidad a pagar");
        double deuda = 30000.0;
        System.out.println("Dime los meses para realizar el pago");
        final double MESESPAGAR = 6.0;
        System.out.println("Dime el interés del pago");
        double interes = 3.5;
        double InteresPagado1 = interes * deuda;

        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.0f\n", interes, interes/100 * deuda);
        System.out.printf("El interés pagado (%.2f) en el SEGUNDO mes es de %.0f\n", interes * 2, (interes/100 * 2) * (deuda - 5000));
        System.out.printf("El interés pagado (%.2f) en el TERCER mes es de %.0f\n", interes * 3, (interes/100 * 3) * (deuda - 10000));
        System.out.printf("El interés pagado (%.2f) en el CUARTO mes es de %.0f\n", interes * 4, (interes/100 * 4) * (deuda - 15000));
        System.out.printf("El interés pagado (%.2f) en el QUINTO mes es de %.0f\n", interes * 5, (interes/100 * 5) * (deuda - 20000));
        System.out.printf("El interés pagado (%.2f) en el SEXTO mes es de %.0f\n", interes * 6, (interes/100 * 6) * (deuda - 25000));
    }
}


