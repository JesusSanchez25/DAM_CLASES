package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Jugador;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class VentanaFicharJugador extends JFrame implements ActionListener, ListSelectionListener {
    private JLabel lblTitulo;
    private JList listJugadoresFichar;
    private JList listPrecioFichar;
    private JScrollBar scrollBar;
    private JButton bttnFichar;
    private JButton bttnVolver;
    private JPanel panelCentral;
    private JPanel panelSecundario;
    private JList listaPreciosFichar;
    private JLabel lblConsola;
    private JLabel lblPresupuesto;
    private int idUsuario;
    private int idEquipo;
    private Equipo equipo;
    private DBControler dbControler;
    private ArrayList<Jugador> jugadoresDisponibles;
    private ArrayList<String> jugadoresDisponiblesPrecio;
    private DefaultListModel modelo;
    private DefaultListModel modeloPrecio;

    public VentanaFicharJugador(int idUsuario) throws HeadlessException {
        this.dbControler = new DBControler();
        this.idUsuario = idUsuario;
        this.idEquipo = dbControler.sacarIdEquipo(idUsuario);
        this.equipo = dbControler.sacarEquipo(idEquipo);
        this.jugadoresDisponibles = dbControler.sacarJugadoresFichar();
        this.jugadoresDisponiblesPrecio = new ArrayList<>();
        jugadoresDisponibles.forEach(jugador -> jugadoresDisponiblesPrecio.add("  " + jugador.getPrecio() + "€"));

        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        modelo = new DefaultListModel();
        modelo.addAll(jugadoresDisponibles);
        listJugadoresFichar.setModel(modelo);
        modeloPrecio = new DefaultListModel();
        modeloPrecio.addAll(jugadoresDisponiblesPrecio);
        listaPreciosFichar.setModel(modeloPrecio);

        lblPresupuesto.setText(equipo.getPresupuesto() + "€");
        acciones();
        setVisible(true);


    }

    public void acciones(){
        bttnFichar.addActionListener(this);
        bttnVolver.addActionListener(this);
        listaPreciosFichar.addListSelectionListener(this);
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bttnFichar) {
            System.out.println(equipo.getPlantilla().size());
            Jugador jugador = (Jugador) listJugadoresFichar.getSelectedValue();
            if (jugador != null
                && equipo.getPlantilla().size() < 15
                    && equipo.getPresupuesto() - jugador.getPrecio() >= 0
                        && jugador.getIdEquipo() == 0){

                dbControler.ficharJugador(jugador, idEquipo, equipo.getPresupuesto());
                ArrayList<Jugador> plantilla = equipo.getPlantilla();
                plantilla.add(jugador);
                equipo.setPlantilla(plantilla);
                equipo.setPresupuesto(equipo.getPresupuesto() - jugador.getPrecio());
                jugador.setIdEquipo(equipo.getId());

                lblPresupuesto.setText(equipo.getPresupuesto() + "€");


                System.out.println("Jugador fichado con éxito");
                lblConsola.setText("Jugador fichado con éxito");
            } else {

                // Mensajes de fallos
                if (jugador == null) {
                    System.out.println("Debes seleccionar un jugador para fichar");
                    lblConsola.setText("Debes seleccionar un jugador para fichar");
                } else if (jugador.getIdEquipo() != 0){
                    System.out.println("El jugador seleccionado ya tiene equipo");
                    lblConsola.setText("El jugador seleccionado ya tiene equipo");
                } else if (equipo.getPlantilla().size() >= 15) {
                    System.out.println("Tu equipo ya ha llegado al máximo de jugadores");
                    lblConsola.setText("Tu equipo ya ha llegado al máximo de jugadores");
                } else if (equipo.getPresupuesto() - jugador.getPrecio() <= 0) {
                    System.out.println("No tienes dinero para comprar");
                    lblConsola.setText("No tienes dinero para comprar");
                }

            }

        } else if (e.getSource() == bttnVolver){
            dispose();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
        }
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
