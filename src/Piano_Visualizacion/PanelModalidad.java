/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelModalidad extends JPanel implements ActionListener{
    
    private int modo;
    private VentanaModalidad ventana;
    
    public PanelModalidad(VentanaModalidad ventana) {
        this.ventana = ventana;
        this.setLayout(new GridLayout(2,2));
        this.add(new JLabel("BIENVENIDO. Escoja la modalidad del juego"));
        this.add(new JLabel(" "));
        JButton modo1 = new JButton("1 vs 1");
        this.add(modo1);
        JButton modo2 = new JButton("Adivina la cancion");
        this.add(modo2);
        this.modo = 0;
    }

    public int getModo() {
        return modo;
    }

    public VentanaModalidad getVentana() {
        return ventana;
    }

    public void setVentana(VentanaModalidad ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton source = (JButton)ae.getSource();
        String boton = source.getText();
        switch (boton){
            case "BIENVENIDO. Escoja la modalidad del juego":
                this.modo = 1;
                break;
            default:
                this.modo = 2;
        }
        this.ventana.dispose();
    }
    
    
}
