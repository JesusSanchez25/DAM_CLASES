package ventanaFormulario;

import ventanaFormulario.ui.VentanaFormulario;

import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaFormulario ventanaFormulario = new VentanaFormulario();
            }
        });
    }
}
