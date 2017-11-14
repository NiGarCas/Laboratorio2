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
        this.agregarComponentes();
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
        this.ventana.setLayout(new BorderLayout());
        this.ventana.add(this.norte, BorderLayout.NORTH);
        this.ventana.add(this.izquierda, BorderLayout.WEST);
        this.ventana.add(this.centro, BorderLayout.CENTER);
        this.ventana.add(this.derecha, BorderLayout.EAST);
        this.ventana.add(this.sur, BorderLayout.SOUTH);
        this.ventana.setTitle("Panaderia El Triunfo - Menú prinicpal");
        this.ventana.pack();
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        switch (boton) {
            case "PASAR AL DÍA SIGUIENTE":
                this.ventana.getSucursal().cambiarDeDia();
//                System.out.println(this.ventana.getSucursal().getFecha().getMes().getNumero());
//                System.out.println(this.ventana.getSucursal().getDia());
                this.removeAll();
                this.agregarComponentes();
                this.updateUI();
                break;
            case "Registrar Compra a proovedor":
                this.ventana.setPanel_actual(this.ventana.getCompra());
                this.ventana.getPanel_actual().updateUI();
                break;
            case "Registrar Venta al por mayor":
                break;
            case "Registrar Venta al por menor":
                break;
            case "Agregar producto":
                break;
            case "Eliminar producto":
                String nombre = JOptionPane.showInputDialog(this.ventana, "Nombre del producto a eliminar:");
                boolean a = this.ventana.getSucursal().eliminarProducto(nombre);
                if(a){
                    JOptionPane.showMessageDialog(this.ventana, "Producto eliminado exitosamente");
                }else{
                    JOptionPane.showMessageDialog(this.ventana, "Error: no se encontró producto con ese nombre");
                }
                break;
            case "Poner producto en promoción":
                break;
            case "Inventario":
                break;
            case "Caja":
                break;
            case "Movimiento del inventario":
                break;
            case "Ventas":
                break;
            case "Ganancias":
                break;
            default:
                break;
        }

    }

    @Override
    public void agregarComponentes() {
        this.removeAll();
        this.norte = new JPanel (new GridLayout(3,3));
        norte.add(new JLabel("PANADERÍA EL TRIUNFO"));
        norte.add(new JLabel(" "));
        JButton pasarDia = new JButton("PASAR AL DÍA SIGUIENTE");
        pasarDia.addActionListener(this);
        norte.add(pasarDia);
        norte.add(new JLabel(this.ventana.getSucursal().getFecha().getDia() + " DE " + this.ventana.getSucursal().getFecha().getMes().getNombre()));
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
}
