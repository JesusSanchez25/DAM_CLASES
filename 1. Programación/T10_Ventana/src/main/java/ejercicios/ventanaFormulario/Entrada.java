package ejercicios.ventanaFormulario;

import ejercicios.ventanaFormulario.controller.GestorUsuarios;
import ejercicios.ventanaFormulario.model.Usuario;
//import ejercicios.ventanaFormulario.ui.VentanaGeneral;

import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestorUsuarios gestorUsuarios = new GestorUsuarios();
                //VentanaGeneral ventanaGeneral = new VentanaGeneral(gestorUsuarios, new Usuario("Borja", "Martin", "borja@correo.com", "123"));

                /*VentanaFormulario ejercicios.ventanaFormulario = new VentanaFormulario(gestorUsuarios);
                VentanaLogin ventanaLogin = new VentanaLogin(gestorUsuarios);*/
            }
        });
    }
}
