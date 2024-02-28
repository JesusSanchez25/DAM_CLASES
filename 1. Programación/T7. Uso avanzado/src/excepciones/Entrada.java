package excepciones;

public class Entrada {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        //operaciones.sumar(4,6);
        //opreaciones.multiplicar(0,70)

        try {
            operaciones.dividir(4,9);
        } catch (Exception e){
            System.out.println("Fallo en la ejecución del método");
        }

        //operaciones.lecturaFichero();
        operaciones.lanzarPropia(2);
    }
}
