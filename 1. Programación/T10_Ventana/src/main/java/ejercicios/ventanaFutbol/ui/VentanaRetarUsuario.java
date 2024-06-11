package ejercicios.ventanaFutbol.ui;

import ejercicios.ventanaFutbol.controler.DBControler;
import ejercicios.ventanaFutbol.model.Equipo;
import ejercicios.ventanaFutbol.model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaRetarUsuario extends JFrame implements ActionListener {

    private JPanel panelCentral;
    private JTextField textIdUsuario;
    private JLabel textTitulo;
    private JButton bttnRetar;
    private JLabel lblConsola;
    private JButton bttnVolver;
    private int idUsuario;
    private int idEquipo;

    private int idUsuarioRival;
    private int idEquipoRival;
    private Equipo equipo;
    private DBControler dbControler;
    private ArrayList<Jugador> jugadoresEquipo;
    private ArrayList<String> jugadoresEquipoExtendido;
    private DefaultListModel modelo;


    public VentanaRetarUsuario(int idUsuario) throws HeadlessException {
        this.dbControler = new DBControler();
        this.idUsuario = idUsuario;
        this.idEquipo = dbControler.sacarIdEquipo(idUsuario);
        this.equipo = dbControler.sacarEquipo(idEquipo);
        this.jugadoresEquipo = dbControler.sacarJugadoresEquipo(idEquipo);
        this.jugadoresEquipoExtendido = new ArrayList<>();
        jugadoresEquipo.forEach(jugador -> jugadoresEquipoExtendido.add(jugador.toStringAmpliado()));

        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);

        acciones();
        setVisible(true);
    }

    public void acciones(){
        bttnRetar.addActionListener(this);
        bttnVolver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bttnRetar) {
            Boolean ganado = dbControler.retarUsuario(idUsuario, Integer.parseInt(textIdUsuario.getText()));

            try {
                if (ganado) {
                    lblConsola.setText("Has ganado");
                    equipo.setPresupuesto(equipo.getPresupuesto() + 10000);

                    Equipo objetoEquipo2 = dbControler.sacarEquipo(dbControler.sacarIdEquipo(Integer.parseInt(textIdUsuario.getText())));
                    objetoEquipo2.setPresupuesto(objetoEquipo2.getPresupuesto() - 10000);
                    dbControler.setPresupuestoEquipo(equipo.getPresupuesto(), equipo.getId());
                    dbControler.setPresupuestoEquipo(objetoEquipo2.getPresupuesto(), objetoEquipo2.getId());
                } else {
                    lblConsola.setText("Has perdido");
                    Equipo objetoEquipo2 = dbControler.sacarEquipo(dbControler.sacarIdEquipo(Integer.parseInt(textIdUsuario.getText())));
                    equipo.setPresupuesto(equipo.getPresupuesto() - 10000);
                    objetoEquipo2.setPresupuesto(objetoEquipo2.getPresupuesto() + 10000);

                    dbControler.setPresupuestoEquipo(equipo.getPresupuesto(), equipo.getId());
                    dbControler.setPresupuestoEquipo(objetoEquipo2.getPresupuesto(), objetoEquipo2.getId());

                }

            } catch (Exception ex) {
                System.out.println("Inserte un id válido");
                lblConsola.setText("Inserte un id válido");
            }


        }else if(e.getSource() == bttnVolver){
            dispose();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(idUsuario);
        }
    }
}
