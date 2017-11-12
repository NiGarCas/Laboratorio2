/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class PanelCompra extends JPanel{
    VentanaVisualizacion ventana;

    public PanelCompra(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.ventana.setLayout(new BorderLayout());
        JPanel centro = new JPanel(new GridLayout(10,1));
        centro.add(new JLabel("Nombre del producto comprado:"));
        JTextField campo1 = new JTextField(10);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad  de producto comprado:"));
        JTextField campo2 = new JTextField(10);
        centro.add(campo2);
        centro.add(new JLabel("Costo total de la compra:"));
        JTextField campo3 = new JTextField(10);
        centro.add(campo3);
        centro.add(new JLabel("Nombre del proovedor:"));
        JTextField campo4 = new JTextField(10);
        centro.add(campo4);
        JPanel sur = new JPanel(new GridLayout(1,2));
        sur.add(new JButton("Agregar Producto"));
        sur.add(new JButton("Cancelar(Volver al menú principal)"));
        this.ventana.add(centro, BorderLayout.CENTER);
        this.ventana.add(sur, BorderLayout.SOUTH);
        
    }
}
