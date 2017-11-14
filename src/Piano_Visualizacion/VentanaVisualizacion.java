/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import AngryBirds_visualizacion.PanelAngryBirds;
import javax.swing.JFrame;
import sun.audio.*;
import java.util.*;        
import java.io.*;        
/**
 *
 * @author El PcGamer
 */
public class VentanaVisualizacion extends JFrame {
      public VentanaVisualizacion() {
        add(new PanelPiano(this));
        setSize(938, 509);
        setTitle("Piano ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }     
}
