/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;
import Piano_Visualizacion.VentanaVisualizacion;
import javax.swing.JFrame;
import sun.audio.*;
import java.util.*;        
import java.io.*;      
import javax.swing.JOptionPane;
/**
 *
 * @author El PcGamer
 */
public class Juego {

    private ArrayList<Melodia> incluidas;
    private ArrayList<Melodia> nuevas;
    private JuegoAdivinar jadivinar;
    private JuegoPiano jsecuencia;
    private VentanaVisualizacion ventana;
    
    public Juego(ArrayList<Melodia> incluidas) {
        this.incluidas = incluidas;
        this.nuevas = new ArrayList();
    }

    public void setIncluidas(ArrayList<Melodia> incluidas) {
        this.incluidas = incluidas;
    }

    public void setNuevas(ArrayList<Melodia> nuevas) {
        this.nuevas = nuevas;
    }

    public void setJadivinar(JuegoAdivinar jadivinar) {
        this.jadivinar = jadivinar;
    }

    public void setJsecuencia(JuegoPiano jsecuencia) {
        this.jsecuencia = jsecuencia;
    }

    public void setVentana(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }
    
    
    public ArrayList<Jugador> registrarJugadores() {
        ArrayList<Jugador> lista = new ArrayList();
        String numJugadores = JOptionPane.showInputDialog(this.ventana,"Ingrese numero de personas que van a jugar:");
        int nJugadores = Integer.parseInt(numJugadores);
        for (int i =0; i < nJugadores; i++){
            String nombre = JOptionPane.showInputDialog(this.ventana,("Ingrese el nombre del jugador :" + (i+1)));
            Jugador jug = new Jugador(nombre);
            lista.add(jug);
        }
        return lista;
    }
}
