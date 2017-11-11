/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_logica.Controlador;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class VentanaVisualizacion extends JFrame{
    private SucursalPanaderia sucursal;
    private Controlador controlador;

    public VentanaVisualizacion(SucursalPanaderia sucursal) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setTitle("Panaderias El Triunfo");
        this.sucursal = sucursal;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
}
