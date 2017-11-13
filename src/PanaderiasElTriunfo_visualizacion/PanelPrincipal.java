/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class PanelPrincipal extends Panel{
    JPanel norte;
    JPanel izquierda;
    JPanel centro;
    JPanel derecha;
    JPanel sur;
    
    
    public PanelPrincipal(VentanaVisualizacion ventana) {
        super(ventana);
        this.norte = new JPanel (new GridLayout(3,3));
        norte.add(new JLabel("PANADERÍA EL TRIUNFO"));
        norte.add(new JLabel(" "));
        JButton pasarDia = new JButton("PASAR AL DÍA SIGUIENTE");
        pasarDia.addActionListener(this);
        norte.add(pasarDia);
        norte.add(new JLabel(this.ventana.getSucursal().getDia() + " DE " + this.ventana.getSucursal().getMes().getNombre()));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        norte.add(new JLabel(" "));
        
        this.izquierda = new JPanel(new GridLayout(7,1));
        izquierda.add(new JLabel("                         REGISTRO"));
        JButton regCompra = new JButton("Registrar Compra a proovedor");
        regCompra.addActionListener(this);
        izquierda.add(regCompra);
        JButton regPorMayor = new JButton("Registrar Venta al por mayor");
        regPorMayor.addActionListener(this);
        izquierda.add(regPorMayor);
        JButton regPorMenor = new JButton("Registrar Venta al por menor");
        regPorMenor.addActionListener(this);
        izquierda.add(regPorMenor);

        this.centro = new JPanel(new GridLayout(7,1));
        centro.add(new JLabel("                                  REPORTES"));
        JButton inventario = new JButton ("Inventario");
        inventario.addActionListener(this);
        centro.add(inventario);
        JButton caja = new JButton ("Caja");
        caja.addActionListener(this);
        centro.add(caja);
        JButton movInventario = new JButton ("Movimiento del inventario");
        movInventario.addActionListener(this);
        centro.add(movInventario);
        JButton ventas = new JButton ("Ventas");
        ventas.addActionListener(this);
        centro.add(ventas);
        JButton pyg = new JButton ("Ganancias");
        pyg.addActionListener(this);
        centro.add(pyg);
        
        this.derecha = new JPanel(new GridLayout(7,1));
        derecha.add(new JLabel("                      PRODUCTOS"));
        JButton agregar = new JButton("Agregar producto");
        agregar.addActionListener(this);
        derecha.add(agregar);
        JButton eliminar = new JButton("Eliminar producto");
        eliminar.addActionListener(this);
        derecha.add(eliminar);
        JButton cambiarPrecio = new JButton("Poner producto en promoción");
        cambiarPrecio.addActionListener(this);
        derecha.add(cambiarPrecio);
        
        this.sur = new JPanel (new GridLayout(5,3));
        sur.add(new JLabel("SOPORTE-AYUDA:"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel("Severo Velandia - Panadería El Triunfo"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel("Calle 18S #17B-77 - Teléfono: 568 88 97"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
        sur.add(new JLabel("Horario de atención: 6:00AM - 9:00PM"));
        sur.add(new JLabel(" "));
        sur.add(new JLabel(" "));
    }

    public JPanel getNorte() {
        return norte;
    }

    public void setNorte(JPanel norte) {
        this.norte = norte;
    }

    public JPanel getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(JPanel izquierda) {
        this.izquierda = izquierda;
    }

    public JPanel getCentro() {
        return centro;
    }

    public void setCentro(JPanel centro) {
        this.centro = centro;
    }

    public JPanel getDerecha() {
        return derecha;
    }

    public void setDerecha(JPanel derecha) {
        this.derecha = derecha;
    }

    public JPanel getSur() {
        return sur;
    }

    public void setSur(JPanel sur) {
        this.sur = sur;
    }

    @Override
    public void serAgregado() {
        this.ventana.add(this.norte, BorderLayout.NORTH);
        this.ventana.add(this.izquierda, BorderLayout.WEST);
        this.ventana.add(this.centro, BorderLayout.CENTER);
        this.ventana.add(this.derecha, BorderLayout.EAST);
        this.ventana.add(this.sur, BorderLayout.SOUTH);
        this.ventana.setTitle("Panaderia El Triunfo - Menú prinicpal");
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        System.out.println(boton);
        if(boton.equals("PASAR AL DÍA SIGUIENTE")){
            System.out.println(this.ventana.getSucursal().getMes().getNumero());
            System.out.println(this.ventana.getSucursal().getDia());
            this.ventana.getSucursal().cambiarDeDia(this.ventana.getSucursal().getMes().getNumero(), this.ventana.getSucursal().getDia());
            Panel panel = this.ventana.getPanel_actual();
            this.ventana.removeAll();
            this.ventana.dispose();
            this.ventana.add(this);
            this.ventana.setVisible(true);
//            this.ventana.agregarPanel(this);
        }else if(boton.equals("Registrar Compra a proovedor")){
            Panel panel = this.ventana.getPanel_actual();
            this.ventana.remove(this.ventana.getPanel_actual());
            this.ventana.setPanel_actual(this.ventana.getCompra());
            this.ventana.agregarPanel(this.ventana.getCompra());
        }else if(boton.equals("ooo")){
                
        }

    }
}
