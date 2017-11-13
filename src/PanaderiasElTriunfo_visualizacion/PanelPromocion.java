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
public class PanelPromocion extends Panel{
     JPanel centro;
     JPanel sur;

    public PanelPromocion(VentanaVisualizacion ventana) {
        super(ventana);
        this.centro = new JPanel(new GridLayout(7,1));
        centro.add(new JLabel("Nombre del producto que desea poner en promoción:"));
        JTextField campo1 = new JTextField(10);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Descuento (%) que le desea aplicar al producto:"));
        JTextField campo2 = new JTextField(10);
        campo2.addActionListener(this);
        centro.add(campo2);
        centro.add(new JLabel("Número de dias que durará la promoción:"));
        JTextField campo3 = new JTextField(10);
        campo3.addActionListener(this);
        centro.add(campo3);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar promoción");
        registrar.addActionListener(this);
        sur.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        sur.add(cancelar);
    }

    @Override
    public void serAgregado() {
        this.ventana.add(this.centro, BorderLayout.CENTER);
        this.ventana.add(this.sur, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
