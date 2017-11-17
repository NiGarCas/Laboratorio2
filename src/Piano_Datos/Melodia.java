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
public class Melodia {
    private ArrayList<Nota> notas;
    private String nombre;
    private boolean adivinada;

    public Melodia() {
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAdivinada() {
        return adivinada;
    }

    public void setAdivinada(boolean adivinada) {
        this.adivinada = adivinada;
    }
    
    public ArrayList<Nota> getNotas() {
        return notas;
    }
    public void agregarNota(Nota nota){
        this.notas.add(nota);
    }
    public void reproducir(){
        for(Nota nota: this.notas){
            nota.reproducir();
            try{
                Thread.sleep(1000); 
            } catch(InterruptedException e ){ 
            }
        }
    }
}
