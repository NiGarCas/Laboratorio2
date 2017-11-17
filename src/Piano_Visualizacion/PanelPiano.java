/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;
import Piano_Datos.*;
import java.awt.*;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.audio.*;
import java.util.*;        
import java.io.*;        
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author El PcGamer
 */
public class PanelPiano extends JPanel implements ActionListener {
    
    private JuegoPiano juego;
    private VentanaVisualizacion ventana;
    private boolean jugando;
    private JPanel arriba;
    private JPanel piano;
//    private Nota do_;
//    private Nota re_;
//    private Nota mi_;
//    private Nota fa_;
//    private Nota sol_;
//    private Nota la_;
//    private Nota si_;
    
    public PanelPiano(VentanaVisualizacion ventana) {
        this.ventana = ventana;
        this.agregarComponentes();
        
      
    }
    public JuegoPiano getJuego() {
        return juego;
    }

    public void setJuego(JuegoPiano juego) {
        this.juego = juego;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton source = (JButton)ae.getSource();
        String boton = source.getText();
        switch (boton){
            case "DO":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[0].getAudio());
                source.setBackground(Color.white);
                break;
            case "RE":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[1].getAudio());
                source.setBackground(Color.white);
                break;
            case "MI":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[2].getAudio());
                source.setBackground(Color.white);
                break;
            case "FA":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[3].getAudio());
                source.setBackground(Color.white);
                break;
            case "SOL":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[4].getAudio());
                source.setBackground(Color.white);
                break;
            case "LA":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[5].getAudio());
                source.setBackground(Color.white);
                break;
            case "SI":
                source.setBackground(Color.yellow);
                AudioPlayer.player.start(this.juego.getNotas()[6].getAudio());
                source.setBackground(Color.white);
                break;
        }
        
    }

    public void agregarComponentes() {
        this.piano = new JPanel();
        this.arriba = new JPanel(new GridLayout(3,1));
        
        this.arriba.add(new JLabel("Turno actual: " + this.juego.getTurno().getNombre()));
        this.arriba.add(new JLabel (" "));
        this.arriba.add(new JLabel (" "));
        JButton do_ = new JButton("DO");
        do_.addActionListener(this);
        JButton re_ =  new JButton("RE");
        re_.addActionListener(this);
        JButton mi_ =  new JButton("MI");
        mi_.addActionListener(this);
        JButton fa_ =  new JButton("FA");
        fa_.addActionListener(this);
        JButton sol_ =  new JButton("SOL");
        sol_.addActionListener(this);
        JButton la_ =  new JButton("LA");
        la_.addActionListener(this);
        JButton si_ =  new JButton("SI");
        si_.addActionListener(this);
     
        this.piano.setLayout(new GridLayout(1,7)); 
        this.piano.add(do_);
        this.piano.add(re_);
        this.piano.add(mi_);
        this.piano.add(fa_);
        this.piano.add(sol_);
        this.piano.add(la_);
        this.piano.add(si_);
        
        this.setLayout(new BorderLayout());
        this.add(arriba, BorderLayout.NORTH);
        this.add(piano, BorderLayout.CENTER);
    }
}      
    

     

