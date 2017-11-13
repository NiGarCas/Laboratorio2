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
public class PanelReportePyG extends Panel{
    JPanel norte;
    JPanel centro;
    JPanel sur;

    public PanelReportePyG(VentanaVisualizacion ventana) {
        super(ventana);
        this.norte = new JPanel(new GridLayout(8,1));
        norte.add(new JLabel("Numero del mes:"));
        JTextField campo1 = new JTextField(10);
        campo1.addActionListener(this);
        norte.add(campo1);
        norte.add(new JLabel("Numero del dia:"));
        JTextField campo2 = new JTextField(10);
        campo2.addActionListener(this);
        norte.add(campo2);
        norte.add(new JLabel("Nombre del producto:"));
        JTextField campo3 = new JTextField(10);
        campo3.addActionListener(this);
        norte.add(campo3);
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
