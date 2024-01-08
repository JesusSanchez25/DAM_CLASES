 package PruebasyCosas;

public class PrototipoDeEstrella {
    public static void main(String[] args) {

        int tamaño = 5;
        int espacios = tamaño+5;
        int asteriscos[]= new int[]{1,5,13,9,3,1};

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos.length; j++) {
                for (int k = 0; k < asteriscos[j]; k++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
