package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.excepciones.DatosIncorrectosException;
import ejercicios.ventanaFutbol.excepciones.UsuarioNoEncontradoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame implements ActionListener {
    private JTextArea textInsrtNombre;
    private JTextArea textInsrtContrasenia;
    private JTextArea textUsuario;
    private JTextArea textContrasenia;
    private JPanel panelCentral;
    private JTextArea textInsrtUsuario;
    private JLabel lblTitulo;
    private JButton bttnRegistro;
    private JLabel lblConsola;
    private JTextArea textInsrtCorreo;
    private JTextArea textCorreo;
    private JButton bttnVolver;
    private  DBControler dbControler;

    public VentanaRegistro() throws HeadlessException {
        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);

        dbControler = new DBControler();
    }

    public void limpiarTexto(){
        textUsuario.setText("");
        textCorreo.setText("");
        textContrasenia.setText("");

    }

    public void acciones(){
        bttnVolver.addActionListener(this);
        bttnRegistro.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bttnRegistro){
            int idUsuario = 0;
            try {
                idUsuario = dbControler.comprobarUsuario(textUsuario.getText(), textCorreo.getText(), textContrasenia.getText());

                // Intenta encontrar la cuenta y si la encuentra hace login directamente
                System.out.println("Entrando en la cuenta");
                lblConsola.setText("Usuario encontrado, entrando en la cuenta");

                dispose();
                if (dbControler.sacarIdEquipo(idUsuario) != 0){
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
                } else{
                    VentanaCrearEquipo ventanaCrearEquipo = new VentanaCrearEquipo(idUsuario);
                }
                dispose();

            } catch (UsuarioNoEncontradoException ex) {
                dbControler.aniadirUsuario(textUsuario.getText(), textCorreo.getText(), textContrasenia.getText());

                // Saca el id del usuario recién creado (campo auto incremental)
                idUsuario = dbControler.sacarIdUsuario(textUsuario.getText());
                lblConsola.setText("Registrando usuario");
                System.out.println("Registrando usuario");

                if (dbControler.sacarIdEquipo(idUsuario) != 0){
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
                } else{
                    VentanaCrearEquipo ventanaCrearEquipo = new VentanaCrearEquipo(idUsuario);
                }

                    limpiarTexto();
                    dispose();

            } catch (DatosIncorrectosException ei){
                System.out.println("Nombre no disponible");
                lblConsola.setText("Nombre no disponible");
            }


        } else if (e.getSource() == bttnVolver) {
            dispose();
            VentanaLogin ventanaLogin = new VentanaLogin();
        }


    }

}


