package ventanaFormulario;

import ventanaFormulario.controller.GestorUsuarios;
import ventanaFormulario.model.Usuario;
import ventanaFormulario.ui.VentanaFormulario;
import ventanaFormulario.ui.VentanaGeneral;
import ventanaFormulario.ui.VentanaLogin;

import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestorUsuarios gestorUsuarios = new GestorUsuarios();
                VentanaGeneral ventanaGeneral = new VentanaGeneral(gestorUsuarios, new Usuario("Borja", "Martin", "borja@correo.com", "123"));

                /*VentanaFormulario ventanaFormulario = new VentanaFormulario(gestorUsuarios);
                VentanaLogin ventanaLogin = new VentanaLogin(gestorUsuarios);*/
            }
        });
    }
}
