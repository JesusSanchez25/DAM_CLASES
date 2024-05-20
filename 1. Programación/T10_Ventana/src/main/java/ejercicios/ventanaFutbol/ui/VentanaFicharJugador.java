package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFicharJugador extends JFrame implements ActionListener {
    private JLabel lblTitulo;
    private JList listJugadoresFichar;
    private JButton bttnFichar;
    private JButton bttnVolver;
    private JPanel panelCentral;
    private int idEquipo;
    private DBControler dbControler;

    public VentanaFicharJugador(int idEquipo) throws HeadlessException {
        this.idEquipo = idEquipo;
        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);

        dbControler = new DBControler();
    }

    public void acciones(){};

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
