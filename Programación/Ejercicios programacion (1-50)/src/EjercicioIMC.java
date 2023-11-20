import java.lang.Math;
import java.util.Scanner;

public class EjercicioIMC {

    public static void main(String[] args) {
        Scanner Leerteclado = new Scanner(System.in);
        System.out.println("Dime tu altura en metros");
        double altura = Leerteclado.nextDouble();
        System.out.println("Dime tu peso");
        double peso = Leerteclado.nextDouble();
        double imc = Calcularimc(altura,peso);
        boolean enPeso = imc<23.9;


        System.out.println("El imc calculado es "+imc);
        System.out.println("¿Estás en peso? " +enPeso);

    }

    public static Double Calcularimc(double altura, double peso){

        Double imc = peso/Math.pow(altura,2);
        return imc;



    }
}
