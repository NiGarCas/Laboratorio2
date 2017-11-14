/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import static java.lang.Float.parseFloat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class PanelAgregarProducto extends Panel{
    JPanel centro;
    JPanel sur;
    JTextField campo1;
    JTextField campo2;

    public PanelAgregarProducto(VentanaVisualizacion ventana) {
        super(ventana);
        this.agregarComponentes();
    }

    @Override
    public void serAgregado() {
        this.ventana.add(centro, BorderLayout.CENTER);
        this.ventana.add(sur, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        if(boton.equals("Agregar Producto")){
            String nombre = this.campo1.getText();
            String p = this.campo2.getText();
            float precio = parseFloat(p);
            boolean a = this.ventana.getSucursal().agregarProducto(nombre, precio);
            if(a){
                JOptionPane.showMessageDialog(this.ventana, "Producto agregado exitosamente");
            }else{
                JOptionPane.showMessageDialog(this.ventana, "Error: ya existe un producto con ese nombre");
            }
            
        }else{
//            retornar al principal
        }
    }

    @Override
    public void agregarComponentes() {
        this.centro = new JPanel(new GridLayout(5,1));
        centro.add(new JLabel("Nombre del producto a agregar:"));
        campo1 = new JTextField(30);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Precio al que se venderá el producto ($):"));
        campo2 = new JTextField(30);
        campo2.addActionListener(this);
        centro.add(campo2);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton agregar = new JButton("Agregar Producto");
        agregar.addActionListener(this);
        sur.add(agregar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        sur.add(cancelar);
    }
    
}
