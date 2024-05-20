package ejercicios.calculadora.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JPanel panelCentral;
    private JTextField primerHueco, segundoHueco;
    private JButton suma, resta, division, multiplicacion, operar;
    private String operacion;
    public VentanaPrincipal() throws HeadlessException {
        setTitle("Calculadora");
        setSize(1000,600);
        setLocationRelativeTo(null);
        setVisible(true);

        instancias();
        initGUI();
        acciones();
    }



    public void instancias(){
        panelCentral = new JPanel();
        primerHueco = new JTextField(3);
        segundoHueco = new JTextField(3);

        suma = new JButton("+");
        resta = new JButton("-");
        multiplicacion = new JButton("*");
        division = new JButton("/");
        operar = new JButton("OPERAR");
    }
    public void initGUI(){
        setContentPane(panelCentral);

        panelCentral.add(primerHueco);
        panelCentral.add(segundoHueco);
        panelCentral.add(suma);
        panelCentral.add(resta);
        panelCentral.add(multiplicacion);
        panelCentral.add(division);
        panelCentral.add(operar);
    }
    public void acciones(){
        suma.addActionListener(this);
        resta.addActionListener(this);
        multiplicacion.addActionListener(this);
        division.addActionListener(this);
        operar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() != operar){
            operacion = ((JButton) e.getSource()).getLabel();
        } else {
            double primerNumero = Integer.parseInt(primerHueco.getText());
            double segundoNumero = Integer.parseInt(segundoHueco.getText());
            switch (operacion){
                case "+" -> System.out.println(primerNumero + segundoNumero);
                case "-" -> System.out.println(primerNumero - segundoNumero);
                case "/" -> System.out.println(primerNumero / segundoNumero);
                case "*" -> System.out.println(primerNumero * segundoNumero);
            }
        }
    }
}
