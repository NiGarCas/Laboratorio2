/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class JuegoPiano {
    private Juego juego;
    private Melodia melodia;
    private ArrayList<Jugador> jugadores;
    private Jugador turno;
    private Nota[] notas;

    public JuegoPiano(ArrayList<Jugador> jugadores) throws IOException {
        this.jugadores = jugadores;
        this.melodia = new Melodia();
        this.notas = new Nota [7];
        this.notas[0] = new Nota("DO", "do2.wav");
        this.notas[1] = new Nota("RE", "re2.wav");
        this.notas[2] = new Nota("MI", "mi2.wav");
        this.notas[3] = new Nota("FA", "fa2.wav");
        this.notas[4] = new Nota("SOL", "sol2.wav");
        this.notas[5] = new Nota("LA", "la2.wav");
        this.notas[6] = new Nota("SI", "si2.wav");
        this.turno = this.jugadores.get(0);
    }

    public Jugador getTurno() {
        return turno;
    }

    public void setTurno(Jugador turno) {
        this.turno = turno;
    }


    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Nota[] getNotas() {
        return notas;
    }
    
}
