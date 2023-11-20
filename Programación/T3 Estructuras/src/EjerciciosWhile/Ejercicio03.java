package Ejercicios;

public class Ejercicio03 {
    public static void main(String[] args) {
    //Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
        // El programa mostrará cada uno de los datos generados y obtendrá el
        // mayor de los números generados. (MayorNumero)

        int numeroRandom; //No hace falta inicializarlo porque se le va a dar valor sçi o sí con el do
        int mayorNumero = 0;
       do{
            numeroRandom = (int)Math.floor(Math.random()*101);
            System.out.println(numeroRandom);
            if (numeroRandom>mayorNumero){
                mayorNumero = numeroRandom;
            }
        }  while (numeroRandom !=0);
        System.out.println("El mayor número generado ha sido "+mayorNumero);


    }
}
