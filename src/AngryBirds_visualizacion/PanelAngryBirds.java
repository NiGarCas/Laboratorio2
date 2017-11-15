/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_visualizacion;

import AngryBirds_datos.Partida;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nicol
 */
public class PanelAngryBirds extends JPanel implements ActionListener{

    private Timer timer ;
    private Partida partida;
    private boolean lanzando;
    private double tiempo;
    private VentanaVisualizacion ventana;
    
    public PanelAngryBirds(VentanaVisualizacion ventana){
        this.timer = new Timer(25, this);
        setFocusable(true);
        addKeyListener(new EventosTeclado());
        this.timer.start();
        this.tiempo = 0;
        this.lanzando = false;
        this.partida = new Partida(this);
        this.ventana = ventana;
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
     private class EventosTeclado extends KeyAdapter {
         
        @Override
            public void keyPressed(KeyEvent e) {
               int key = e.getKeyCode();
               if (key == KeyEvent.VK_LEFT){
                   if(!(partida.getResortera().getEstado().getImagen1().equals("1.png"))){
                       partida.getResortera().cambiarEstado("izquierda");
                   }
               }

               if (key == KeyEvent.VK_RIGHT){
                   
                   if(!(partida.getResortera().getEstado().getImagen1().equals("10.png"))){
                       partida.getResortera().cambiarEstado("derecha");
                   }
               }

               if (key == KeyEvent.VK_SPACE){
                   lanzando = true;
               }
            }
        }
    
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
        g.drawString("Cada lanzamiento fallado le quita una vida. Si acierta un lanzamiento, vuelve a tener 5 vidas" , 20, 20);
        g.drawString("Presione las teclas <derecha> e <izquierda> para ajustar resortera" , 20, 60);
        g.drawString("Presione la barra espaciadora para realizar lanzamiento", 20,80);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (lanzando == true){
            tiempo = partida.lanzar(tiempo);
        }
        repaint();
    }
    
    public Image loadImage (String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}
