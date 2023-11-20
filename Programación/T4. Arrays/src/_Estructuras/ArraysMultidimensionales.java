package _Estructuras;

public class ArraysMultidimensionales {
    public static void main(String[] args) {
        int[][] carton = new int[2][4];
        //0 0 0 0
        //0 0 0 0
        int [][] cartonNumeros = new int[][]{{4,8,9,10},{20,30,23,7}};
        //4     8    9   10
        //20    30   23  7

        carton[1][3] = 20;
        System.out.println(carton[1][3]);


        //SACAR EL MENSAJE CON FOREACH
        for (int[] fila: cartonNumeros){;
            for(int numero:fila){
                System.out.print(numero+"");
            }
            System.out.println("");

    }



        //SACAR EL MENSAJE CON FORI
        for (int i = 0; i < cartonNumeros.length; i++) {
            //filas
            for (int j = 0; j < cartonNumeros[i].length; j++) {
                //letras
                System.out.println(cartonNumeros[i][j]);
            }
            System.out.println("");
        }


    }
}
