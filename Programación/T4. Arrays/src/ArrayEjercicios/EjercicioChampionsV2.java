package ArrayEjercicios;

public class EjercicioChampionsV2 {
    public static void main(String[] args) {
        String[] bombo1 = new String[]{"Equipo1","Equipo2","Equipo3","Equipo4","Equipo5",};
        String[] bombo2 = new String[]{"Equipo6","Equipo7","Equipo8","Equipo9","Equipo10",};
        String[] equiposSalidos1 = new String[5];
        String[] equiposSalidos2 = new String[5];

        for (int i = 0; i < bombo1.length; i++) {
            int aleatorioUno, aleatorioDos;


            do{
                aleatorioUno = (int)(Math.random()*5);
                aleatorioDos = (int)(Math.random()*5);
            } while(esta(bombo1, aleatorioUno, equiposSalidos1)||esta(bombo2, aleatorioDos, equiposSalidos2));



            System.out.println(bombo1[aleatorioUno] +" vs "+ bombo2[aleatorioDos]);

            equiposSalidos1[i]=bombo1[aleatorioUno];
            equiposSalidos2[i]=bombo2[aleatorioDos];

        }


    }

    public static boolean esta (String[] bombo, int j, String[] equiposSacados){
        boolean esta = false;
        for (int i = 0; i < equiposSacados.length; i++) {
            if (bombo[j].equals(equiposSacados[i])){

                return esta=true;
            }
        }



        return esta;
    }
}
