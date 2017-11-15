/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import PanaderiasElTriunfo_datos.Fecha;
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
public class PanelReportePyG extends Panel{

    Fecha fecha;

    public PanelReportePyG(VentanaVisualizacion ventana) {
        super(ventana);
        fecha = this.ventana.getSucursal().getFecha();
        this.agregarComponentes();
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        if(boton.equals("Generar reporte")){
            String p = this.campo1.getText();
            int mes = parseInt(p);
            String p2 = this.campo2.getText();
            int dia = parseInt(p2);
            fecha = this.ventana.getSucursal().existeFecha(dia,mes);
            if(fecha != null){
                this.removeAll();
                this.agregarComponentes();
                this.add(sur, BorderLayout.SOUTH);
                this.ventana.actualizarPanel(this.ventana.getPaneles()[9]);
            }else{
                JOptionPane.showMessageDialog(this.ventana, "Fecha incorrecta. Corrija los valores e intente nuevamente");
            }
        }else{
            this.remove(sur);
            this.ventana.actualizarPanel(this.ventana.getPaneles()[0]);
        }
    }

    @Override
    public void agregarComponentes() {
        this.norte = new JPanel(new GridLayout(5,1));
        norte.add(new JLabel("Numero del mes:"));
        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        norte.add(campo1);
        norte.add(new JLabel("Numero del dia:"));
        campo2 = new JTextField(10);
        campo2.addActionListener(this);
        norte.add(campo2);

        this.centro = new JPanel(new GridLayout(1,2));
        JButton registrar = new JButton("Generar reporte");
        registrar.addActionListener(this);
        centro.add(registrar);
        JButton cancelar = new JButton("Volver al menú principal");
        cancelar.addActionListener(this);
        centro.add(cancelar);
        
        this.sur = new JPanel(new GridLayout(3 ,3));
        sur.add(new JLabel("INGRESOS DURANTE EL DÍA"));
        sur.add(new JLabel("SALIDAS DURANTE EL DÍA"));
        sur.add(new JLabel("GANANCIA/PERDIDA EN EL DIA"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        double total_ventas = 0;
        double total_compras = 0;
        for (int i = 0; i < this.fecha.getVentas().size(); i++){
            total_ventas = total_ventas + this.fecha.getVentas().get(i).getValor_total();
        }
        for (int i = 0; i < this.fecha.getCompras().size(); i++){
            total_compras = total_compras + this.fecha.getCompras().get(i).getValor_total();
        }
        String ventas = Double.toString(total_ventas);
        sur.add(new JLabel("$" + ventas));
        int a;
        String compras = Double.toString(total_compras);
        sur.add(new JLabel("$" + compras));
        String gp = Double.toString(total_ventas - total_compras);
        sur.add(new JLabel("$" + gp));
        
        this.setLayout(new BorderLayout());
        this.add(norte, BorderLayout.NORTH);
        this.add(centro, BorderLayout.CENTER);
    }
}
