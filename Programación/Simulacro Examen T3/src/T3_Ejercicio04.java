import java.util.Locale;
import java.util.Scanner;

public class T3_Ejercicio04 {
    public static void main(String[] args) {
        //4. Pedir una palabra por teclado (sin acentos). Transformar esta palabra para:
        //a. Si su longitud es menor de 4, transformar todas sus letras en mayúsculas
        //b. Si su longitud es mayor igual que 4 pero menor que 8, transformar sus letras en
        //minúsculas
        //c. Si su longitud es mayor igual que 8 pero menor que 11, todas las vocales deberán
        //estar acentuadas
        //d. Si la longitud es mayor igual a 11 se deberá dar la vuelta a la palabra

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu palabra");
        String palabra = scanner.next();
        String palabraInvertida= palabra;

        if (palabra.length()<4){
            palabra = palabra.toUpperCase();
            System.out.println("Nueva palabra:"+palabra);
        } else if ((palabra.length()>4) && (palabra.length()<8)){
            palabra = palabra.toLowerCase();
            System.out.println("Nueva palabra:"+palabra);

        } else if ((palabra.length()>8) && (palabra.length()<11)){
            palabra=palabra.replace('a','á');
            palabra=palabra.replace('e','é');
            palabra=palabra.replace('i','í');
            palabra=palabra.replace('o','ó');
            palabra=palabra.replace('u','ú');
            System.out.println("Nueva palabra:"+palabra);

        } else {
            palabra= "";
            for (int i = 0; i < palabraInvertida.length(); i++) {
                palabra += palabraInvertida.charAt(palabraInvertida.length()-1-i);
            }
            System.out.println("Nueva palabra: "+palabra);
        }
    }
}
