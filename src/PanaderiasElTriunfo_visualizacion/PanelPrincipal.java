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
    
    public PanelPrincipal(VentanaVisualizacion v) {
        v.setLayout(new BorderLayout());
        JPanel norte = new JPanel (new GridLayout(2,1));
        norte.add(new JLabel("PANADERIA EL TRIUNFO"));
        norte.add(new JLabel("11/11/17"));
        this.add(norte, BorderLayout.NORTH);
        JPanel izquierda = new JPanel(new GridLayout(4,1));
        izquierda.add(new JLabel("                         REGISTRO"));
        JButton regCompra = new JButton("Registrar Compra a proovedor");
//        regCompra.addActionListener();
        izquierda.add(regCompra);
        JButton regPorMayor = new JButton("Registrar Venta al por mayor");
        izquierda.add(regPorMayor);
        JButton regPorMenor = new JButton("Registrar Venta al por menos");
        izquierda.add(regPorMenor);
        this.add(izquierda, BorderLayout.WEST);
        JPanel centro = new JPanel(new GridLayout(6,1));
        centro.add(new JLabel("                       REPORTES"));
        JButton inventario = new JButton ("Inventario");
        centro.add(inventario);
        JButton caja = new JButton ("Caja");
        centro.add(caja);
        JButton movInventario = new JButton ("Movimiento del inventario");
        centro.add(movInventario);
        JButton ventas = new JButton ("Historico de ventas");
        centro.add(ventas);
        JButton pyg = new JButton ("Perdidas y ganancias");
        centro.add(pyg);
        this.add(centro, BorderLayout.CENTER);
        JPanel derecha = new JPanel(new GridLayout(4,1));
        derecha.add(new JLabel("                       PRODUCTOS"));
        JButton agregar = new JButton("Agregar producto");
        derecha.add(agregar);
        JButton eliminar = new JButton("Eliminar producto");
        derecha.add(eliminar);
        JButton cambiarPrecio = new JButton("Poner producto en promocion");
        derecha.add(cambiarPrecio);
        
        
        this.add(derecha, BorderLayout.EAST);
        
        this.add(new JLabel("SOPORTE - AYUDA: Severo Velandia (Tel: 426 78 96)"), BorderLayout.SOUTH);
        
    }

}
