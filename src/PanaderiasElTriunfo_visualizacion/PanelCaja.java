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
public class PanelCaja extends Panel{

    JPanel norte;
    JPanel centro;
    JPanel sur;

    public PanelCaja(VentanaVisualizacion ventana) {
        super(ventana);
        this.norte = new JPanel(new GridLayout(5,1));
        norte.add(new JLabel("Numero del mes:"));
        JTextField campo1 = new JTextField(10);
        campo1.addActionListener(this);
        norte.add(campo1);
        norte.add(new JLabel("Numero del dia:"));
        JTextField campo2 = new JTextField(10);
        campo2.addActionListener(this);
        norte.add(campo2);
        
        this.centro = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Generar reporte");
        registrar.addActionListener(this);
        centro.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        centro.add(cancelar);
    }

    @Override
    public void serAgregado() {
      this.ventana.add(norte, BorderLayout.NORTH);
      this.ventana.add(centro, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        
    }
    
}
