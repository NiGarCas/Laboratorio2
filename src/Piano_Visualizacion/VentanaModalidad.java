/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class VentanaModalidad extends JFrame{
    private PanelModalidad panel;
    public VentanaModalidad() {
        this.panel = new PanelModalidad(this);
        add(this.panel);
        setSize(500, 150);
        setTitle("Recordando la Secuencia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }   

    public PanelModalidad getPanel() {
        return panel;
    }
    
}
