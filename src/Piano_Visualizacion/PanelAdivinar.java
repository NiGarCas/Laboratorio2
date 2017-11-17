/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;

import Piano_Datos.JuegoAdivinar;
import Piano_Datos.Melodia;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class PanelAdivinar extends JPanel  implements ActionListener{
    
    private JuegoAdivinar juego;
    private VentanaVisualizacion ventana;
    private Melodia cancion_actual;
    private JPanel arriba;
    private JPanel centro;
    private JPanel abajo;
    
    public PanelAdivinar(VentanaVisualizacion ventana, JuegoAdivinar juego) {
        this.juego = juego;
        this.ventana = ventana;
        this.cancion_actual = this.juego.getJuego().getIncluidas().get(0);
        this.agregarComponentes();
    }

    public JuegoAdivinar getJuego() {
        return juego;
    }

    public void setJuego(JuegoAdivinar juego) {
        this.juego = juego;
    }

    public VentanaVisualizacion getVentana() {
        return ventana;
    }

    public void setVentana(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }



    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton source = (JButton)ae.getSource();
        String boton = source.getText();
        switch (boton) {
            case "REPRODUCIR":
                this.cancion_actual.reproducir();
                break;
            case "ADIVINAR":
                break;
            case "Anterior Canción":
                this.juego.anteriorCancion();
                this.removeAll();
                this.agregarComponentes();
                this.ventana.actualizarPanel(this.ventana.getPaneles()[2]);
                break;
            case "Siguiente Canción":
                this.juego.siguienteCancion();
                this.removeAll();
                this.agregarComponentes();
                this.ventana.actualizarPanel(this.ventana.getPaneles()[2]);
                break;
            default:
                break;
        }
    }

    private void agregarComponentes() {
        
        this.arriba = new JPanel(new GridLayout(3,3));
        this.centro = new JPanel(new GridLayout(2,1));
        this.abajo = new JPanel(new GridLayout(2,3));
        
        this.arriba.add(new JLabel("CANCIÓN # " +  cancion_actual.getNumero()));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel ("Intentos restantes: " + this.juego.getIntentos()));
        String adivinada;
        if(this.cancion_actual.isAdivinada()){
            adivinada = "ADIVINADA, SIGA CON LAS CANCIONES QUE LE RESTAN";
        }else{
            adivinada = "AUN NO HA SIDO ADIVINADA";
        }
        this.arriba.add(new JLabel (adivinada));
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
        this.abajo.add(new JLabel (" "));
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
