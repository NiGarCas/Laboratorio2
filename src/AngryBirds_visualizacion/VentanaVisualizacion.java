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
        initUI();
    }

    private void initUI() {
        add(new PanelAngryBirds());
        setSize(948, 519);
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        VentanaVisualizacion ex = new VentanaVisualizacion();
        ex.setVisible(true);
       
    }
}
