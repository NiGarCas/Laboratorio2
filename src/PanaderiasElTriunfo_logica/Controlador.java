/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_logica;

import PanaderiasElTriunfo_datos.Mes;
import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_visualizacion.Panel;
import PanaderiasElTriunfo_visualizacion.PanelPrincipal;
import PanaderiasElTriunfo_visualizacion.VentanaVisualizacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author nicol
 */
public class Controlador implements ActionListener{
    
    private VentanaVisualizacion ventana;
    private SucursalPanaderia sucursal;
    private Timer timer ;

    public Controlador(VentanaVisualizacion ventana, SucursalPanaderia sucursal) {
        this.ventana = ventana;
        this.sucursal = sucursal;
        this.ventana.setControlador(this);
        this.timer = new Timer (25,this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        this.ventana.getPanel_actual().actionPerformed(evento);
        this.ventana.getPanel_actual().repaint();
    }
    
    public void inicialAplicacion(){
        this.ventana.setVisible(true);
    }
}
