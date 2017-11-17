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

    public Melodia() {
        this.notas = new ArrayList<>();
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }
    
}
