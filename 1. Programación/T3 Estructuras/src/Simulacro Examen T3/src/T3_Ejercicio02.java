import javax.swing.event.DocumentEvent;
import java.util.Scanner;

public class T3_Ejercicio02 {
    public static void main(String[] args) {
        //Realizar un programa que pida las 20 notas de todos los alumnos de una clase. Al finalizar,
        //imprimir por pantalla si hay algún suspenso y la nota media de todos los alumnos.

        Scanner scanner = new Scanner(System.in);
        double sumatotal =0.0;
        double contadortotal=0.0;
        int suspenso = 0;
        for (int i = 0; i < 20 ; i++) {
            System.out.println("Di nota");
            int nota = scanner.nextInt();
            sumatotal+=nota;
            contadortotal++;
            if (nota<5){
                suspenso++;
            }


        }
        if (suspenso>0){
            System.out.println("Hay algún suspenso sí definitivametne");
        }
        Double media = sumatotal/contadortotal;

        System.out.println(media);
    }
}
