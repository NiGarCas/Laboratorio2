/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import Piano_Datos.JuegoAdivinar;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelAdivinar extends JPanel  implements ActionListener{
    
    private JuegoAdivinar juego;
    private VentanaVisualizacion ventana;
    private JPanel arriba;
    private JPanel centro;
    private JPanel abajo;
    
    public PanelAdivinar(VentanaVisualizacion ventana, JuegoAdivinar juego) {
        this.juego = juego;
        this.ventana = ventana;
        this.agregarComponentes();
//        this.setLayout(new GridLayout(6,1));

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void agregarComponentes() {
        
        this.arriba = new JPanel(new GridLayout(3,3));
        this.centro = new JPanel(new GridLayout(2,1));
        this.abajo = new JPanel(new GridLayout(2,3));
        
        this.arriba.add(new JLabel("CANCIÓN # " ));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel ("Intentos restantes: "));
        this.arriba.add(new JLabel ("Adivinada/Aun sin adivinar "));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel (" "));
        
        JButton reproducir = new JButton("REPRODUCIR");
        reproducir.addActionListener(this);
        JButton adivinar =  new JButton("ADIVINAR");
        adivinar.addActionListener(this);
        this.centro.add(reproducir);
        this.centro.add(adivinar);

        JButton anterior =  new JButton("Anterior Canción");
        anterior.addActionListener(this);
        JButton siguiente =  new JButton("Siguiente Canción");
        siguiente.addActionListener(this);
        this.abajo.add(new JLabel (" "));
        this.abajo.add(new JLabel (" "));
        this.abajo.add(new JLabel (" "));
        this.abajo.add(anterior);
        this.abajo.add(siguiente);
        
        this.setLayout(new BorderLayout());
        this.add(arriba, BorderLayout.NORTH);
        this.add(centro, BorderLayout.CENTER);
        this.add(abajo, BorderLayout.SOUTH);
    }
    
}
