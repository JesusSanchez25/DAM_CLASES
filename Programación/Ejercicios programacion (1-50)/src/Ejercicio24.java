import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        //Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas,
        //decenas y unidades), y se obtiene el número correspondiente. (Numero)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Introduce el primer dígito");
            int digito1 = LeerTeclado.nextInt();
        System.out.println("Introduce el segundo dígito");
            int digito2 = LeerTeclado.nextInt();
        System.out.println("Introduce el primer dígito");
            int digito3 = LeerTeclado.nextInt();
        System.out.println("Introduce el primer dígito");
            int digito4 = LeerTeclado.nextInt();
        System.out.println("Introduce el primer dígito");
            int digito5 = LeerTeclado.nextInt();

        System.out.printf("Número entero: %d%d%d%d%d",digito1,digito2,digito3,digito4,digito5);
    }
}
