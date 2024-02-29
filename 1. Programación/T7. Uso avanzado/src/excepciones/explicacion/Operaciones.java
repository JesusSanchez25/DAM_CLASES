package excepciones.explicacion;

import excepciones.explicacion.utils.MyException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Operaciones {

    private ArrayList<Double> listaResultados;
    private String[] operaciones = {"suma", "resta", "multiplicacion", "division"};
    //CADA MÉTODO ES UNA FORMA DE USAR EL TRY Y EL CATCH

    public void sumar(int operando1, int operando2){
        double resultado = operando1 + operando2;
        try {
            listaResultados.add(resultado);
        } catch (NullPointerException e){
            System.out.println("Fallo detectado, list ano inicializada");
        }


    }

    public void dividir(int operando1, int operando2){

        double resultado = (double) operando1/(double) operando2;

        try{
            System.out.println("Estas realizando la operación de " + operaciones[4]);
            listaResultados.add(resultado);
        } catch (NullPointerException e){
            System.out.println("Fallo detectado, list ano inicializada");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El array está accedido de forma incorrecta");
        } finally {
            System.out.println("Terminando de operar");
        }
    }

    public void multiplicar (int operando1, int operando2) throws NullPointerException{

        double resultado = (double) operando1 * (double) operando2;
        listaResultados.add(resultado);
    }

    public void lecturaFichero(){

        File file = new File("");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("asdfads");
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void lanzarPropia(int numero){

        if (numero<0){
            try {
              throw new MyException("Este es el mensaje de error");
            } catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
    }


}
