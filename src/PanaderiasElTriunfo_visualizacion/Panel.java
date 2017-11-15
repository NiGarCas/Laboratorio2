/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public abstract class Panel extends JPanel  implements ActionListener{
    protected VentanaVisualizacion ventana;
    protected JPanel norte;
    protected JPanel izquierda;
    protected JPanel centro;
    protected JPanel derecha;
    protected JPanel sur;
    protected JTextField campo1;
    protected JTextField campo2;
    protected JTextField campo3;
    protected JTextField campo4;

    public Panel(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }

    public VentanaVisualizacion getVentana() {
        return ventana;
    }

    public void setVentana(VentanaVisualizacion ventana) {
        this.ventana = ventana;
    }

    public JPanel getNorte() {
        return norte;
    }

    public void setNorte(JPanel norte) {
        this.norte = norte;
    }

    public JPanel getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(JPanel izquierda) {
        this.izquierda = izquierda;
    }

    public JPanel getCentro() {
        return centro;
    }

    public void setCentro(JPanel centro) {
        this.centro = centro;
    }

    public JPanel getDerecha() {
        return derecha;
    }

    public void setDerecha(JPanel derecha) {
        this.derecha = derecha;
    }

    public JPanel getSur() {
        return sur;
    }

    public void setSur(JPanel sur) {
        this.sur = sur;
    }

    public JTextField getCampo1() {
        return campo1;
    }

    public void setCampo1(JTextField campo1) {
        this.campo1 = campo1;
    }

    public JTextField getCampo2() {
        return campo2;
    }

    public void setCampo2(JTextField campo2) {
        this.campo2 = campo2;
    }

    public JTextField getCampo3() {
        return campo3;
    }

    public void setCampo3(JTextField campo3) {
        this.campo3 = campo3;
    }

    public JTextField getCampo4() {
        return campo4;
    }

    public void setCampo4(JTextField campo4) {
        this.campo4 = campo4;
    }
    
    public abstract void agregarComponentes();
}
