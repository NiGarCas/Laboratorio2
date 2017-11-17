/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import AngryBirds_visualizacion.PanelAngryBirds;
import javax.swing.JFrame;
import Piano_Datos.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.*;
import sun.audio.*;
import java.util.*;        
import java.io.*;        
import javax.swing.JPanel;
/**
 *
 * @author El PcGamer
 */
public class VentanaVisualizacion extends JFrame{
    private Juego juego;
    private JPanel[]paneles;
    private JPanel panel_actual;
    
    public VentanaVisualizacion(Juego juego) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,250);
        this.setSize(750, 400);
        this.setTitle("Panaderias El Triunfo");
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.juego = juego;
        this.paneles = new JPanel[3];
        this.paneles[0] = new PanelModalidad(this);
        this.paneles[2] = new PanelAdivinar(this);
        this.panel_actual = new JPanel();
        this.actualizarPanel(this.paneles[0]);
        this.setVisible(true);
    }     

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public JPanel[] getPaneles() {
        return paneles;
    }

    public void setPaneles(JPanel[] paneles) {
        this.paneles = paneles;
    }

    public JPanel getPanel_actual() {
        return panel_actual;
    }

    public void setPanel_actual(JPanel panel_actual) {
        this.panel_actual = panel_actual;
    }
    
    public void agregarPanelPiano (PanelPiano panel){
        this.paneles[1] = panel;
    }
    
    public void actualizarPanel(JPanel panel) {
        this.panel_actual.removeAll();
        this.panel_actual.add(panel);
        this.panel_actual.updateUI();
        this.panel_actual.repaint();
    }

   
}
