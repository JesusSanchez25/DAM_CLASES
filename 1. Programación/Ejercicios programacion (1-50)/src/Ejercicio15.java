import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        final double PRECIO_BOCADILLO =2.05;
        final double PRECIO_BEBIDA =1.25;

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("cuantas bebidas: ");
        int numeroBebidas = LeerTeclado.nextInt();
        System.out.println("cuantos bocadillos: ");
        int numeroBocadillos = LeerTeclado.nextInt();
        double precioBocadillosTotal = numeroBocadillos*PRECIO_BOCADILLO;
        double precioBebidasTotal = numeroBebidas*PRECIO_BEBIDA;
        double precioTotal = precioBebidasTotal+precioBocadillosTotal;
        System.out.printf("El precio de los bocadillos es de: %.2f\n", precioBocadillosTotal);
        System.out.printf("El precio de las bebidas es de: %.2f\n", precioBebidasTotal);
        System.out.printf("El precio total por persona es de: %.2f\n", precioTotal);


    }
}
