/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import Piano_Datos.JuegoAdivinar;
import Piano_Datos.JuegoPiano;
import Piano_Datos.Jugador;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelModalidad extends JPanel implements ActionListener{
    
    private VentanaVisualizacion ventana;
    JComboBox menu;
    
    public PanelModalidad(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.setLayout(new GridLayout(6,1));
        this.add(new JLabel("BIENVENIDO"));
        this.add(new JLabel("ESCOJA LA MODALIDAD DE JUEGO"));
        this.add(new JLabel(" "));
        this.menu = new JComboBox();
        menu.addItem("Recuerda la secuencia - Multijugador");
        menu.addItem("Adivina la cancion - 1 Jugador");
        this.add(menu);
        this.add(new JLabel(" "));
        JButton aceptar = new JButton("ACEPTAR");
        aceptar.addActionListener(this);
        this.add(aceptar);
    }

    public VentanaVisualizacion getVentana() {
        return ventana;
    }

    public void setVentana(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String opcion = this.menu.getSelectedItem().toString();
        JButton source = (JButton)ae.getSource();
        String boton = source.getText();
        switch (opcion){
            case "Recuerda la secuencia - Multijugador":
                
                ArrayList<Jugador> jugadores = this.ventana.getJuego().registrarJugadores();
                
                JuegoPiano juegopiano = null; 
        try {
            juegopiano = new JuegoPiano(this.ventana.getJuego(),jugadores);
            this.ventana.getJuego().setJsecuencia(juegopiano);
        } catch (IOException ex) {
            
        }
                PanelPiano panelpiano = new PanelPiano(this.ventana, this.ventana.getJuego().getJsecuencia());
                this.ventana.agregarPanelPiano(panelpiano);
                this.ventana.actualizarPanel(this.ventana.getPaneles()[1]);
                break;
            default:
                JOptionPane.showMessageDialog(this.ventana, "Tiene 20 intentos para adivinar el nombre de 5 canciones. Puede reproducir cada canción las veces que desee");
                JuegoAdivinar juegoadivinar = new JuegoAdivinar(this.ventana.getJuego(),this.ventana.getJuego().getIncluidas());
                PanelAdivinar paneladivinar = new PanelAdivinar(this.ventana, this.ventana.getJuego().getJadivinar());
                this.ventana.agregarPanelAdivinar(paneladivinar);
                this.ventana.actualizarPanel(this.ventana.getPaneles()[2]);
        }
    }
    
    
}
