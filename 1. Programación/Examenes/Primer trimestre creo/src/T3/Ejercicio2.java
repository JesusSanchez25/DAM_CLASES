package T3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //2. Realiza un programa que permita abrir una caja fuerte. Para ello, crea una
        //variable donde guardas la clave de apertura (número de 4 dígitos). A
        //continuación, el sistema empieza a pedir números al usuario para que pueda
        //abrir la caja. El usuario contará con 4 intentos. El programa podrá ejecutar los
        //siguientes casos:
        //a. Si el usuario falla en su intento y todavía no ha agotado intentos
        //aparecerá el mensaje “Intento fallido, prueba de nuevo”
        //b. Si el usuario falla en su intento apareceré le mensaje de “Lo siento, caja
        //bloqueada”
        //c. Si el usuario adivina la combinación en 4 intentos o menos aparecerá el
        //mensaje “Perfecto, la caja ha sido abierta”

        Scanner scanner = new Scanner(System.in);

        int apertura = 9999;
        int intentoApertura;
        int contadorIntentos = 0;

        do {
            contadorIntentos++;

            System.out.println("Inserte la clave");
            intentoApertura = scanner.nextInt();
            if ((intentoApertura!=apertura) && (contadorIntentos<4)){
                System.out.println("Clave incorrecta, inténtalo de nuevo ");

            } else if (intentoApertura==apertura){
                System.out.println("Perfecto, la caja ha sido abierta");

            } else {
                System.out.println("Lo siento, caja bloqueada");
            }




        } while (contadorIntentos<4 && apertura!=intentoApertura);



    }
}
