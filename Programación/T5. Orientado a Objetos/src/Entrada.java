import modelo.Persona;

public class Entrada {


    public static void main(String[] args) {

        Persona persona1 = new Persona("Borja", "Martín", 123);
        Persona persona2 = new Persona("Mek", "Martinez", 445, "javiermartinezherrera@gmail.char");
        Persona persona3 = new Persona(); // usa el tercer constructor que no hace nada



        // imprimir el nombre de la persona
        System.out.println(persona1.getNombre());

        //imprimir todos los datos de la persona
        persona1.mostrarDatos();
    }
}