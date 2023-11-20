package ProbandoMain.OperacionesBase;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class OperacionesBase {
        //lo asignamos como variable de clase para que pueda ser accesible por todos los métodos
        ArrayList<String> lista;



    Scanner scanner = new Scanner(in);


     public void crearListaPlabaras(){
         System.out.println("Procedemos a crear una lista de palabras");
         lista = new ArrayList<>();

     }

    public void agregarElemento (String palabra){

         //NO LA PIDO EN EL MÉTODO
        System.out.println("Procedemos a agregar elemento a la lista de palbras");

        //Se añada una palabra a la lista, proporcionada por el main
        lista.add(palabra);
        System.out.println("La palabra introducida es "+ lista.get((lista.size()-1)));

    }

    public void obtenerElemento (){
       if (!lista.isEmpty()){
           System.out.println("Procedemos a obtener un elemento de la lista de palabras");
           for (int i = 0; i < lista.size(); i++) {
               System.out.printf("El elemento de la posción %d es "+lista.get(i)+"\n ",i+1);
           }
       } else {
           System.out.println("La lista está vacía bro");
       }

    }

    public void buscarPalabra (String palabra){

        if(lista.contains(palabra)){System.out.println("La palabra está en la posición: "+(((int)(lista.indexOf(palabra)))+1));
        }else {
            System.out.println("La palabra no está en la lista");
        };


    }
}
