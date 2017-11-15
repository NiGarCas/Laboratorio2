/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelInventario extends Panel{
    
    public PanelInventario(VentanaVisualizacion ventana) {
        super(ventana);
        this.agregarComponentes();
    }

    @Override
    public void agregarComponentes() {
        this.norte = new JPanel(new GridLayout((this.ventana.getSucursal().getProductos().size() + 2),3));
        norte.add(new JLabel("PRODUCTO"));
        norte.add(new JLabel("PRECIO"));
        norte.add(new JLabel("CANTIDAD"));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        for(int i = 0;i< this.ventana.getSucursal().getProductos().size(); i++){
            norte.add(new JLabel(this.ventana.getSucursal().getProductos().get(i).getNombre()));
            String precio = Double.toString(this.ventana.getSucursal().getProductos().get(i).getPrecio());
            norte.add(new JLabel("$" + precio));
            String cantidad = Integer.toString(this.ventana.getSucursal().getProductos().get(i).getCantidad_actual());
            norte.add(new JLabel(cantidad));
        }
        this.centro = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Generar reporte");
        registrar.addActionListener(this);
        centro.add(registrar);
        JButton cancelar = new JButton("Volver al menú principal");
        cancelar.addActionListener(this);
        centro.add(cancelar);
        
        this.setLayout(new BorderLayout());
        
        this.add(centro, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton source = (JButton)ae.getSource();
        String boton = source.getText();
        if(boton.equals("Generar reporte")){
            this.removeAll();
            this.agregarComponentes();
            this.add(norte, BorderLayout.NORTH);
            this.ventana.actualizarPanel(this.ventana.getPaneles()[6]);
        }else{
            this.remove(norte);
            this.ventana.actualizarPanel(this.ventana.getPaneles()[0]);
        }
    }
}
