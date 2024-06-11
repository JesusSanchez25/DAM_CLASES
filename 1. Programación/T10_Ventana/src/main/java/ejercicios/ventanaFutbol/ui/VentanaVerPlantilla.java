package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaVerPlantilla extends  JFrame implements ActionListener {
    private JPanel panelCentral;
    private JButton bttnVolver;
    private JLabel lblEquipo;
    private JScrollPane scrollPanel;
    private JList listJugadoresEquipo;
    private JButton bttnVerAlineacion;
    private int idUsuario;
    private int idEquipo;
    private Equipo equipo;
    private DBControler dbControler;
    private ArrayList<Jugador> jugadoresEquipo;
    private ArrayList<String> jugadoresEquipoExtendido;
    private ArrayList<Jugador> jugadoresAlineacion;
    private DefaultListModel modelo;

    public VentanaVerPlantilla(int idUsuario) throws HeadlessException {
        this.dbControler = new DBControler();
        this.idUsuario = idUsuario;
        this.idEquipo = dbControler.sacarIdEquipo(idUsuario);
        this.equipo = dbControler.sacarEquipo(idEquipo);
        this.jugadoresEquipo = equipo.getPlantilla();
        this.jugadoresAlineacion = equipo.getAlineacion();
        this.jugadoresEquipoExtendido = new ArrayList<>();
        jugadoresEquipo.forEach(jugador -> jugadoresEquipoExtendido.add(jugador.toStringAmpliado()));

        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        modelo = new DefaultListModel();
        modelo.addAll(jugadoresEquipoExtendido);
        listJugadoresEquipo.setModel(modelo);

        lblEquipo.setText(equipo.getNombre());
        acciones();
        setVisible(true);

    }

    public void acciones(){
        bttnVolver.addActionListener(this);
        bttnVerAlineacion.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bttnVolver){
            dispose();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
        } else if (e.getSource() == bttnVerAlineacion) {
            modelo.clear();
            modelo.addAll(jugadoresAlineacion);
            listJugadoresEquipo.setModel(modelo);
        }
    }
}
