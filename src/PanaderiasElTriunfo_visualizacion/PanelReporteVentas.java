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
public class PanelReporteVentas extends Panel{

    Fecha fecha;
    
    public PanelReporteVentas(VentanaVisualizacion ventana) {
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
                if(this.fecha.getVentas().size() == 0){
                    JOptionPane.showMessageDialog(this.ventana, "En el dia escogido no hubo ventas");
                }else{
                    this.removeAll();
                    this.agregarComponentes();
                    this.add(sur, BorderLayout.SOUTH);
                    this.ventana.actualizarPanel(this.ventana.getPaneles()[8]);
                }
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
        System.out.println(this.fecha.getDia());
        this.sur = new JPanel(new GridLayout(this.fecha.getVentas().size() + 2 ,3));
        sur.add(new JLabel("PRODUCTO"));
        sur.add(new JLabel("CANTIDAD"));
        sur.add(new JLabel("VALOR TOTAL"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        for(int i = 0;i < this.fecha.getVentas().size(); i++){
            sur.add(new JLabel(this.fecha.getVentas().get(i).getProducto().getNombre()));
            String cantidad = Integer.toString(this.fecha.getVentas().get(i).getCantidad());
            sur.add(new JLabel( cantidad));
            String  valor = Double.toString(this.fecha.getVentas().get(i).getValor_total());
            sur.add(new JLabel("$" +valor));
        }
        
        this.setLayout(new BorderLayout());
        this.add(norte, BorderLayout.NORTH);
        this.add(centro, BorderLayout.CENTER);
    }
    
}
