    package ventanaFormulario.ui;

    import ventanaFormulario.model.Usuario;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;

    public class VentanaFormulario extends JFrame implements ActionListener {
        private ArrayList<Usuario> usuarios;
        private JPanel panelCentral;
        private JButton botonRegistro, botonListar;
        private JTextField textoNombre, textoApellido, textoCorreo, textoTelefono;
        private JLabel etiquetaConfirmacion;
        public VentanaFormulario() throws HeadlessException {
            setTitle("VentanaFormulario");
            setSize(1000,600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            instancias();
            initGUI();
            acciones();

            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }

        public void instancias(){
            panelCentral = new JPanel();
            panelCentral.setLayout(new GridLayout(6,1, 10, 20));

            textoNombre = new JTextField();
            textoApellido = new JTextField();
            textoCorreo = new JTextField();
            textoTelefono = new JTextField();

            botonRegistro = new JButton("Registrar");
            botonListar = new JButton("Listar usuarios");

            etiquetaConfirmacion = new JLabel();
        }
        public void initGUI(){
            setContentPane(panelCentral);

            panelCentral.add(textoNombre);
            panelCentral.add(textoApellido);
            panelCentral.add(textoCorreo);
            panelCentral.add(textoTelefono);
            panelCentral.add(botonRegistro);
            panelCentral.add(botonListar);

            usuarios = new ArrayList<>();

        }
        public void acciones(){
            botonRegistro.addActionListener(this);
            botonListar.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == botonRegistro){
                usuarios.add(sacarUsuario());
                System.out.println("Usuario agregado con éxito");
            } else if (e.getSource() == botonListar){
                for (Usuario item : usuarios) {
                    System.out.println(item);
                }
                System.out.println("La cantidad de usuarios es de: " + usuarios.size());
            }
        }

        private Usuario sacarUsuario(){
            Usuario usuario = new Usuario(
                    textoNombre.getText(),
                    textoApellido.getText(),
                    textoCorreo.getText(),
                    textoTelefono.getText()
            );

            textoNombre.setText("");
            textoApellido.setText("");
            textoCorreo.setText("");
            textoTelefono.setText("");

            return usuario;
        }
    }
