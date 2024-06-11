package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.excepciones.DatosIncorrectosException;
import ejercicios.ventanaFutbol.excepciones.UsuarioNoEncontradoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame implements ActionListener {
    private JTextArea textInsrtNombre;
    private JTextArea textInsrtContrasenia;
    private JTextArea textUsuario;
    private JTextArea textContrasenia;
    private JPanel panelCentral;
    private JLabel lblTitulo;
    private JButton bttnLogin;
    private JButton bttnRegistro;
    private JLabel lblConsola;
    private  DBControler dbControler;

    public VentanaLogin() throws HeadlessException {
        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);

        dbControler = new DBControler();
    }

    public void limpiarTexto(){
        textUsuario.setText("");
        textContrasenia.setText("");

    }

    public void acciones(){
        bttnLogin.addActionListener(this);
        bttnRegistro.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bttnLogin){
            int idUsuario = 0;
            try {
                idUsuario = dbControler.comprobarUsuario(textUsuario.getText().trim(), textContrasenia.getText().trim());

                System.out.println("Entrando en la cuenta");
                lblConsola.setText("Entrando en la cuenta");
                limpiarTexto();
                if (dbControler.sacarIdEquipo(idUsuario) != 0){
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
                } else{
                    VentanaCrearEquipo ventanaCrearEquipo = new VentanaCrearEquipo(idUsuario);
                }
                dispose();

            } catch (DatosIncorrectosException | UsuarioNoEncontradoException ex) {
                System.out.println(ex.getMessage());
                lblConsola.setText(ex.getMessage());
            }


        } else if (e.getSource() == bttnRegistro) {
            dispose();
            VentanaRegistro ventanaRegistro = new VentanaRegistro();
        }
    }
}


