/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;
import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JFrame;
import sun.audio.*;
import java.util.*;        
import java.io.*;     
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author El PcGamer
 */
public class Nota {
     private String nombre;
     private InputStream audio;
     private AudioClip sonido;

    public Nota(String nombre, String nombreAudio) throws FileNotFoundException, IOException {
        this.nombre = nombre;
        try {
                 URL url = new URL("file:" + nombreAudio);
                 this.sonido = Applet.newAudioClip(url);
                 
             } catch (MalformedURLException ex) {
                 
             }
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
    
    public void reproducir(){
        this.sonido.play();
    }
}
