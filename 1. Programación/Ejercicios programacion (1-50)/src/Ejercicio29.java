import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        //Permítase introducir tres números reales de dos decimales. Compruébese
        //(mostrándose verdadero o falso) si la suma de los dos primeros valores es igual al
        //tercero. (CompararReales)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Introduce el primer");
        int numero1 = LeerTeclado.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = LeerTeclado.nextInt();
        System.out.println("Introduce el tercer número");
        int numero3 = LeerTeclado.nextInt();

        boolean Comprobacion = (numero1+numero2)==numero3;
        System.out.println("el primer dígito es: "+numero1);
        System.out.println("el segundo dígito es: "+numero2);
        System.out.println("el tercer dígito es: "+numero3);
        System.out.println("La suma de los dos primeros es el tercero "+Comprobacion);

    }
}
