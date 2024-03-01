package genericos.EjercicioGenericos;

import java.util.ArrayList;
import java.util.List;

public class MiLista<T> {

    private List<T> lista;
    public MiLista() {
        this.lista = new ArrayList<>();
    }


    public void aniadirElemento(T elemento){
        lista.add(elemento);
        System.out.println("Añadido correctamente");
    }

    public void imprimirElemetno(){

        for (T element: lista ) {
            // si t es un String quiero que además indicar la cantidad de letras que tiene
            // si T es un integer quiero que además indicar si es positivo o negatyivo
            // siempre quiero sacar el elemento por consola

            if (element instanceof String){
                System.out.println("El número de letras es: "+((String) element).length());
            } else if (element instanceof Integer){
                if ((Integer) element>0){
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
            }

        }

    }

    public T buscar(T objeto){
        for (T item : lista) {
            if (objeto.equals(item)){
                System.out.println("objeto encontrado");
                return item;
            }
        }
        return null;
    }

    public void almacenar(T elemento){
        if (elemento instanceof Integer){
            System.out.println("Esto es un int");
        }

    }

}


