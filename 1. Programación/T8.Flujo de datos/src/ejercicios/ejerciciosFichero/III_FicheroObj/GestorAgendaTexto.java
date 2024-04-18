package ejercicios.ejerciciosFichero.III_FicheroObj;

import ejercicios.ejerciciosFichero.III_FicheroObj.model.Usuario;
import ejercicios.ejerciciosFichero.III_FicheroObj.model.UsuarioTexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorAgendaTexto {
    public void escribirUsuarios(){
        // File -> FileWriter -> PrintWriter (Para escribir con salto de línea)
        // también podría formatear el toString con salto de línea y usar FileWriter

        File file = new File("src/ejercicios/ejerciciosFichero/III_FicheroObj/recursos/agendatexto.txt");

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            printWriter = new PrintWriter(fileWriter);

            UsuarioTexto u = new UsuarioTexto("Borja","Martin","correo",1,2,3,18);
            //Hay que poner el ln para el salto de línea
            printWriter.println(u);
        } catch (IOException e) {
            System.out.println("IO");
        } finally {
            if (printWriter != null){
                printWriter.close();
            }
        }


    }
}
