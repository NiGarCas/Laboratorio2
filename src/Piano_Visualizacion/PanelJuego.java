/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Visualizacion;
import Piano_Datos.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author El PcGamer
 */
public class PanelJuego extends JPanel implements ActionListener{
    private VentanaVisualizacion ventana;
    private PanelPiano piano;

    
    private JButton jToggleButton1;
    private JButton jToggleButton2;
    private Juego juego;
    private JLabel nombre1;
    private JLabel nombre2;
    private JLabel puntuacion;
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    
    public PanelJuego(VentanaVisualizacion ventana) {
        this.setLayout(new GridLayout(1,8));
        this.piano=new PanelPiano(ventana);
        this.jToggleButton1 =new JButton("Empezar juego");
        this.jToggleButton1.addActionListener(this);
        
        
        this.add(this.jToggleButton1);
        this.nombre1=new JLabel();
        this.nombre2=new JLabel();
        
        this.add(this.nombre1);
        this.add(this.nombre2);
        
        this.ventana = ventana;
    }
    
    
    
    
private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {   
    try{
          String name1= JOptionPane.showInputDialog(null,"Nombre Jugador 1");
          String name2= JOptionPane.showInputDialog(null,"Nombre jugador 2");
         this.nombre1.setText("Jugador 1"+ " "+ name1);
         this.nombre2.setText("Jugador 2"+ " "+name2);
       
         this.jToggleButton2=new JButton("Empezar jugador 1");
         this.jToggleButton2.addActionListener(this);
           this.add(this.jToggleButton2);
       
          this.juego= new Juego(name1,name2); 
          
          
          
          
    }catch(Exception e)    {
    
    }  
    }
private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {   
    try{
         this.puntuacion=new JLabel();
           this.puntuacion.setText("Puntuacion jugador 1");
          
          
    }catch(Exception e)    {
    
    }  
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== this.jToggleButton1){
       jToggleButton1ActionPerformed(ae);
         }else if(ae.getSource()== this.jToggleButton2){
          
         }
    }
    public PanelPiano getPiano() {
        return piano;
    }

    public void setPiano(PanelPiano piano) {
        this.piano = piano;
    }
    public void X(Nota nota){
    
    }
    
}
