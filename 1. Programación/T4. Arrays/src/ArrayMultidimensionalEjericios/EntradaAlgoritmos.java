package ArrayMultidimensionalEjericios;

import java.util.Scanner;

import static java.lang.System.in;

public class EntradaAlgoritmos {
    public static void main(String[] args) {

        //buscar un número;
            // mediante métodos buscar un número introducido por el usuario
            // el sistema dirá:
                    // Si el número no está: "Número no encontrado"
                    // El número está en la posición X

        int[] numeros = new int[]{1,3,74,42,23,45,1,234,4,69};

        Scanner scanner = new Scanner(in);

        System.out.println("Introduce el número a buscar");
        int busqueda = scanner.nextInt();

        if (estaNumero(busqueda, numeros)!=-1){
            System.out.println("El número está en la posición: "+ (estaNumero(busqueda,numeros)+1));

        } else {
            System.out.println("No se encuentra el número");
        }

        System.out.println("El número más grande es: "+MaxyMin(numeros)[0]);
        System.out.println("El número más pequeño es: "+MaxyMin(numeros)[1]);


    }


    public static int estaNumero (int busqueda, int[] array){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==busqueda){
                return i;
            }
        }
        return -1; //Si no se encuentra el número devuelve un -1

    } //También se puede hacer creando un array de objetos en el cual devuelva un boolean(si está o no)
      // y la posición en la que se encuentra


    public static int[] MaxyMin (int[] array){
        int Max= array[0];
        int Min= array[0];

    for (int numero : array) {
            if (numero>Max){
                Max= numero;
            }
            if (numero<Min){
                Min= numero;
            }

    }
     return new int[]{Max,Min};
    }
}



