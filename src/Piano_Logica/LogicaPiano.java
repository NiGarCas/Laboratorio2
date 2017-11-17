/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Logica;
import Piano_Datos.Juego;
import Piano_Visualizacion.*;       
import java.util.*;

/**
 *
 * @author El PcGamer
 */
public class LogicaPiano {
     public static void main(String[] args){
        Juego j = new Juego(new ArrayList());
        VentanaVisualizacion ventana = new VentanaVisualizacion(j);
        j.setVentana(ventana);
        ventana.add(ventana.getPanel_actual());
     }
}
