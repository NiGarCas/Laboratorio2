/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_visualizacion;

import AngryBirds_datos.Cerdo;
import AngryBirds_datos.Pajaro;
import AngryBirds_datos.Partida;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nicol
 */
public class PanelAngryBirds extends JPanel implements ActionListener, MouseListener{


    private Timer timer ;
    private Partida partida;
    private boolean lanzando = false;
    private double tiempo;
    private VentanaVisualizacion ventana;
    
    public PanelAngryBirds(VentanaVisualizacion ventana){
        //Lanza un evento de tipo ActionListener cada 25 Milisegundo
        //Se hace referencia a this porque la misma clase procesa el evento
        this.timer = new Timer(25, this);
        //Registrar evento del Teclado
        setFocusable(true); //Debe estar en modo Focus para que puede detectar el evento
        addKeyListener(new EventosTeclado()); //Inner class que procesa los eventos del teclado
        addMouseListener (this);
        this.timer.start(); //Inicio con el escenario
        this.tiempo = 0;
        this.lanzando = false;
        this.partida = new Partida(this);
        this.ventana = ventana;
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
                   if(!(partida.getResortera().getEstado().getImagen1().equals("1.png"))){
                       partida.getResortera().cambiarEstado("izquierda");
                   }
               }

               if (key == KeyEvent.VK_DOWN){
                   
               }

               if (key == KeyEvent.VK_RIGHT){
                   
                   if(!(partida.getResortera().getEstado().getImagen1().equals("10.png"))){
                       partida.getResortera().cambiarEstado("derecha");
                   }
               }

               if (key == KeyEvent.VK_UP){
                   lanzando = true;
               }
            }
        }
    
    //Metodo donde se pintan los objetos 
     @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.partida.getResortera().getPajaro().setX_inicial(this.partida.getResortera().getEstado().getXpajaro());
        this.partida.getResortera().getPajaro().setY_inicial(this.partida.getResortera().getEstado().getYpajaro());
        Image fondo = loadImage("FondoAngryBirds.png");
        Image imgCerdo = loadImage("cerdo.png");
        Image imgReyCerdo = loadImage("reycerdo.png");
        Image imgBloque = loadImage("bloque.png");
        Image imgPajaro = loadImage(this.partida.getResortera().getPajaro().getImagen());
        Image imgResortera = loadImage(this.partida.getResortera().getEstado().getImagen());
        Image vacio = loadImage("vacio.png");
        g.drawImage(fondo, 0, 0, this);
        g.drawString("PUNTUACION: " + this.partida.getPuntuacion(), 800, 20);
        g.drawString("VIDAS: " + this.partida.getVidas(), 800, 40);
        g.drawString("Presione las teclas <derecha> e <izquierda> para ajustar resortera" , 20, 20);
        g.drawString("Presione la tecla <arriba> para realizar lanzamiento", 20,40);
        g.drawImage(imgResortera, 50, 310,156,421,0,0,638,666,this);
        for(int i = 0;i<15;i++){
            if(this.partida.getBloques()[i].getImagen().equals("bloque.png")){
                g.drawImage(imgBloque,this.partida.getBloques()[i].getX(),this.partida.getBloques()[i].getY(),this);
            }else{
                g.drawImage(vacio,this.partida.getBloques()[i].getX(),this.partida.getBloques()[i].getY(),this);
            }
            
        }
        for(int i=0;i< this.partida.getNumCerdos();i++){
            switch (this.partida.getCerdos()[i].getImagen()) {
                case "cerdo.png":
                    g.drawImage(imgCerdo,this.partida.getCerdos()[i].getX(),this.partida.getCerdos()[i].getY(),this);
                    break;
                case "reycerdo.png":
                    g.drawImage(imgReyCerdo,this.partida.getCerdos()[i].getX(),this.partida.getCerdos()[i].getY(),this);
                    break;
                default:
                    g.drawImage(vacio,this.partida.getCerdos()[i].getX(),this.partida.getCerdos()[i].getY(),this);
                    break;
            }
        }
        if(this.lanzando == false){
            this.partida.getResortera().getPajaro().setX(this.partida.getResortera().getPajaro().getX_inicial());
            this.partida.getResortera().getPajaro().setY(this.partida.getResortera().getPajaro().getY_inicial());
        }
        g.drawImage(imgPajaro,this.partida.getResortera().getPajaro().getX(),this.partida.getResortera().getPajaro().getY(),this);
        this.partida.getResortera().getPajaro().setArea();
        if(this.partida.getVidas() == 0){
            this.ventana.dispose();
            JOptionPane.showMessageDialog(null,"JUEGO TERMINADO - PUNTUACIÓN FINAL: " + this.partida.getPuntuacion() + "/32");
        }
        if(this.partida.getPuntuacion() == 32){
            this.ventana.dispose();
            JOptionPane.showMessageDialog(null,"FELICIDADES, HA GANADO EL JUEGO");
        }
    }

    //Metodo que se ejecuta cada vez que se lanza un ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (lanzando == true){
            System.out.println(tiempo);
            tiempo = partida.lanzar(tiempo);
            System.out.println(tiempo);
        }
        repaint();
    }
    
    public Image loadImage (String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    public boolean isLanzando() {
        return lanzando;
    }

    public void setLanzando(boolean lanzando) {
        this.lanzando = lanzando;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
}
