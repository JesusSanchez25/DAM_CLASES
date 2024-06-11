package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Jugador;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCrearAlineacion extends JFrame implements ActionListener, ListSelectionListener {
    private JPanel panelCentral;
    private JList listJugadoresEquipo;
    private JButton aniadirALaPlantillaButton;
    private JLabel lblConsola;
    private JLabel lblContadorJugadores;
    private JLabel lblTitulo;
    private JButton bttnCancelar;
    private JButton bttnDeshacer;
    private JButton bttnSubmit;
    private JScrollPane scroll;
    private int idUsuario;
    private int idEquipo;
    private Equipo equipo;
    private DBControler dbControler;
    private ArrayList<Jugador> jugadoresEquipo;
    private ArrayList<String> jugadoresEquipoExtendido;
    private ArrayList<Jugador> jugadoresAlineacion;

    private DefaultListModel modelo;


    public VentanaCrearAlineacion(int idUsuario) throws HeadlessException{
        this.dbControler = new DBControler();
        this.idUsuario = idUsuario;
        this.idEquipo = dbControler.sacarIdEquipo(idUsuario);
        this.equipo = dbControler.sacarEquipo(idEquipo);
        this.jugadoresEquipo = dbControler.sacarJugadoresEquipo(idEquipo);
        this.jugadoresAlineacion = equipo.getAlineacion();
        //this.jugadoresEquipoExtendido = new ArrayList<>();
        //jugadoresEquipo.forEach(jugador -> jugadoresEquipoExtendido.add(jugador.toStringAmpliado()));

        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        modelo = new DefaultListModel();
        modelo.addAll(jugadoresEquipo);
        listJugadoresEquipo.setModel(modelo);

        lblTitulo.setText(equipo.getNombre());
        lblContadorJugadores.setText(""+equipo.getAlineacion().size() + "/7");
        acciones();
        setVisible(true);


    }

    public void acciones(){

        aniadirALaPlantillaButton.addActionListener(this);
        bttnDeshacer.addActionListener(this);
        bttnSubmit.addActionListener(this);
        bttnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == aniadirALaPlantillaButton) {
            Jugador jugador = (Jugador) listJugadoresEquipo.getSelectedValue();

            if (jugador != null
                    && jugadoresAlineacion.size() <7
                    && !jugadoresAlineacion.contains(jugador)){

                jugadoresAlineacion.add(jugador);
                jugador.setEstitutlar(true);
                lblContadorJugadores.setText("" + jugadoresAlineacion.size());

                System.out.println(jugador.getName() + " agregado a la alineación");
                lblConsola.setText(jugador.getName() + " agregado a la alineación");

                System.out.println(jugadoresAlineacion.size() + "/7 jugadores");
                lblContadorJugadores.setText(jugadoresAlineacion.size() + "/7 jugadores");
            } else {

                // Mensajes de fallos
                if (jugador == null) {
                    System.out.println("Debes seleccionar un jugador para agregar");
                    lblConsola.setText("Debes seleccionar un jugador para agregar");
                } else if (jugadoresAlineacion.size() >=7){
                    System.out.println("Has llegado al máximo de jugadores");
                    lblConsola.setText("Has llegado al máximo de jugadores");
                } else if (jugadoresAlineacion.contains(jugador)){
                    System.out.println("Ya has seleccionado a ese jugador para la alineación");
                    lblConsola.setText("Ya has seleccionado a ese jugador para la alineación");
                }
            }

        } else if (e.getSource() == bttnDeshacer){
            Jugador jugador = jugadoresAlineacion.get(jugadoresAlineacion.size()-1);
            System.out.println(jugador.getName() + " echado de la alineación");
            lblConsola.setText(jugador.getName() + " echado de la alineación");
            jugador.setEstitutlar(false);
            jugadoresAlineacion.remove(jugador);



            System.out.println(jugadoresAlineacion.size() + "/7 jugadores");
            lblContadorJugadores.setText(jugadoresAlineacion.size() + "/7 jugadores");

        }  else if (e.getSource() == bttnSubmit){
            if (jugadoresAlineacion.size() == 7){
                for (Jugador item : jugadoresAlineacion) {
                    dbControler.agregarJugadorAlineacion(item.get_id());
                }

                equipo.setAlineacion(jugadoresAlineacion);
                equipo.calcularValoracion();
                System.out.println("Jugadores agregados con éxito");
                lblConsola.setText("Jugadores agregados con éxito");


                dispose();
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
            } else {
                System.out.println("Debes tener 7 jugadores agregados");
                lblConsola.setText("Debes tener 7 jugadores agregados");
            }

        } else if (e.getSource() == bttnCancelar){
            for (Jugador item : jugadoresAlineacion) {
            item.setEstitutlar(false);
            }
            jugadoresAlineacion.clear();

            dispose();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
        }
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
