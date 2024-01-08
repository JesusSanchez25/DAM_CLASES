package Jesus_Sanchez_DAM1_24_11.Ejercicio3;

import java.util.ArrayList;

public class Metodos {

    ArrayList<Object[]> personas = new ArrayList<>();

    public void agregarPersona(Object[] persona){
        personas.add(persona);

    }
    public void buscarPersona(String DNI){
        System.out.println("");
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i)[3].equals(DNI) ){
                System.out.println("La persona ha sido encontrada con éxito");
                System.out.println("Nombre: "+ personas.get(i)[0] + ", Apellidos: " + personas.get(i)[1]
                        + ", Teléfono: " + personas.get(i)[2]);
                break;
            }
            if (i==personas.size()-1){
                System.out.println("La persona no ha sido encontrada");
            }
        }


    }
    public int borrarPersona(String DNI){
        System.out.println("");
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i)[3].equals(DNI) ){
                System.out.println("La persona ha sido borrada con éxito");
                System.out.println("Nombre: "+ personas.get(i)[0] + ", Apellidos: " + personas.get(i)[1]
                        + ", Teléfono: " + personas.get(i)[2]);
                System.out.println("");
                personas.remove(i);

                return i;
            }
        }
        System.out.println("No se ha encontrado a la persona a borrar");
        return -1;



    }
    public void listarPersonas(){
        System.out.println("");
        System.out.println("Se han encontrado estas personas en la base de datos: ");
        for (int i = 0; i < personas.size(); i++) {

            System.out.println("Nombre: "+ personas.get(i)[0] + ", Apellidos: " + personas.get(i)[1]
                    + ", Teléfono: " + personas.get(i)[2]);

        }
        if (personas.size()==0){
            System.out.println("No hay ninguna persona en la base de datos");
        }

    }
}
