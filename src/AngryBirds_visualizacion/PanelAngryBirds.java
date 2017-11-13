/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_visualizacion;

import AngryBirds_datos.Cerdo;
import AngryBirds_datos.Pajaro;
import AngryBirds_datos.Resortera;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nicol
 */
public class PanelAngryBirds extends JPanel implements ActionListener, MouseListener{


    private Timer timer1 ;
    private Resortera resortera;
    private ArrayList<Pajaro> pajaros;
    private ArrayList<Cerdo> cerdos;
    private ArrayList<Rectangle> bloques;
    int tiempo = 0;
    
    public PanelAngryBirds(){
        //Lanza un evento de tipo ActionListener cada 25 Milisegundo
        //Se hace referencia a this porque la misma clase (Tablero) procesa el evento
        this.timer1 = new Timer(100, this);
        //Registrar evento del Teclado
        setFocusable(true); //Debe estar en modo Focus para que puede detectar el evento
        addKeyListener(new EventosTeclado()); //Inner class que procesa los eventos del teclado
        addMouseListener (this);
        this.timer1.start(); //Inicio con el escenario
        this.resortera = new Resortera ();
        this.pajaros = new ArrayList();
        this.cerdos = new ArrayList();
        this.bloques = new ArrayList();
        this.bloques.add(new Rectangle(590,390,300,30));
        this.bloques.add(new Rectangle(470,390,60,30));
        this.bloques.add(new Rectangle(830,270,60,120));
        this.bloques.add(new Rectangle(650,270,180,30));
        this.bloques.add(new Rectangle(200,420,420,30));
        Pajaro p = new Pajaro();
        p.setX(50);
        p.setY(300);
        this.resortera.setPajaro(p);    
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
        
    //Inner class Que captura los eventos del teclado
     private class EventosTeclado extends KeyAdapter {
        //Cuando se suelta una tecla
         @Override
        public void keyReleased(KeyEvent e) {
//           int key = e.getKeyCode();
//           if (key == KeyEvent.VK_SPACE) {
//            System.out.println("VK_SPACE"); //Se  va usar posteriormente 
//           }
        }
        //Cuando se presiona una tecla
        @Override
            public void keyPressed(KeyEvent e) {
               int key = e.getKeyCode();

               if (key == KeyEvent.VK_LEFT){
                   if(!(resortera.getEstado().getImagen1().equals("1.png"))){
                       resortera.cambiarEstado("izquierda");
                   }
               }

               if (key == KeyEvent.VK_DOWN){
                   
               }

               if (key == KeyEvent.VK_RIGHT){
                   
                   if(!(resortera.getEstado().getImagen1().equals("10.png"))){
                       resortera.cambiarEstado("derecha");
                   }
               }

               if (key == KeyEvent.VK_UP){
                   
               }
            }
        }
    
    //Metodo donde se pintan los objetos 
     @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       this.resortera.getPajaro().setX_inicial(this.resortera.getEstado().getXpajaro());
       this.resortera.getPajaro().setY_inicial(this.resortera.getEstado().getYpajaro());
       Image fondo = loadImage("FondoAngryBirds.png");
       Image imgPajaro = loadImage("pajaro.png");
       Image imgCerdo = loadImage("cerdo.png");
       Image imgCerdoRey = loadImage("reycerdo.png");
       Image imgResortera = loadImage(resortera.getEstado().getImagen1());
       Image bloque = loadImage("bloque.png");
       g.drawImage(fondo, 0, 0, this);
       g.drawString("PUNTUACION: ", 20, 20);
       g.drawString("VIDAS: ", 830, 20);
       g.drawImage(imgResortera, 50, 310,156,421,0,0,638,666,this);
       for (int i = 0; i<7;i++){
           if(i!=1){
               g.drawImage(bloque, 470+(i*60), 390, this);
           }
       }
       for (int i = 0; i<4;i++){
           g.drawImage(bloque, 830, 360-(i*30), this);
       }
       for (int i = 0; i<3;i++){
           g.drawImage(bloque, 650+(i*60), 270, this);
       }
       g.drawImage(imgPajaro, this.resortera.getPajaro().getX(),this.resortera.getPajaro().getY(), this);
       g.drawImage(imgCerdo, 660, 230, this);
       g.drawImage(imgCerdo, 660, 350, this);
       g.drawImage(imgCerdo, 550, 380, this);
       g.drawImage(imgCerdo, 425, 380, this);
       g.drawImage(imgCerdoRey, 835, 220, this);
       this.resortera.getPajaro().setArea();
        for (Rectangle rec : this.bloques){
            if(this.resortera.getPajaro().getArea().intersects(rec)){
            this.timer1.stop();
            }
        }
    }

    //Metodo que se ejecuta cada vez que se lanza un ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        tiempo = this.resortera.lanzar(tiempo);
        repaint();
    }
    
    public Image loadImage (String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}
