/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import PanaderiasElTriunfo_datos.SucursalPanaderia;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class VentanaVisualizacion extends JFrame{
    private SucursalPanaderia sucursal;
    private Panel[]paneles;
    private JPanel panel_actual;

    public VentanaVisualizacion(SucursalPanaderia sucursal) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,250);
        this.setSize(750, 400);
        this.setTitle("Panaderias El Triunfo");
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.sucursal = sucursal;
        this.paneles = new Panel[10];
        this.paneles[0] = new PanelPrincipal(this);
        this.paneles[1] =new PanelAgregarProducto(this);
        this.paneles[2] = new PanelPromocion(this);
        this.paneles[3] = new PanelCompra(this);
        this.paneles[4] = new PanelPorMayor(this);
        this.paneles[5] = new PanelPorMenor(this);
        this.paneles[6] = new PanelInventario(this);
        this.paneles[7] = new PanelCaja(this);
        this.paneles[8] = new PanelReporteVentas(this);
        this.paneles[9] = new PanelReportePyG(this);
        this.panel_actual = new JPanel();
        this.actualizarPanel(this.paneles[0]);
        this.setVisible(true);
    }

    public SucursalPanaderia getSucursal() {
        return sucursal;
    }

    public JPanel getPanel_actual() {
        return panel_actual;
    }

    public void setPanel_actual(JPanel panel) {
        this.panel_actual = panel;
    }

    public Panel[] getPaneles() {
        return paneles;
    }
    
    public void actualizarPanel(Panel panel){
        
        this.getPanel_actual().removeAll();
        this.getPanel_actual().add(panel);
        this.getPanel_actual().updateUI();
        this.getPanel_actual().repaint();
    }
}
