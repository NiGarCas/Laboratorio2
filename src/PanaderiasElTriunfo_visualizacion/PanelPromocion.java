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
public class PanelPromocion extends JPanel{

     VentanaVisualizacion ventana;

    public PanelPromocion(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.ventana.setLayout(new BorderLayout());
        JPanel centro = new JPanel(new GridLayout(7,1));
        centro.add(new JLabel("Nombre del producto que desea poner en promoción:"));
        JTextField campo1 = new JTextField(10);
        centro.add(campo1);
        centro.add(new JLabel("Descuento (%) que le desea aplicar al producto:"));
        JTextField campo2 = new JTextField(10);
        centro.add(campo2);
        centro.add(new JLabel("Número de dias que durará la promoción:"));
        JTextField campo3 = new JTextField(10);
        centro.add(campo3);
        JPanel sur = new JPanel(new GridLayout(1,2));
        sur.add(new JButton("Agregar Producto"));
        sur.add(new JButton("Cancelar(Volver al menú principal)"));
        this.ventana.add(centro, BorderLayout.CENTER);
        this.ventana.add(sur, BorderLayout.SOUTH);
        
    }
    
}
