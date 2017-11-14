/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_S;
import sun.audio.*;
import java.io.*;        
import java.util.*;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author El PcGamer
 */
public class Melodia {
   private ArrayList<InputStream> audios;

    public Melodia() {
        this.audios= new ArrayList<>();
    }

    public ArrayList<InputStream> getAudios() {
        return audios;
    }

    public void setAudios(ArrayList<InputStream> audios) {
        this.audios = audios;
    }
   
   
   
}
