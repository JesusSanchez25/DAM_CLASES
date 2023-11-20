package _1bloqueif;

public class Estructuraif {
    public static void main(String[] args) {

        int numero = 9;
        String resultado;

        //número entre 0 y 100?

        if(numero >= 0 && numero<=100){
            resultado = "Número en rango"; //Variable de bloque, no se puede aceder desde fuera
            System.out.println("Número está en rango");
        } else {
            resultado = "Número no en rango";
            System.out.println("Número no está en rango");
        }
        System.out.println("Ejecución continuada");
        System.out.println(resultado);


    }


}
