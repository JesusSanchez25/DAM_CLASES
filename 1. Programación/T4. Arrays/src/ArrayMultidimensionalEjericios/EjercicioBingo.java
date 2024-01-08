 package ArrayMultidimensionalEjericios;

public class EjercicioBingo {
    public static void main(String[] args) {


        int[][] carton = new int[3][10];
        int[][] cartonCopia = new int[3][10];




        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                do {
                    carton[i][j]=(int)(Math.random()*100);
                } while (está(carton[i][j], cartonCopia));

                cartonCopia[i][j]=carton[i][j];
                System.out.print(carton[i][j]+", ");
            }
            System.out.println("");
        }}





    public static boolean está (int numeroGenerado, int[][] carton){

        for (int[] fila : carton) {
            for (int numeroColumna : fila) {
                if (numeroColumna == numeroGenerado){
                    return true;
                }
            }
        }
        return false;




    }
}













