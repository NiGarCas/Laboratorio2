/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import PanaderiasElTriunfo_logica.Controlador;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nicol
 */
public abstract class Panel extends JPanel{
    protected VentanaVisualizacion ventana;
    protected Controlador controlador;

    public Panel(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.controlador = this.ventana.getControlador();
    }
    
    public abstract void serAgregado();
    public abstract void actionPerformed(ActionEvent evento);
}
