/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public abstract class Panel extends JPanel  implements ActionListener{
    protected VentanaVisualizacion ventana;

    public Panel(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }
    
    public abstract void serAgregado();
}
