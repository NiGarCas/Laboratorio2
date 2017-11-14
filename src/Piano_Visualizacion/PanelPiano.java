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
    private JButton jToggleButton1;
    private JButton  jToggleButton2;
    private  JButton jToggleButton3;
    private JButton  jToggleButton4;
    private JButton  jToggleButton5;
    private JButton jToggleButton6;
    private JButton  jToggleButton7;
     private Melodia melodias;
    public PanelPiano(VentanaVisualizacion x) {
    
        this.jToggleButton1 =new JButton("DO");
        this.jToggleButton1.addActionListener(this);
        this.jToggleButton2 =  new JButton("RE");
         this.jToggleButton2.addActionListener(this);
        this.jToggleButton3 =  new JButton("MI");
         this.jToggleButton3.addActionListener(this);
        this.jToggleButton4 =  new JButton("FA");
         this.jToggleButton4.addActionListener(this);
        this.jToggleButton5 =  new JButton("SOL");
         this.jToggleButton5.addActionListener(this);
        this.jToggleButton6 =  new JButton("LA");
         this.jToggleButton6.addActionListener(this);
        this.jToggleButton7 =  new JButton("SI");
         this.jToggleButton7.addActionListener(this);
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        InputStream audio;
        
        try{
        audio= new FileInputStream(new File("DO.wav"));
        AudioStream music= new AudioStream(audio);
        AudioPlayer.player.start(music);
        Nota n= new Nota("DO",audio);
        this.melodias.getAudios().add(n);
        }catch(Exception e){
            
        //JOptionPane.showMessageDialog(null,e);
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
            
        
        }
    }                            

    @Override
    public void actionPerformed(ActionEvent ae) {
   if(ae.getSource()== this.jToggleButton1){
       jToggleButton1ActionPerformed(ae);
         } else if(ae.getSource()== this.jToggleButton2){
    
             jToggleButton2ActionPerformed(ae);
    
    
           }else if(ae.getSource()== this.jToggleButton3){
              jToggleButton3ActionPerformed(ae);
              }else if(ae.getSource()== this.jToggleButton4){
                    jToggleButton4ActionPerformed(ae);
        
                     }else if(ae.getSource()== this.jToggleButton5){
                         
                          jToggleButton5ActionPerformed(ae);
                         }else if(ae.getSource()== this.jToggleButton6){
                             jToggleButton6ActionPerformed(ae);
    
                         } else if(ae.getSource()== this.jToggleButton7){
                                jToggleButton7ActionPerformed(ae);
      }
}
}