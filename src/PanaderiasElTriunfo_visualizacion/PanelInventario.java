/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelInventario extends Panel{
    
    private JPanel norte;
    private JPanel centro;
    
    public PanelInventario(VentanaVisualizacion ventana) {
        super(ventana);
        this.centro = new JPanel(new GridLayout((this.ventana.getSucursal().getProductos().size() + 2),4));
        centro.add(new JLabel("PRODUCCTO"));
        centro.add(new JLabel("COSTO"));
        centro.add(new JLabel("PRECIO"));
        centro.add(new JLabel("CANTIDAD"));
        centro.add(new JLabel(" "));
        centro.add(new JLabel(" "));
        centro.add(new JLabel(" "));
        centro.add(new JLabel(" "));
        for(int i = 0;i< this.ventana.getSucursal().getProductos().size(); i++){
            centro.add(new JLabel("producto"));
            centro.add(new JLabel("costo"));
            centro.add(new JLabel("precio"));
            centro.add(new JLabel("cantidad"));

        }
    }
    
    @Override
    public void serAgregado() {
        this.ventana.add(centro, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
