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
import javax.swing.JToggleButton;
/**
 *
 * @author El PcGamer
 */
public class PanelPiano extends JPanel implements ActionListener {
    private VentanaVisualizacion x;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;

    public PanelPiano(VentanaVisualizacion x) {
    
        this.jToggleButton1 =new JToggleButton("DO");
        
        this.jToggleButton2 =  new JToggleButton("RE");
        this.jToggleButton3 =  new JToggleButton("MI");
        this.jToggleButton4 =  new JToggleButton("FA");
        this.jToggleButton5 =  new JToggleButton("SOL");
        this.jToggleButton6 =  new JToggleButton("LA");
        this.jToggleButton7 =  new JToggleButton("SI");
        this.melodias = melodias;
        
        this.setLayout(new GridLayout(1,7));
        this.add(this.jToggleButton1);
        this.add(this.jToggleButton2);
        this.add(this.jToggleButton3);
        this.add(this.jToggleButton4);
        this.add(this.jToggleButton5);
        this.add(this.jToggleButton6);
        this.add(this.jToggleButton7);
        
    }
     private Melodia melodias;
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        InputStream audio;
        
        try{
        audio= new FileInputStream(new File("DO.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
        Nota n= new Nota("DO",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                                              

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
          InputStream audio;
        
        try{
        audio= new FileInputStream(new File("RE.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
         Nota n= new Nota("RE",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                                              

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
         InputStream audio;
        
        try{
        audio= new FileInputStream(new File("MI.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
         Nota n= new Nota("MI",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                                              

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                               
          InputStream audio;
        
        try{
        audio= new FileInputStream(new File("FA.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
        Nota n= new Nota("FA",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                                              

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                               
       InputStream audio;
        
        try{
        audio= new FileInputStream(new File("SOL.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
     Nota n= new Nota("SOL",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                                              

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                               
          InputStream audio;
        
        try{
        audio= new FileInputStream(new File("LA.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
      Nota n= new Nota("LA",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                                              

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                               
         InputStream audio;
        
        try{
        audio= new FileInputStream(new File("SI.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
        Nota n= new Nota("DO",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        JOptionPane.showMessageDialog(null,e);
        }
    }                            

    @Override
    public void actionPerformed(ActionEvent ae) {
    jToggleButton1ActionPerformed(ae);
jToggleButton2ActionPerformed(ae);
jToggleButton3ActionPerformed(ae);
jToggleButton4ActionPerformed(ae);
jToggleButton5ActionPerformed(ae);
    jToggleButton6ActionPerformed(ae);
     jToggleButton7ActionPerformed(ae);
    }
}
