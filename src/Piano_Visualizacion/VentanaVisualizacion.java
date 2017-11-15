/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import AngryBirds_visualizacion.PanelAngryBirds;
import javax.swing.JFrame;
import Piano_Datos.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.*;
import sun.audio.*;
import java.util.*;        
import java.io.*;        
/**
 *
 * @author El PcGamer
 */
public class VentanaVisualizacion extends JFrame{
    private int modo;
      public VentanaVisualizacion(int modo) {
        this.modo = modo;
        add(new PanelPiano(this));
        setSize(750, 500);
        setTitle("Recordando la Secuencia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }     

    public int getModo() {
        return modo;
    }

   
}
