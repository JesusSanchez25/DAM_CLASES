    package ventanaFormulario.ui;

    import ventanaFormulario.controller.GestorUsuarios;
    import ventanaFormulario.model.Usuario;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class VentanaFormulario extends JFrame implements ActionListener {
        private JPanel panelCentral;
        private JButton botonRegistro, botonListar;
        private JTextField textoNombre, textoApellido, textoCorreo, textoTelefono;
        private final GestorUsuarios gestorUsuarios;
        private JLabel etiquetaConfirmacion;
        public VentanaFormulario(GestorUsuarios gestorUsuarios) throws HeadlessException {
            setTitle("VentanaFormulario");
            setSize(1000,600);
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
            panelCentral.add(etiquetaConfirmacion);


        }
        public void acciones(){
            botonRegistro.addActionListener(this);
            botonListar.addActionListener(this);
        }

        public void vaciarCeldas(){
            textoNombre.setText("");
            textoApellido.setText("");
            textoCorreo.setText("");
            textoTelefono.setText("");
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == botonRegistro){
                try {

                    if (textoNombre.getText().length() == 0 || textoApellido.getText().length() == 0 || textoCorreo.getText().length() == 0 || textoTelefono.getText().length() == 0){
                        throw new Exception("Datos vacios");
                    }

                    gestorUsuarios.agregarUsuario(
                            new Usuario(textoNombre.getText(), textoApellido.getText(),
                                        textoCorreo.getText(), textoTelefono.getText())
                    );
                    vaciarCeldas();
                    etiquetaConfirmacion.setText("" + gestorUsuarios.getListaUsuarios().size());
                    System.out.println("Usuario agregado con éxito");


                    } catch (NumberFormatException ex){
                    System.out.println("El teléfono debe ser un número"); // o debería
                } catch (Exception ex) {
                    System.out.println("Introduce bien los datos");
                }

            } else if (e.getSource() == botonListar){
                gestorUsuarios.listarUsuarios();
        }


    }}
