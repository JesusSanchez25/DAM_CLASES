package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Usuario;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JPanel panelCentral;
    private JButton bttnFicharJugador;
    private JButton bttnCrearAlineacion;
    private JButton bttnVerJugadores;
    private JButton bttnRetarUsuario;
    private JLabel lblTituloUsuario;
    private JLabel lblConsola;
    private JLabel lblTituloEquipo;
    private int idUsuario;
    private int idEquipo;
    private Equipo equipo;
    private Usuario usuario;
    private DBControler dbControler;


    public VentanaPrincipal(int idUsuario) throws HeadlessException {

        this.dbControler = new DBControler();



        this.idUsuario = idUsuario;
        this.idEquipo = dbControler.sacarIdEquipo(idUsuario);
        this.usuario = dbControler.sacarUsuario(idUsuario);
        this.equipo = dbControler.sacarEquipo(idEquipo);

        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);

        dbControler = new DBControler();
        lblTituloUsuario.setText(usuario.getNombre());
        lblTituloEquipo.setText(equipo.getNombre());
    }


    public void acciones(){};

}