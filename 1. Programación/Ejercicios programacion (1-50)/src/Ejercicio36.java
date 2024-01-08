import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        //Permítase introducir un carácter cualquiera. Compruébese (mostrándose verdadero o
        //falso) las siguientes condiciones:
        //a) El carácter introducido es un dígito
        //b) La letra es una vocal (minúscula o mayúscula con o sin acento y diéresis)
        //(CaracterDigitoLetra)

        Scanner LeerTeclado = new Scanner(System.in);
        String caracterRandom = LeerTeclado.next();
        Boolean comprobanteDígito = caracterRandom==caracterRandom;//NI idea literal
        System.out.println(comprobanteDígito);
    }
}
