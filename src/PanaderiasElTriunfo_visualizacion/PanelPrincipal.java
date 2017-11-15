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
    
    public PanelPrincipal(VentanaVisualizacion ventana) {
        super(ventana);
        this.agregarComponentes();
    }

 

    @Override
    public void actionPerformed(ActionEvent evento) {
        JButton source = (JButton)evento.getSource();
        String boton = source.getText();
        switch (boton) {
            case "PASAR AL DÍA SIGUIENTE":
                this.ventana.getSucursal().cambiarDeDia();
                this.removeAll();
                this.agregarComponentes();
                this.ventana.actualizarPanel(this.ventana.getPaneles()[0]);
                break;
            case "Registrar Compra a proovedor":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[3]);
                break;
            case "Registrar Venta al por mayor":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[4]);
                break;
            case "Registrar Venta al por menor":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[5]);
                break;
            case "Agregar producto al sistema":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[1]);
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
                this.ventana.actualizarPanel(this.ventana.getPaneles()[2]);
                break;
            case "Inventario":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[6]);
                break;
            case "Caja":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[7]);
                break;
            case "Ventas":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[8]);
                break;
            case "Ganancias":
                this.ventana.actualizarPanel(this.ventana.getPaneles()[9]);
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
        JButton ventas = new JButton ("Ventas");
        ventas.addActionListener(this);
        centro.add(ventas);
        JButton pyg = new JButton ("Ganancias");
        pyg.addActionListener(this);
        centro.add(pyg);
        
        this.derecha = new JPanel(new GridLayout(7,1));
        derecha.add(new JLabel("                      PRODUCTOS"));
        JButton agregar = new JButton("Agregar producto al sistema");
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
        
        this.setLayout(new BorderLayout());
        this.add(this.norte, BorderLayout.NORTH);
        this.add(this.izquierda, BorderLayout.WEST);
        this.add(this.centro, BorderLayout.CENTER);
        this.add(this.derecha, BorderLayout.EAST);
        this.add(this.sur, BorderLayout.SOUTH);
//        this.ventana.pack();
    }
}
