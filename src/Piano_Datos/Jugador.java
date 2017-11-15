/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Datos;

import java.util.*;

/**
 *
 * @author El PcGamer
 */
public class Jugador {
     private String nombre;
     private boolean turno;
     private boolean ganador;
     
   public Jugador(String nombre) {
        this.nombre = nombre;
        this.ganador = false;
        }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
