package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearEquipo extends JFrame implements ActionListener {
    private JPanel panelCentral;
    private JButton bttnCrearEquipo;
    private JLabel lblTitulo;
    private JTextArea textInsrtEquipo;
    private JTextArea textEquipo;
    private JLabel lblConsola;
    private DBControler dbControler;
    private int idUsuario;

    public VentanaCrearEquipo(int idUsuario) throws HeadlessException {
        this.idUsuario = idUsuario;
        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);

        dbControler = new DBControler();
    }

    public void limpiarTexto(){
        textEquipo.setText("");

    }

    public void acciones(){
        bttnCrearEquipo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bttnCrearEquipo){
            if (!textEquipo.getText().isEmpty()){
                dbControler.crearEquipo(textEquipo.getText());

                int idEquipo = dbControler.sacarIdEquipo(textEquipo.getText());
                dbControler.asignarEquipoUsuario(idUsuario, idEquipo);
                limpiarTexto();
                dispose();

                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
            } else {
                System.out.println("inserte el nombre de equipo");
                lblConsola.setText("inserte el nombre de equipo");
                limpiarTexto();

            }
        }
    }
}
