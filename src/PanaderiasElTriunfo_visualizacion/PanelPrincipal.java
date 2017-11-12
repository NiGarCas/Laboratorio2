/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class PanelPrincipal extends JPanel{
    VentanaVisualizacion ventana;
    
    public PanelPrincipal(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.ventana.setLayout(new BorderLayout());
        JPanel norte = new JPanel (new GridLayout(3,3));
        norte.add(new JLabel("PANADERÍA EL TRIUNFO"));
        norte.add(new JLabel(" "));
        JButton pasarDia = new JButton("PASAR AL DÍA SIGUIENTE");
        norte.add(pasarDia);
        norte.add(new JLabel(this.ventana.getSucursal().getDia() + " DE " + this.ventana.getSucursal().getMes().getNombre()));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        this.ventana.add(norte, BorderLayout.NORTH);
        
        JPanel izquierda = new JPanel(new GridLayout(7,1));
        izquierda.add(new JLabel("                         REGISTRO"));
        JButton regCompra = new JButton("Registrar Compra a proovedor");
//        regCompra.addActionListener();
        izquierda.add(regCompra);
        JButton regPorMayor = new JButton("Registrar Venta al por mayor");
        izquierda.add(regPorMayor);
        JButton regPorMenor = new JButton("Registrar Venta al por menor");
        izquierda.add(regPorMenor);
        this.ventana.add(izquierda, BorderLayout.WEST);
        
        JPanel centro = new JPanel(new GridLayout(7,1));
        centro.add(new JLabel("                                  REPORTES"));
        JButton inventario = new JButton ("Inventario");
        centro.add(inventario);
        JButton caja = new JButton ("Caja");
        centro.add(caja);
        JButton movInventario = new JButton ("Movimiento del inventario");
        centro.add(movInventario);
        JButton ventas = new JButton ("Histórico de ventas");
        centro.add(ventas);
        JButton pyg = new JButton ("Pérdidas y ganancias");
        centro.add(pyg);
        this.ventana.add(centro, BorderLayout.CENTER);
        
        JPanel derecha = new JPanel(new GridLayout(7,1));
        derecha.add(new JLabel("                      PRODUCTOS"));
        JButton agregar = new JButton("Agregar producto");
        derecha.add(agregar);
        JButton eliminar = new JButton("Eliminar producto");
        derecha.add(eliminar);
        JButton cambiarPrecio = new JButton("Poner producto en promoción");
        derecha.add(cambiarPrecio);
        this.ventana.add(derecha, BorderLayout.EAST);
        JPanel sur = new JPanel (new GridLayout(5,3));
        sur.add(new JLabel("SOPORTE-AYUDA:"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel("Severo Velandia - Panadería El Triunfo"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel("Calle 18S #17B-77 - Teléfono: 568 88 97"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel("Horario de atención: 6:00AM - 9:00PM"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        this.ventana.add(sur, BorderLayout.SOUTH);
        this.ventana.pack();
    }

}
