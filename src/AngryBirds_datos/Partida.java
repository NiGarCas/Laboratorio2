/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_datos;

import AngryBirds_visualizacion.PanelAngryBirds;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class Partida {
    private Resortera resortera;
    private Pajaro[] pajaros;
    private Cerdo[] cerdos;
    private int puntuacion;
    private int vidas;
    private int numPajaros;
    private int numCerdos;
    private Bloque[] bloques;
    private PanelAngryBirds panel;

    public Partida(PanelAngryBirds panel) {
        this.panel = panel;
        this.resortera = new Resortera();
        this.pajaros = new Pajaro[25];
        for(int i = 0;i<25;i++){
            this.pajaros[i] = new Pajaro();
        }
        this.resortera.setPajaro(this.pajaros[24]);
        this.cerdos = new Cerdo[5];
        this.cerdos[0] = new Cerdo(425,380,1);
        this.cerdos[1] = new Cerdo(550,380,3);
        this.cerdos[2] = new Cerdo(660,230,5);
        this.cerdos[3] = new Cerdo(660,350,8);
        this.cerdos[4] = new Cerdo(835,220,15);
        this.cerdos[4].setImagen("reycerdo.png");
        this.bloques = new Bloque[15];
        this.bloques[0] = new Bloque(470,390);
        for (int i = 0; i<5;i++){
            this.bloques[i+1] = new Bloque(590+(i*60),390);
        }
        for (int i = 0; i<4;i++){
           this.bloques[i+6] = new Bloque(830,360-(i*30));
        }
        for (int i = 0; i<3;i++){
           this.bloques[i+10] = new Bloque(650+(i*60),270);
        }
        this.bloques[13] = new Bloque(50,420);
        this.bloques[13].setArea(600, 30);
        this.bloques[13].setImagen("vacio.png");
        this.bloques[14] = new Bloque(930,0);
        this.bloques[14].setArea(20, 500);
        this.bloques[14].setImagen("vacio.png");
        this.numCerdos = 5;
        this.numPajaros = 25;
        this.vidas = 5;
        this.puntuacion = 0;
    }

    public Resortera getResortera() {
        return resortera;
    }

    public void setResortera(Resortera resortera) {
        this.resortera = resortera;
    }

    public Pajaro[] getPajaros() {
        return pajaros;
    }

    public void setPajaros(Pajaro[] pajaros) {
        this.pajaros = pajaros;
    }

    public Cerdo[] getCerdos() {
        return cerdos;
    }

    public void setCerdos(Cerdo[] cerdos) {
        this.cerdos = cerdos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public Bloque[] getBloques() {
        return bloques;
    }

    public void setBloques(Bloque[] bloques) {
        this.bloques = bloques;
    }

    public int getNumPajaros() {
        return numPajaros;
    }

    public void setNumPajaros(int numPajaros) {
        this.numPajaros = numPajaros;
    }

    public int getNumCerdos() {
        return numCerdos;
    }

    public void setNumCerdos(int numCerdos) {
        this.numCerdos = numCerdos;
    }

    public PanelAngryBirds getPanel() {
        return panel;
    }

    public void setPanel(PanelAngryBirds panel) {
        this.panel = panel;
    }
    
    public double lanzar(double tiempo){
        this.resortera.cambiarPosicionPajaro(tiempo);
        tiempo = tiempo + (0.035);
        for(int i = 0; i<15;i++){
            if(this.getResortera().getPajaro().getArea().intersects(this.getBloques()[i].getArea())){
                this.vidas--;
                for(int j = (this.numPajaros-1);j>=1;j--){
                    if(this.getResortera().getPajaro().equals(this.pajaros[j])){
                        this.getResortera().getPajaro().setImagen("vacio.png");
                        this.getResortera().getPajaro().setX(0);
                        this.getResortera().getPajaro().setY(480);
                        this.getResortera().getPajaro().setArea();
                        this.getResortera().setPajaro(this.pajaros[j-1]);
                        this.getResortera().getEstado().setImagen(this.getResortera().getEstado().getImagen1());
                        this.getResortera().setEstado(this.getResortera().getPosiciones()[0]);
                        this.panel.setLanzando(false);
                        tiempo = 0;
                        break;
                    }
                }
            }
        }
        
        for(int i = 0; i<5;i++){
            if(this.getResortera().getPajaro().getArea().intersects(this.getCerdos()[i].getArea())){
                this.puntuacion = this.puntuacion + this.getCerdos()[i].getValor();
                this.vidas = 5;
                
                for(int j = (this.numPajaros-1);j>=1;j--){
                    if(this.getResortera().getPajaro().equals(this.pajaros[j])){
                        this.getResortera().getPajaro().setImagen("vacio.png");
                        this.getResortera().getPajaro().setX(830);
                        this.getResortera().getPajaro().setY(480);
                        this.getResortera().getPajaro().setArea();
                        System.out.println(j);
                        this.getResortera().setPajaro(this.pajaros[j-1]);
                        this.getResortera().getEstado().setImagen(this.getResortera().getEstado().getImagen1());
                        this.getResortera().setEstado(this.getResortera().getPosiciones()[0]);
                        break;
                    }
                }
                this.getCerdos()[i].setImagen("vacio.png");
                this.getCerdos()[i].setX(10);
                this.getCerdos()[i].setY(40);
                this.getCerdos()[i].setArea();
                System.out.println(this.getCerdos()[i].getX());
                System.out.println(this.getCerdos()[i].getY());
                this.panel.setLanzando(false);
                tiempo = 0;
            }
        }
        return tiempo;
    }
}
