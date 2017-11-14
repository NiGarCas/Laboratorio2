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
public class PanelCompra extends Panel{
    JPanel centro;
    JPanel sur;
    JTextField campo1;
    JTextField campo2;
    JTextField campo3;
    JTextField campo4;

    public PanelCompra(VentanaVisualizacion ventana) {
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
        if(boton.equals("Registrar compra")){
            String nombre = this.campo1.getText();
            String p = this.campo2.getText();
            int cantidad = parseInt(p);
            String p2 = this.campo3.getText();
            float valor = parseInt(p2);
            String proovedor = this.campo4.getText();
            boolean a = this.ventana.getSucursal().registrarCompra(nombre,cantidad,valor,proovedor);
            if(a){
                JOptionPane.showMessageDialog(this.ventana, "Compra registrada exitosamente");
            }else{
                JOptionPane.showMessageDialog(this.ventana, "Error: no se encontró producto con ese nombre. Agregue el producto al software para registrar la compra");
            }
            
        }else{
//            retornar al principal
        }
    }

    @Override
    public void agregarComponentes() {
         this.centro = new JPanel(new GridLayout(10,1));
        centro.add(new JLabel("Nombre del producto comprado:"));
        campo1 = new JTextField(30);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad  de producto comprado:"));
        campo2 = new JTextField(30);
        campo2.addActionListener(this);
        centro.add(campo2);
        centro.add(new JLabel("Costo total de la compra ($):"));
        campo3 = new JTextField(30);
        campo3.addActionListener(this);
        centro.add(campo3);
        centro.add(new JLabel("Nombre del proovedor:"));
        campo4 = new JTextField(30);
        campo4.addActionListener(this);
        centro.add(campo4);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar compra");
        registrar.addActionListener(this);
        sur.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        sur.add(cancelar);
    }
}
