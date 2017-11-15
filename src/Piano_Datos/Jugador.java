/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;

import java.util.*;

/**
 *
 * @author El PcGamer
 */
public class Jugador {
     private String nombre;
     private int vidas;
     private boolean turno;
     private int puntuacion;
     private Melodia melodia;
   public Jugador(String nombre) {
        this.nombre = nombre;
        this.vidas=5;
        this.turno=true;
        this.puntuacion=0;
        this.melodia=new Melodia();
        }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
        this.vidas--;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
   
    
}
