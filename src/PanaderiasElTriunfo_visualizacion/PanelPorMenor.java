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
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class PanelPorMenor extends Panel{

    public PanelPorMenor(VentanaVisualizacion ventana) {
        super(ventana);
        this.agregarComponentes();
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        if(boton.equals("Registrar Venta")){
            String nombre = this.campo1.getText();
            String p = this.campo2.getText();
            int cantidad = parseInt(p);
            boolean a = this.ventana.getSucursal().registrarVentaPorMenor(nombre, cantidad);
            if(a){
                JOptionPane.showMessageDialog(this.ventana, "Venta registrada exitosamente");
            }else{
                JOptionPane.showMessageDialog(this.ventana, "Error: no se encontró producto con ese nombre o no hay suficiente cantidad");
            }
            
        }else{
            this.ventana.actualizarPanel(this.ventana.getPaneles()[0]);
        }
    }

    @Override
    public void agregarComponentes() {
        this.centro = new JPanel(new GridLayout(6,1));
        centro.add(new JLabel("Nombre del producto vendido:"));
        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad de producto vendida:"));
        campo2 = new JTextField(10);
        campo2.addActionListener(this);
        centro.add(campo2);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar Venta");
        registrar.addActionListener(this);
        sur.add(registrar);
        JButton cancelar = new JButton("Volver al menú principal");
        cancelar.addActionListener(this);
        sur.add(cancelar);
        
        this.setLayout(new BorderLayout());
        this.add(centro, BorderLayout.CENTER);
        this.add(sur, BorderLayout.SOUTH);
    }
}
