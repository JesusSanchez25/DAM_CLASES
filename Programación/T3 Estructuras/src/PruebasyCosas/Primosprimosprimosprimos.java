package Ejercicios;

public class Primosprimosprimosprimos {
    public static void main(String[] args) {
        System.out.println(esPrimo(16999999));
    }
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
