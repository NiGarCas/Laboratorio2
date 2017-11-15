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
    private Juego juego;
    private VentanaVisualizacion ventana;
    private boolean jugando;
    private JPanel pjuego;
    private JPanel piano;
    private JButton do_;
    private JButton re_;
    private JButton mi_;
    private JButton fa_;
    private JButton sol_;
    private JButton la_;
    private JButton si_;
    
    public PanelPiano(VentanaVisualizacion ventana) {
        this.ventana=ventana;
        this.piano = new JPanel();
        this.pjuego = new JPanel();
        this.do_ = new JButton("DO");
        this.do_.addActionListener(this);
        this.re_ =  new JButton("RE");
        this.re_.addActionListener(this);
        this.mi_ =  new JButton("MI");
        this.mi_.addActionListener(this);
        this.fa_ =  new JButton("FA");
        this.fa_.addActionListener(this);
        this.sol_ =  new JButton("SOL");
        this.sol_.addActionListener(this);
        this.la_ =  new JButton("LA");
        this.la_.addActionListener(this);
        this.si_ =  new JButton("SI");
        this.si_.addActionListener(this);
     
        this.setLayout(new GridLayout(1,7)); 
        
        this.piano.add(this.do_);
        this.piano.add(this.re_);
        this.piano.add(this.mi_);
        this.piano.add(this.fa_);
        this.piano.add(this.sol_);
        this.piano.add(this.la_);
        this.piano.add(this.si_);
        this.add(piano);
      
    }
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    private void doActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            InputStream audio= new FileInputStream(new File("do2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("DO",audio);
        }catch(Exception e){
            }
    }                                              

    private void reActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            InputStream audio= new FileInputStream(new File("re2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("RE",audio);
        }catch(Exception e){
            }
    }                                              

    private void miActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            InputStream audio= new FileInputStream(new File("mi2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("MI",audio);
        }catch(Exception e){
            }
    }                                              

    private void faActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            InputStream audio= new FileInputStream(new File("fa2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("FA",audio);
        }catch(Exception e){
            }
    }                                              

    private void solActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            InputStream audio= new FileInputStream(new File("sol2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("SOL",audio);
        }catch(Exception e){
            }
    }                                              

    private void laActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            InputStream audio= new FileInputStream(new File("la2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("LA",audio);
        }catch(Exception e){
            }    
    }                                              

    private void siActionPerformed(java.awt.event.ActionEvent evt) {                                               
         try{
            InputStream audio= new FileInputStream(new File("si2.wav"));
            AudioStream music= new AudioStream(audio);
            AudioPlayer.player.start(music);
            Nota n= new Nota("SI",audio);
        }catch(Exception e){
            }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== this.do_){
            doActionPerformed(ae);
        }else if(ae.getSource()== this.re_){
            reActionPerformed(ae);
        }else if(ae.getSource()== this.mi_){
            miActionPerformed(ae);
        }else if(ae.getSource()== this.fa_){
            faActionPerformed(ae);
        }else if(ae.getSource()== this.sol_){
            solActionPerformed(ae);
        }else if(ae.getSource()== this.la_){
            laActionPerformed(ae);
        } else if(ae.getSource()== this.si_){
            siActionPerformed(ae);
        }
    }
}      
    

     

