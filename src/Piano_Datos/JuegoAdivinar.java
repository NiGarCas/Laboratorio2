/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;

import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class JuegoAdivinar {
    private Juego juego;
    private ArrayList<Melodia> canciones;
    private Melodia cancion_actual;
    private int intentos;

    public JuegoAdivinar(Juego juego) {
        this.juego = juego;
        this.canciones = this.juego.getIncluidas();
        this.cancion_actual = this.canciones.get(0);
        this.intentos = 20;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    public ArrayList<Melodia> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Melodia> canciones) {
        this.canciones = canciones;
    }

    public Melodia getCancion_actual() {
        return cancion_actual;
    }

    public void setCancion_actual(Melodia cancion_actual) {
        this.cancion_actual = cancion_actual;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
}
