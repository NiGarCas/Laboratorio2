/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_logica;

import PanaderiasElTriunfo_datos.Mes;
import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_visualizacion.PanelPrincipal;
import PanaderiasElTriunfo_visualizacion.VentanaVisualizacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class Controlador implements ActionListener{
    
    private VentanaVisualizacion ventana;
    private SucursalPanaderia sucursal;

    public Controlador(VentanaVisualizacion ventana, SucursalPanaderia sucursal) {
        this.ventana = ventana;
        this.sucursal = sucursal;
        this.ventana.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public void inicialAplicacion(){
        this.ventana.setVisible(true);
    }
}
