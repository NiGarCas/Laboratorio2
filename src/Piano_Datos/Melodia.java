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
    private ArrayList<Nota> audios;

    public ArrayList<Nota> getAudios() {
        return audios;
    }

    public void setAudios(ArrayList<Nota> audios) {
        this.audios = audios;
    }

    public Melodia() {
        this.audios= new ArrayList<>();
    }

   
}
