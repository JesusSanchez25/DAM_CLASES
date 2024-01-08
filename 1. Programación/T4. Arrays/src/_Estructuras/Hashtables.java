package _Estructuras;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtables {
    public static void main(String[] args) {
        Hashtable<String, Object[]> listaCochesHash = new Hashtable<>();
        Object[] coche1 = new Object[]{"Ford", "Focus", 1000, "1234A"};
        Object[] coche2 = new Object[]{"Seat", "Ibbiza", 1000, "4321A"};
        Object[] coche3 = new Object[]{"Jamón", "Ibbiza", 1000, "4334A"};

        listaCochesHash.put(coche1[3].toString(), coche1);
        listaCochesHash.put(coche2[3].toString(), coche2);
        listaCochesHash.put(coche3[3].toString(), coche3);

        System.out.println("El tamaño de la tabla es "+listaCochesHash.size());
        listaCochesHash.get("1234A");

        //RECORRIDO POR CLAVES
        //Saca una Enumeración con todas las claves (un array incambiable)
        Enumeration<String> claves = listaCochesHash.keys();

        //Saca 1 clave de la enumeración de claves (claves.nextElement)
        String claveobtenida = claves.nextElement();
        System.out.println(claveobtenida);

        // *SACA TODOS LOS COCHES*
        while (claves.hasMoreElements()){
            //Saca la clave de cada coche, sacado de la ENUMERACIÓN de claves creada antes
            String clave = claves.nextElement();

            //Solo imprimir el coche si su clave contiene una "A"
            if (clave.contains("A")){
                Object[] coche = listaCochesHash.get(clave);
                for (Object item : coche) {
                    System.out.println(item+", ");
                }
            }

        }

        Enumeration<Object[]> elementos = listaCochesHash.elements();
        while (elementos.hasMoreElements()){
            Object[] element = elementos.nextElement();
            for (Object item: element){
                System.out.println(item+", ");
            }
        }





    }
}
