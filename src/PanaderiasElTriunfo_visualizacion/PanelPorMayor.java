/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class PanelPorMayor extends Panel{
    JPanel centro;
    JPanel sur;

    public PanelPorMayor(VentanaVisualizacion ventana) {
        super(ventana);
        this.centro = new JPanel(new GridLayout(10,1));
        centro.add(new JLabel("Nombre del producto comprado:"));
        JTextField campo1 = new JTextField(10);
        campo1.addActionListener(controlador);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad  de producto comprado:"));
        JTextField campo2 = new JTextField(10);
        campo2.addActionListener(controlador);
        centro.add(campo2);
        centro.add(new JLabel("Costo total de la compra:"));
        JTextField campo3 = new JTextField(10);
        campo3.addActionListener(controlador);
        centro.add(campo3);
        centro.add(new JLabel("Nombre del proovedor:"));
        JTextField campo4 = new JTextField(10);
        campo4.addActionListener(controlador);
        centro.add(campo4);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar venta");
        registrar.addActionListener(controlador);
        sur.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(controlador);
        sur.add(cancelar);
    }

    @Override
    public void serAgregado() {
        this.ventana.add(centro, BorderLayout.CENTER);
        this.ventana.add(sur, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
