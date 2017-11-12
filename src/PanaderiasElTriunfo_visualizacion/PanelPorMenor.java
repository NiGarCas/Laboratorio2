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
public class PanelPorMenor extends JPanel{
    VentanaVisualizacion ventana;

    public PanelPorMenor(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.ventana.setLayout(new BorderLayout());
        JPanel centro = new JPanel(new GridLayout(6,1));
        centro.add(new JLabel("Nombre del producto vendido:"));
        JTextField campo1 = new JTextField(10);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad de producto vendida:"));
        JTextField campo2 = new JTextField(10);
        centro.add(campo2);
        JPanel sur = new JPanel(new GridLayout(1,2));
        sur.add(new JButton("Agregar Producto"));
        sur.add(new JButton("Cancelar(Volver al menú principal)"));
        this.ventana.add(centro, BorderLayout.CENTER);
        this.ventana.add(sur, BorderLayout.SOUTH);
        
    }
}
