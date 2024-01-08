import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        //19. Permítase introducir el valor con IVA de una compra con dos decimales (la compra
        //no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha compra
        //(valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA? ¿Cuánto fue el IVA?
        //Muéstrese los resultados redondeados a dos decimales. (Compra)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Escribe el valor de la compra");
        Double valorCompra = LeerTeclado.nextDouble();
        System.out.println("Escribe el valor del iva");
        Double valorIVA = LeerTeclado.nextDouble();

        Double CosteSinIva = valorCompra/(valorIVA+100)*100;
        Double CosteDelIva = CosteSinIva*(valorIVA/100);
        System.out.printf("%.2f\n",CosteSinIva);
        System.out.printf("%.2f\n",CosteDelIva);
    }


}
