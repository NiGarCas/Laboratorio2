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
public class PanelCompra extends Panel{
    JPanel centro;
    JPanel sur;

    public PanelCompra(VentanaVisualizacion ventana) {
        super(ventana);
        this.centro = new JPanel(new GridLayout(10,1));
        centro.add(new JLabel("Nombre del producto comprado:"));
        JTextField campo1 = new JTextField(30);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad  de producto comprado:"));
        JTextField campo2 = new JTextField(30);
        campo2.addActionListener(this);
        centro.add(campo2);
        centro.add(new JLabel("Costo total de la compra:"));
        JTextField campo3 = new JTextField(30);
        campo3.addActionListener(this);
        centro.add(campo3);
        centro.add(new JLabel("Nombre del proovedor:"));
        JTextField campo4 = new JTextField(30);
        campo4.addActionListener(this);
        centro.add(campo4);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar compra");
        registrar.addActionListener(this);
        sur.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        sur.add(cancelar);    
    }

    @Override
    public void serAgregado() {
        this.ventana.add(centro, BorderLayout.CENTER);
        this.ventana.add(sur, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        
    }
}
