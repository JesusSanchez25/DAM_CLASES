package ventanaFormulario.ui;

import ventanaFormulario.controller.GestorUsuarios;
import ventanaFormulario.model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame implements ActionListener {
    private JPanel panelCentral;
    private JButton buttLogin;
    private JTextField textoCorreo, textoTelefono;
    private JLabel lablResultado;
    private GestorUsuarios gestorUsuarios;

    public VentanaLogin(GestorUsuarios gestorUsuarios) throws HeadlessException {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        instancias();
        initGUI();
        acciones();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        this.gestorUsuarios = gestorUsuarios;
    }

    public void instancias(){
        panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(8,1, 10, 20));

        textoCorreo = new JTextField();
        textoTelefono = new JTextField();

        buttLogin = new JButton("Login");

        lablResultado = new JLabel();
    }
    public void initGUI(){
        setContentPane(panelCentral);

        panelCentral.add(textoCorreo);
        panelCentral.add(textoTelefono);

        panelCentral.add(buttLogin);
        panelCentral.add(lablResultado);
    }
    public void acciones(){
        buttLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttLogin){
            String correo = textoCorreo.getText();
            String telefono = textoTelefono.getText();
            Usuario usuario = gestorUsuarios.sacarUsuario(correo);

            if (usuario != null){
                lablResultado.setText("Login realizado correctamente");
                VentanaGeneral ventanaGeneral = new VentanaGeneral(gestorUsuarios, usuario);

            } else {
                lablResultado.setText("No se ha encontrado el correo");
            }

        }
    }
}
