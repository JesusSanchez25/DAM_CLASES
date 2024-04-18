package ejercicios.ejerciciosFichero.III_FicheroObj;

import ejercicios.ejerciciosFichero.III_FicheroObj.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class GestorAgenda {


    public void guardarUsuario(){
        // FILE -> OBJECTOUTPUTSTREAM -> FILEOUTPUTSTREAM -> FILE

        File file = new File("src/ejercicios/ejerciciosFichero/III_FicheroObj/recursos/agenda.obj");

        ObjectOutputStream oos = null;


        try {
            oos = new ObjectOutputStream(new FileOutputStream(file,true));

            //Realiza acciones
            oos.writeObject(new Usuario("Borja", "Martín", "correo@gmail.com",69412983));
        } catch (IOException e) {
            System.out.println("Error en la IO");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void leerUsuarios(){
        // OBJECTINPUTSTREAM -> FILEINPUTSTREAM -> FILE
        File file = new File("src/ejercicios/ejerciciosFichero/III_FicheroObj/recursos/agenda.obj");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));

            // ESTO SOLO LEE UNA PERSONA
            Usuario usuario = (Usuario)ois.readObject();
            System.out.println(usuario.toString());

        } catch (IOException e) {
            System.out.println("Error IO");
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase");
        } finally {

            try {
                if (ois != null){
                ois.close();


                }
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }
    }

    public void guardarUsuarioArray(){
        // FILE -> OBJECTOUTPUTSTREAM -> FILEOUTPUTSTREAM -> FILE

        File file = new File("src/ejercicios/ejerciciosFichero/III_FicheroObj/recursos/agenda.obj");

        ObjectOutputStream oos = null;


        try {
            oos = new ObjectOutputStream(new FileOutputStream(file,true));
            ArrayList<Usuario> listado = null;

            // Si no recibe ningún Arraylist de la lectura, lo crea
            if ((listado = getUsuariosArraylist()) == null){
                listado = new ArrayList<>();
            }
            listado.add(new Usuario("Borja", "Martín", "correo@gmail.com",69412983));
            oos.writeObject(listado);
        } catch (IOException e) {
            System.out.println("Error en la IO");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void leerUsuariosArraylist(){
        // OBJECTINPUTSTREAM -> FILEINPUTSTREAM -> FILE
        File file = new File("src/ejercicios/ejerciciosFichero/III_FicheroObj/recursos/agenda.obj");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>)ois.readObject();
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario.toString()); //no haría falta en este caso el toString, ya que es un sout
            }

        } catch (IOException e) {
            System.out.println("Error IO");
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase");
        } finally {

            try {
                if (ois != null){
                    ois.close();


                }
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }
    }

    public ArrayList<Usuario> getUsuariosArraylist(){
        // OBJECTINPUTSTREAM -> FILEINPUTSTREAM -> FILE
        File file = new File("src/ejercicios/ejerciciosFichero/III_FicheroObj/recursos/agenda.obj");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) ois.readObject();
            return listaUsuarios;

        } catch (IOException e) {
            System.out.println("Error IO");
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase");
        } finally {

            try {
                if (ois != null){
                    ois.close();


                }
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            }
        }
        return null;
    }
}
