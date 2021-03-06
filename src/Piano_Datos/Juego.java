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
    private Nota do_;
    private Nota re_;
    private Nota mi_;
    private Nota fa_;
    private Nota sol_;
    private Nota la_;
    private Nota si_;
    
    public Juego(ArrayList<Melodia> incluidas) throws IOException {
        this.incluidas = incluidas;
        this.do_ = new Nota("DO", "do2.wav");
        this.re_ = new Nota("RE", "re2.wav");
        this.mi_ = new Nota("MI", "mi2.wav");
        this.fa_ = new Nota("FA", "fa2.wav");
        this.sol_ = new Nota("SOL", "sol2.wav");
        this.la_ = new Nota("LA", "la2.wav");
        this.si_ = new Nota("SI", "si2.wav");
        this.nuevas = new ArrayList();
    }

    public ArrayList<Melodia> getIncluidas() {
        return incluidas;
    }
    
    public void setIncluidas(ArrayList<Melodia> incluidas) {
        this.incluidas = incluidas;
    }

    public void setNuevas(ArrayList<Melodia> nuevas) {
        this.nuevas = nuevas;
    }

    public JuegoAdivinar getJadivinar() {
        return jadivinar;
    }

    public void setJadivinar(JuegoAdivinar jadivinar) {
        this.jadivinar = jadivinar;
    }

    public JuegoPiano getJsecuencia() {
        return jsecuencia;
    }

    public void setJsecuencia(JuegoPiano jsecuencia) {
        this.jsecuencia = jsecuencia;
    }

    public VentanaVisualizacion getVentana() {
        return ventana;
    }
    
    public void setVentana(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }

    public ArrayList<Melodia> getNuevas() {
        return nuevas;
    }

    public Nota getDo_() {
        return do_;
    }

    public void setDo_(Nota do_) {
        this.do_ = do_;
    }

    public Nota getRe_() {
        return re_;
    }

    public void setRe_(Nota re_) {
        this.re_ = re_;
    }

    public Nota getMi_() {
        return mi_;
    }

    public void setMi_(Nota mi_) {
        this.mi_ = mi_;
    }

    public Nota getFa_() {
        return fa_;
    }

    public void setFa_(Nota fa_) {
        this.fa_ = fa_;
    }

    public Nota getSol_() {
        return sol_;
    }

    public void setSol_(Nota sol_) {
        this.sol_ = sol_;
    }

    public Nota getLa_() {
        return la_;
    }

    public void setLa_(Nota la_) {
        this.la_ = la_;
    }

    public Nota getSi_() {
        return si_;
    }

    public void setSi_(Nota si_) {
        this.si_ = si_;
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
