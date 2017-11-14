/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_logica;

import PanaderiasElTriunfo_datos.Fecha;
import PanaderiasElTriunfo_datos.Mes;
import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_visualizacion.VentanaVisualizacion;

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
        Fecha[] fechas = new Fecha[365];
        for (int i = 1; i<32;i++){
            fechas[i-1] = new Fecha(i,enero);
            fechas[i+58] = new Fecha(i,marzo);
            fechas[i+119] = new Fecha(i,mayo);
            fechas[i+180] = new Fecha(i,julio);
            fechas[i+211] = new Fecha(i,agosto);
            fechas[i+272] = new Fecha(i,octubre);
            fechas[i+333] = new Fecha(i,diciembre);
        }
        for (int i = 1; i<31;i++){
            fechas[i+89] = new Fecha(i,abril);
            fechas[i+150] = new Fecha(i,junio);
            fechas[i+242] = new Fecha(i,septiembre);
            fechas[i+303] = new Fecha(i,noviembre);
        }
        for (int i = 1; i<29;i++){
            fechas[i+30] = new Fecha(i,febrero);
        }
        SucursalPanaderia eltriunfo = new SucursalPanaderia(fechas);
        VentanaVisualizacion ventana = new VentanaVisualizacion(eltriunfo);
        ventana.agregarPanel(ventana.getPrincipal());
    }  
}
