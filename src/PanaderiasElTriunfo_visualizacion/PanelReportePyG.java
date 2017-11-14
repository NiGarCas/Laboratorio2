/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    JTextField campo1;
    JTextField campo2;
    JTextField campo3;

    public PanelReportePyG(VentanaVisualizacion ventana) {
        super(ventana);
        this.agregarComponentes();
    }
    
    @Override
    public void serAgregado() {
        this.ventana.add(norte, BorderLayout.NORTH);
        this.ventana.add(centro, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        if(boton.equals("Generar reporte")){
            String p = this.campo1.getText();
            int mes = parseInt(p);
            String p2 = this.campo2.getText();
            int dia = parseInt(p2);
            String nombre = this.campo3.getText();

        }else{
//            retornar al principal
        }
    }

    @Override
    public void agregarComponentes() {
        this.norte = new JPanel(new GridLayout(8,1));
        norte.add(new JLabel("Numero del mes:"));
        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        norte.add(campo1);
        norte.add(new JLabel("Numero del dia:"));
        campo2 = new JTextField(10);
        campo2.addActionListener(this);
        norte.add(campo2);
        norte.add(new JLabel("Nombre del producto:"));
        campo3 = new JTextField(10);
        campo3.addActionListener(this);
        norte.add(campo3);
        
        this.centro = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Generar reporte");
        registrar.addActionListener(this);
        centro.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        centro.add(cancelar);
        
        //        reporte en panel sur
    }
}
