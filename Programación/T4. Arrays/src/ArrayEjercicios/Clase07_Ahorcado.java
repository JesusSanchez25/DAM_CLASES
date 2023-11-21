package ArrayEjercicios;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Clase07_Ahorcado {
    public static void main(String[] args) {
        //1. (AhorcadoArray) Crear un array de String donde se guarden 20 palabras.
        // El sistema deberá de seleccionar una de las palabras pertenecientes al array.
        // Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada.
        // Para ello las normas son las siguientes:
        //    - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
        //    - Se pedirá por pantalla la letra con la que se quiere probar
        //    - En el caso de acertar se mostrará la letra en la posición correspondiente
        //    - En el caso de falla se restará una vida
        //    - El programa continuará hasta que:
        //    - Acierte la palabra
        //    - Me quede sin vidas

        Scanner scanner = new Scanner(in);
        // Todas las palabras posibles
        String[] palabras = new String[]{"mariposa","esternocleidomastoideo","ramadán","estegosaurio","triceratops",
                "camioneta","apisonadora","petróleo","pornhub","pavimento","pirineos","cerrajero","contractura",
                "fisioculturista","renacuajo","holocausto","internado","federico","piedra","electrodinamica","wolframio",
                "herrete","zapatilla","supercalifragilisticoespialidoso","eucaristia","andorrano","cocaina","sarcófago",
                "pirámide","orificio","placton"};


        String palSecreta = palabras[(int)(Math.random()* palabras  .length)];
        ArrayList letrasUsadas = new ArrayList<>();
        char[] palabraSecreta = palSecreta.toCharArray();
        Character letraElegida;
        int vidas = 5;
        int letrasDescubiertas = 0;



        // Asignar a la palabra oculta '_' en todos sus valores
        for (int i = 0; i < palSecreta.length(); i++) {
            palabraSecreta[i] = '_';
        }
        System.out.println("");

        //Ejecuta el juego hasta que las vidas sean 0 o la palabra esté completa
        do{
            //Te permite elegir una letra para adivinar en el ahorcado
            //Si pones la misma letra 2 veces te lo recuerda
            do {
                System.out.print("Elige una letra: \t\t");
                ImprimirPalabraOculta(palabraSecreta);
                System.out.println("\n\n\n");

                letraElegida = scanner.next().charAt(0);

                //No deja que repitas letra
                if (letrasUsadas.contains(letraElegida)){
                    LimpiarPantalla();
                    System.out.println("Esa letra ya la has introducido, elige una diferente");
                }
            }while (letrasUsadas.contains(letraElegida));
                letrasUsadas.add(letraElegida);


            LimpiarPantalla();
            //Si aciertas una letra te felicita y se actualiza la palabra oculta
            if (palSecreta.contains(letraElegida.toString())){
                System.out.println("\nHas acertado");

                for (int i = 0; i < palSecreta.length(); i++) {
                    if(palSecreta.charAt(i)==letraElegida){
                        palabraSecreta[i]=palSecreta.charAt(i);
                        letrasDescubiertas++;
                    }

                }


                //Si fallas pierdes una vida y te avisa de cuantas vidas te quedan
            } else {
                if (vidas!=0){
                    System.out.println("\nInténtalo de nuevo, has perdido una vida campeón");
                    vidas--;
                    System.out.println("te quedan "+vidas+" vidas");
                }
            }
        } while (vidas!=0 && letrasDescubiertas<palSecreta.length());

            //Cuando pierdes todas tus vidas se para el juego y te dice la palabra que era
        if (vidas==0){System.out.println("Has perdido bro");
            System.out.println("\nLa palabra era  " + palSecreta);}
        else {
            System.out.println("Has ganado bro");
        }

    }

    public static void LimpiarPantalla(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
    }
}

    public static void ImprimirPalabraOculta(char[] PalSecreta){

        for (int i = 0; i < PalSecreta.length; i++) {
            System.out.print(PalSecreta[i]);
        }
        System.out.println("");
    }
}




