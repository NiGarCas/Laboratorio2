/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelAdivinar extends JPanel  implements ActionListener{
    
    private VentanaVisualizacion ventana;
    
    public PanelAdivinar(VentanaVisualizacion ventana) {
        this.ventana = ventana;
//        this.setLayout(new GridLayout(6,1));

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
