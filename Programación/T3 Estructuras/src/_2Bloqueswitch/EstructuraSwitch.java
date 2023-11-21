package _2Bloqueswitch;

public class EstructuraSwitch {
    public static void main(String[] args) {

        int numero = 2;
        String palabra;
        char letra;

        switch (numero){
            case 1:
                palabra = "palabra1";
                break;
            case 2:
                palabra = "palabra2";
                break;
            case 3:
                palabra = "palabra3";
                break;
            default:
                palabra = "palabra sin";
                break;


        }
        switch (palabra){
            case "palabra1":
                 letra = 'A';
                 break;
            case "palabra2":
                letra = 'B';
                break;
            case "palabra3":
                letra = 'C';
                break;
            default:
                letra = 'D';
                break;

        }

        System.out.println("Ejercutado fuera del switch");
        System.out.println("Ejutando fuera del switch palabra");
        System.out.println("Ejutando fuera del switch letra");

        switch (letra){
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            default:
                break;


        }
    }
}
