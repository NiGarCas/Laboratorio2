/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class JuegoPiano {
    private Juego juego;
    private Melodia melodia;
    private Melodia provisional;
    private ArrayList<Jugador> jugadores;
    private Jugador turno;
    private Nota[] notas;
    private boolean ultimo;

    public JuegoPiano(Juego juego, ArrayList<Jugador> juga) throws IOException {
        this.juego = juego;
        this.jugadores = juga;
        this.melodia = new Melodia();
        this.provisional = new Melodia();
        this.notas = new Nota [7];
        this.ultimo = true;
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

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Melodia getMelodia() {
        return melodia;
    }

    public void setMelodia(Melodia melodia) {
        this.melodia = melodia;
    }

    public Melodia getProvisional() {
        return provisional;
    }

    public void setProvisional(Melodia provisional) {
        this.provisional = provisional;
    }
     public boolean verificar_ultima(){
         int pos = this.provisional.getNotas().size() - 1;
         if(this.provisional.getNotas().get(pos).equals(this.melodia.getNotas().get(pos))){
             return true;
         }else{
             return false;
         }
     }

    public void revisar(Nota nota) {
        if(ultimo == true){
            melodia.agregarNota(nota);
            this.cambiarTurno();
            this.provisional.getNotas().clear();
            ultimo = false;
        }else{
            provisional.agregarNota(nota);
            System.out.println(verificar_ultima());
            if (verificar_ultima()){
                if(provisional.getNotas().size() == melodia.getNotas().size()){
                    ultimo = true;
                }else{
                }
            }else{
                for(Jugador jug : this.jugadores){
                    if(jug.getNombre().equals(turno.getNombre())){
                        this.provisional.getNotas().clear();
                        JOptionPane.showMessageDialog(this.juego.getVentana(), (turno.getNombre() + " ha sido eliminado"));
                        for(int i = 0;i < this.jugadores.size(); i++){
                            if(turno.getNombre().equals(this.jugadores.get(i).getNombre())){
                                this.cambiarTurno();
                                this.jugadores.remove(i);
                                this.provisional.getNotas().clear();
                            }
                        }
                        break;
                    }
                
                }
            }
        }
        if(this.jugadores.size() == 1){
            JOptionPane.showMessageDialog(this.juego.getVentana(), ( turno.getNombre() + " ha ganado el juego"));
            int guardar = JOptionPane.showConfirmDialog(this.juego.getVentana(), "¿Desean guardar la melodía creada?");
            if(guardar == JOptionPane.YES_OPTION){
                this.juego.getNuevas().add(melodia);
                JOptionPane.showMessageDialog(this.juego.getVentana(),"Melodía Guardada");
            }
        }
    }

    private void cambiarTurno() {
        for (int i = 0; i< this.jugadores.size(); i++){
            if(turno.getNombre().equals(this.jugadores.get(i).getNombre())){
                if(i == (this.jugadores.size() - 1)){
                    turno = this.jugadores.get(0);
                    break;
                }else{
                    turno = this.jugadores.get(i+1);
                    break;
                }
            }
        }
    }
    
}
