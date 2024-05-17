package ventanaFormulario.ui;

import ventanaFormulario.controller.GestorUsuarios;
import ventanaFormulario.model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaGeneral extends JFrame implements ActionListener {
    private JPanel panelCentral;
    private JLabel etiquetaNombre;
    private JPanel panelDatos;
    private JLabel nombreUsuario;
    private JLabel apellidoUsuario;
    private JList listaDatos;
    private GestorUsuarios gestorUsuarios;
    private Usuario usuario;
    private ArrayList<String> listado;


    public VentanaGeneral(GestorUsuarios gestorUsuarios, Usuario usuario) {
        setContentPane(panelCentral);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        listado = new ArrayList<>();
        listado.add("futbol");
        listado.add("tenis");
        listado.add("golf");
        listado.add("league of legends");

        this.gestorUsuarios = gestorUsuarios;
        this.usuario = usuario;

        initGUI();
    }

    public void initGUI(){
        System.out.println(usuario.getNombre());
        nombreUsuario.setText(usuario.getNombre());
        apellidoUsuario.setText(usuario.getApellido());
    }

    public void acciones(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
