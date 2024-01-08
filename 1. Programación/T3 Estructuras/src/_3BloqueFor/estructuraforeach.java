package _3BloqueFor;

public class estructuraforeach {
    public static void main(String[] args) {
        // for ( elemento que itero : colección de datos)
        //                 4[0], 7[1], 12[2], 56[4]
        int[] numeros = new int[]{4,7,12,56,23,2,67,213,56,234,0};
       /* for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);*/

        // for (elemento que itero : coleción de datos)
        for (int item: numeros){
            System.out.println(item);
        }
        }
    }

