import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        //Dado un número natural entre 0 y 9999, ambos inclusive, se descompondrá el número
        //en sus digitos. Por ejemplo, el 9056 se descompone en 9 0 5 6. (Descomponer)

        Scanner LeerTeclado = new Scanner(System.in);
        System.out.println("Introduce el número en cuestión");
        int numero1 = LeerTeclado.nextInt();
        int digito1 = numero1/1000;
        int digito2 = numero1/100-digito1*10;
        int digito3 = numero1/10-digito1*100-digito2*10;
        int digito4 = numero1-digito1*1000-digito2*100-digito3*10;

        System.out.println("el primer dígito es: "+digito1);
        System.out.println("el segundo dígito es: "+digito2);
        System.out.println("el tercer dígito es: "+digito3);
        System.out.println("el cuarto dígito es: "+digito4);
    }
}
