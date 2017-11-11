/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_logica;

import PanaderiasElTriunfo_datos.Mes;
import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_visualizacion.PanelPrincipal;
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
        Mes enero = new Mes ("enero", 1, 31);
        Mes febrero = new Mes ("febrero", 2, 28);
        Mes marzo = new Mes ("marzo", 3, 31);
        Mes abril = new Mes ("abril", 4, 30);
        Mes mayo = new Mes ("mayo", 5, 31);
        Mes junio = new Mes ("junio", 6, 30);
        Mes julio = new Mes ("julio", 7, 31);
        Mes agosto = new Mes ("agosto", 8, 31);
        Mes septiembre = new Mes ("septiembre", 9, 30);
        Mes octubre = new Mes ("octubre", 10, 31);
        Mes noviembre = new Mes ("noviembre", 11, 30);
        Mes diciembre = new Mes ("diciembre", 12, 31);
        Mes[] meses = {enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre};
        SucursalPanaderia eltriunfo = new SucursalPanaderia(1,enero);
        VentanaVisualizacion ventana = new VentanaVisualizacion(eltriunfo);
        Controlador controlador = new Controlador(ventana, eltriunfo);
        PanelPrincipal principal = new PanelPrincipal(ventana);

        ventana.add(principal);
        controlador.inicialAplicacion();
    }

    
}
