package clasesAnidadas.explicacion;

public class Entrada {
    public static void main(String[] args) {

        ClaseExterna claseExterna = new ClaseExterna("Dato Externo", 10);
        ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna("Dato interno",122, claseExterna);
        ClaseExterna.ClaseInterna claseInterna2 = claseExterna.new ClaseInterna("Dato interno",122, claseExterna);

        claseExterna.getClaseInterna().mostrarPadre();

        claseInterna2.mostrarPadre();



    }


}
