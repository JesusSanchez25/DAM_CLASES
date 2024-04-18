package ejercicio3;

import ejercicio3.model.Alumno;

import java.io.*;
import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        //Coge el fichero llamado ejercicio3.txt. En dicho fichero se guarda la información
        //de una serie de alumnos, donde tenemos el nombre, apellido, correo y media
        //obtenida.
        //Para la resolución del ejercicio tendrás que leerle desde java y guardar en un
        //fichero llamado premio.obj el objeto de tipo Alumno que tenga una media más
        //alta.
        //Ten en cuenta que si en el fichero se añade cualquier fila debería seguir
        //funcionando y devolviendo el alumno con una media más alta

        File file = new File("src/main/java/ejercicio3/resources/ejercicio3.txt");
        File filePremio = new File("src/main/java/ejercicio3/resources/premio.obj");
        BufferedReader bufferedReader = null;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String alumno;
            while ((alumno = bufferedReader.readLine()) != null){
                String[] datos = alumno.split(", ");
                Alumno alumno1 = new Alumno(datos[0], datos[1],datos[2],Integer.parseInt(datos[3]));
                alumnos.add(alumno1);
            }

        } catch (IOException e) {
            System.out.println("IO");
        }

        int notaMaxima = 0;
        int posicion = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNota() > notaMaxima){
                notaMaxima = alumnos.get(i).getNota();
                posicion = i;
            }
        }

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePremio));
            oos.writeObject(alumnos.get(posicion));
        } catch (IOException e) {
            System.out.println("IO error");
        } finally {
            try {
                if (oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrado");
            }

        }

        System.out.println("El alumno con más nota es: " + alumnos.get(posicion).getNombre());



    }
}
