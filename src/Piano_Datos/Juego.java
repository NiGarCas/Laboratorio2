/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;
import javax.swing.JFrame;
import sun.audio.*;
import java.util.*;        
import java.io.*;      
/**
 *
 * @author El PcGamer
 */
public class Juego {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getNumjugadores() {
        return numjugadores;
    }

    public void setNumjugadores(int numjugadores) {
        this.numjugadores = numjugadores;
    }

    public Melodia getMelodia() {
        return melodia;
    }

    public void setMelodia(Melodia melodia) {
        this.melodia = melodia;
    }
    private ArrayList<Jugador> jugadores;
    private int numjugadores;
    private Melodia melodia;
    public Juego(String nombre1, String nombre2) {
        
        Jugador j=new Jugador(nombre1);
        Jugador m=new Jugador(nombre2);
        this.melodia=new Melodia();
        this.numjugadores=2;
        this.jugadores.add(j);
        this.jugadores.add(m);
        
        this.nombre="Piano Game";
      
    }
}
