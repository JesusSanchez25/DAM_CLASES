package ArrayMultidimensionalEjericios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Prueba {
    public static void main(String[] args) {
        ArrayList carton = new ArrayList<>(0);
        carton=GenerarCarton(carton);
        MostrarCarton(carton);


    }
    public static ArrayList GenerarCarton (ArrayList carton){
        //Genera 3 números en cada decena
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {

                //Rellena el ArrayList de números aleatorios ordenados en pares de 3
                int numero;
                do {
                    numero =(int)(((Math.random()*10)+10*i));
                }while (carton.contains(numero));
                carton.add(numero);

                //Pone en orden de menor a mayor los números
                //Coge el valor genenrado y lo compara con el valor anterior, si es menor que este
                //se cambia y vuelve a ejecutarse hasta que sea el menor de estos
                while ((carton.indexOf(numero)>0) && (numero < (int)(carton.get(carton.indexOf(numero)-1)))){
                    carton.add(carton.indexOf(numero)-1,numero);
                    carton.remove(carton.lastIndexOf(numero));
                }
            }
        }

        //Sustituye un número aleatorio en cada fila y lo reemplaza por un espacio
        for (int k = 0; k < 9; k++) {
            carton.set((int)((Math.random()*3)+3*k), "  ");
        }

        // Después, elige 3 filas aleatorias para hacer lo mismo, dejando un total
        //de 15 números en el cartón y 15 espacios
        for (int i = 0; i < 3; i++) {
            int aleatorio= (int)(Math.random()*27);
            do {
                carton.set(aleatorio, "  ");
            }while (((Object)(carton.indexOf(aleatorio))).equals("  "));
        }






        return carton;}
    public static void MostrarCarton (ArrayList carton){
        Object[][] cartonArray = new Object[3][9];
        Collections.replaceAll(carton, -1, "  ");
        //Da valor a un nuevo array multidimensional basado en el cartón
        //Ordena los números por columnas
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                String numeroBingo = carton.get(j+(3*i)).toString();
                cartonArray[j][i] = (numeroBingo);
            }
        }

        System.out.println("  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ");
        for (Object[] fila : cartonArray) {
            for (Object numero : fila) {
                System.out.print("\t" + numero);
            }
            System.out.println("");
        }

        System.out.println("  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ");
    }}
