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
public class PanelPromocion extends Panel{
     JPanel centro;
     JPanel sur;
     JTextField campo1;
     JTextField campo2;
     JTextField campo3;

    public PanelPromocion(VentanaVisualizacion ventana) {
        super(ventana);
        this.agregarComponentes();
    }

    @Override
    public void serAgregado() {
        this.ventana.add(this.centro, BorderLayout.CENTER);
        this.ventana.add(this.sur, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
         JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        if(boton.equals("Registrar promoción")){
            String nombre = this.campo1.getText();
            String p = this.campo2.getText();
            float descuento = parseFloat(p);
            String p2 = this.campo2.getText();
            int dias = parseInt(p2);
            boolean a = this.ventana.getSucursal().cambiarPrecio(nombre,descuento,dias);
            if(a){
                JOptionPane.showMessageDialog(this.ventana, "Promoción registrada exitosamente exitosamente");
            }else{
                JOptionPane.showMessageDialog(this.ventana, "Error: no se encontró producto con ese nombre y/o los valores colocados no son válidos");
            }
            
        }else{
//            retornar al principal
        }
    }

    @Override
    public void agregarComponentes() {
        this.centro = new JPanel(new GridLayout(7,1));
        centro.add(new JLabel("Nombre del producto que desea poner en promoción:"));
        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Descuento (%) que le desea aplicar al producto:"));
        campo2 = new JTextField(10);
        campo2.addActionListener(this);
        centro.add(campo2);
        centro.add(new JLabel("Número de dias que durará la promoción:"));
        campo3 = new JTextField(10);
        campo3.addActionListener(this);
        centro.add(campo3);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar promoción");
        registrar.addActionListener(this);
        sur.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        sur.add(cancelar);
    }
    
}
