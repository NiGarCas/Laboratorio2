/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_logica;

import PanaderiasElTriunfo_datos.Mes;
import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_visualizacion.PanelAgregarProducto;
import PanaderiasElTriunfo_visualizacion.PanelCompra;
import PanaderiasElTriunfo_visualizacion.PanelPorMayor;
import PanaderiasElTriunfo_visualizacion.PanelPrincipal;
import PanaderiasElTriunfo_visualizacion.PanelPromocion;
import PanaderiasElTriunfo_visualizacion.VentanaVisualizacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class LogicaPanaderias {
    
    
    public static void main(String[] args){
        Mes enero = new Mes ("ENERO", 1, 31);
        Mes febrero = new Mes ("FEBRERO", 2, 28);
        Mes marzo = new Mes ("MARZO", 3, 31);
        Mes abril = new Mes ("ABRIL", 4, 30);
        Mes mayo = new Mes ("MAYO", 5, 31);
        Mes junio = new Mes ("JUNIO", 6, 30);
        Mes julio = new Mes ("JULIO", 7, 31);
        Mes agosto = new Mes ("AGOSTO", 8, 31);
        Mes septiembre = new Mes ("SEPTIEMBRE", 9, 30);
        Mes octubre = new Mes ("OCTUBRE", 10, 31);
        Mes noviembre = new Mes ("NOVIEMBRE", 11, 30);
        Mes diciembre = new Mes ("DICIEMBRE", 12, 31);
        Mes[] meses = {enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre};
        SucursalPanaderia eltriunfo = new SucursalPanaderia(1,enero);
        VentanaVisualizacion ventana = new VentanaVisualizacion(eltriunfo);
        Controlador controlador = new Controlador(ventana, eltriunfo);
        PanelAgregarProducto agregar_producto = new PanelAgregarProducto(ventana);
        PanelPromocion promocion = new PanelPromocion(ventana);
        PanelPrincipal principal = new PanelPrincipal(ventana);
        ventana.add(principal);
        controlador.inicialAplicacion();
    }

    
}
