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
public class PanelPorMayor extends Panel{
    JPanel centro;
    JPanel sur;
    JTextField campo1;
    JTextField campo2;
    JTextField campo3;
    JTextField campo4;

    public PanelPorMayor(VentanaVisualizacion ventana) {
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
        if(boton.equals("Registrar venta")){
            String nombre = this.campo1.getText();
            String p = this.campo2.getText();
            int cantidad = parseInt(p);
            String p2 = this.campo3.getText();
            float valor = parseInt(p2);
            String cliente = this.campo4.getText();
            boolean a = this.ventana.getSucursal().registrarVentaPorMayor(nombre, cantidad, valor, cliente);
            if(a){
                JOptionPane.showMessageDialog(this.ventana, "Venta registrada exitosamente");
            }else{
                JOptionPane.showMessageDialog(this.ventana, "Error: no se encontró producto con ese nombre");
            }
            
        }else{
//            retornar al principal
        }
    }

    @Override
    public void agregarComponentes() {
        this.centro = new JPanel(new GridLayout(9,1));
        centro.add(new JLabel("Nombre del producto vendido:"));
        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        centro.add(campo1);
        centro.add(new JLabel("Cantidad  de producto vendido:"));
        campo2 = new JTextField(10);
        campo2.addActionListener(this);
        centro.add(campo2);
        centro.add(new JLabel("Valor total de la venta ($):"));
        campo3 = new JTextField(10);
        campo3.addActionListener(this);
        centro.add(campo3);
        centro.add(new JLabel("Nombre del cliente:"));
        campo4 = new JTextField(10);
        campo4.addActionListener(this);
        centro.add(campo4);
        
        this.sur = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Registrar venta");
        registrar.addActionListener(this);
        sur.add(registrar);
        JButton cancelar = new JButton("Cancelar (Volver al menú principal)");
        cancelar.addActionListener(this);
        sur.add(cancelar);
    }
}
