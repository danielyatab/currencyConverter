/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controler.Conversor;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author yatac
 */
public class ViewConversor extends JFrame {

    private JComboBox<String> jcomboMonedas;
    private JTextField textField;
    private JButton botonConvertir;

    public ViewConversor() {
        //Configuracion de la ventana
        setTitle("Ejemplo Combo Box");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] opciones = {"dolar", "euro", "pesosmx", "pesoschl"};

        jcomboMonedas = new JComboBox<>(opciones);

        // Configurar el ActionListener para el JComboBox
        jcomboMonedas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el elemento seleccionado y mostrarlo en la consola
                String seleccion = (String) jcomboMonedas.getSelectedItem();
                System.out.println("Opción seleccionada: " + seleccion);
            }
        });

        textField = new JTextField(5);

        botonConvertir = new JButton("Convertir");
        botonConvertir.addActionListener((e) -> {
            Conversor convertirMoneda = new Conversor();
            double cantidad = 0;
            try {
                cantidad = Double.parseDouble(textField.getText());                
                convertirMoneda.convertirMonedas((String) jcomboMonedas.getSelectedItem(), cantidad);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese un numero real",
                        "",
                        JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        });

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jcomboMonedas);
        container.add(textField);
        container.add(botonConvertir);
    }
}
