package teoria.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JPanel panelCentral;
    private JButton botonPulsar, botonReset;
    private JTextField textFieldNombre;

    public VentanaPrincipal(){

        setTitle("Ventana principal");
        setSize(400, 400);
        setLocationRelativeTo(null); // Empieza en el centro (No es relativo a nada)
        setVisible(true);

        instancias();
        initGUI();
        acciones();


    }

    public void instancias(){
        // El panel es como el body, sin el panel no puedes poner nada dentro
        panelCentral = new JPanel();
        //panelCentral.setLayout(new GridLayout(1,2)); // 1 fila, 2 columnas
        //panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS)); // Alinea en el eje Y
        botonPulsar = new JButton("Pulsar boton");
        botonReset = new JButton("Resetear");
        textFieldNombre = new JTextField("Camion", 20);
    }

    public void initGUI(){
        setContentPane(panelCentral);

        // Al panel central le añadimos el botón
        panelCentral.add(botonPulsar);
        panelCentral.add(botonReset);
        panelCentral.add(textFieldNombre);
    }

    public void acciones(){

        // LE PASAS UN ACTION LISTENER
        // ya que VentanaPrincipal implementa ActionListener, se la puedes pasar
        botonPulsar.addActionListener(this);
        botonReset.addActionListener(this);


        /*botonPulsar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //System.out.println("Botón pulsado con éxito");
                if (!(textFieldNombre.getText().length() > 0)){
                    System.out.println("Inserta nombre bro");
                } else{
                System.out.printf("Perfecto %s, has capturado un texto de un textField :D\n",
                        textFieldNombre.getText());
                }
            }

        });

        botonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNombre.setText("");
            }
        });*/



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Este texto aplica acciones a los elementos que quieras (Te quita mazo código)
        // Este método se lo pongo a los dos botones
        // Decidir que botón es el pulsado

        // Recives un evento por parámetros y preguntas que fuente lo ha provocado
        if (e.getSource() == botonPulsar){
            if (!(textFieldNombre.getText().length() > 0)){
                System.out.println("Inserta nombre bro");
            } else{
                System.out.printf("Perfecto %s, has capturado un texto de un textField :D\n",
                        textFieldNombre.getText());
            }
        } else if (e.getSource() == botonReset){
            textFieldNombre.setText("");
        }

    }
}
