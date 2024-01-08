package _1bloqueif;

public class EstructuraifElseif {
    public static void main(String[] args) {
        int nota = 8;
        // suspenso : 0-4.99
        // aprobado : 5-6.99
        // notable  : 7-8.99
        //sobresaliente: 9-9.99
        //matricula: 10
        // Sino un aviso "Esta nota no es válida"
        if (nota <0 || nota >10){
            System.out.println("has puesto mal la nota");
        }

        if (nota >= 0 && nota <= 10) {
            System.out.println("la nota es válida");
            if (nota >= 0 && nota < 5) {
                System.out.println("El examen está suspenso");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("El exámen está aprobado");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("El exámen está de notable");
            } else if (nota >= 9 && nota < 9.99) {
                System.out.println("El exámen está de sobresaliente");
            } else {
                System.out.println("El exámen está de matrícula");
            }
        }
    }
}


