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
import java.io.InputStream;

/**
 *
 * @author El PcGamer
 */
public class Nota {
     private String nombre;
    private InputStream audio;

    public Nota(String nombre, InputStream audio) {
        this.nombre = nombre;
        this.audio = audio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public InputStream getAudio() {
        return audio;
    }

    public void setAudio(InputStream audio) {
        this.audio = audio;
    }
}
