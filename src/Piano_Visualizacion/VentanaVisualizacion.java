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
      public VentanaVisualizacion() {
       this.setLayout(new GridLayout(2,1));
     
       PanelJuego n= new PanelJuego(this);
       PanelPiano m =n.getPiano();
       
        add(n);
        add(m);
        
       
        setSize(938, 509);
        setTitle("Piano Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }     

   
}
