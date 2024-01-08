import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu peso (kg)");
        Double peso = scanner.nextDouble();
        System.out.println("Dime tu altura (m)");
        Double altura = scanner.nextDouble();
        Double imc = (Double) peso/(Math.pow(altura,2));
        System.out.printf("\nTu imc es de: %.2f",imc);

        if (imc<18.6){
            System.out.println("\nTienes un peso bajo");
        }
        else if (imc < 25){
            System.out.println("\nTienes un peso normal");
        }
        else if (imc<30){
            System.out.println("\nTienes soobrepreso bro");
        }
        else if (imc<35){
            System.out.println("\ntienes obesidad leve");
        }
        else {
            System.out.println("\nmaldito gordo");
        }

    }
}
