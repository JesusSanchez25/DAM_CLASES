package _Estructuras;
import java.util.Date;


public class Arrays{
    public static void main(String[] args) {
        int[] numeros = new int [5];
        int[] numerosElementos = new int[]{4,7,1,20};

        String[] palabras = new String[7];
        String[] palabrasElementos = new String[]{"hola","adios","que","tal"};
        
        Object[] arrayCosas = new Object[]{true,"hola",2,'A',new Date()};

        numeros[4]=8;
        System.out.println(numerosElementos[2]);


    }
}
