package trabajoObjetos.controler;


import trabajoObjetos.model.Tarea;

import java.io.*;

public class OperacionesFicheros {
    public void escribirObjeto(){
        File file = new File("src/trabajoObjetos/resources/tareas.obj");

        ObjectOutputStream objectOutputStream = null;
        //FileOutputStream fileOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(new Tarea("Tarea 1", "Descripcion de la tarea1", false));
            objectOutputStream.writeObject(new Tarea("Tarea 2", "Descripcion de la tarea2", true));
        } catch (IOException e) {
            System.out.println("Error en el acceso");
        } finally {
            try {
                if (objectOutputStream != null){
                objectOutputStream.close();}
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void lecturaObjetos(){
        File file = new File("srctrabajoObjetos/resources/tareas.obj");

        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            /*Tarea tarea = (Tarea) objectInputStream.readObject();
            System.out.println(tarea.toString());
            tarea = (Tarea) objectInputStream.readObject();
            System.out.println(tarea.toString());*/

            Tarea tarea = null;
            // Para leer todos los objetos lee hasta que el objeto sea null (no hay más objetos)
            while ((tarea = (Tarea) objectInputStream.readObject()) != null){
                System.out.println(tarea);
            }

        } catch (IOException e) {
            System.out.println("Error de operación");
        } catch (ClassNotFoundException e) {
            System.out.println("Eror en la lectura");
        } catch(ClassCastException e){
            System.out.println("Tipos incompatibles");
        } finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Error de cerrado");
            }
        }

    }
}
