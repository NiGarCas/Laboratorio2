/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_visualizacion;

import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class VentanaVisualizacion extends JFrame{
    
    public VentanaVisualizacion() {
        add(new PanelAngryBirds(this));
        setSize(938, 509);
        setTitle("Angry Birds");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }     
}
