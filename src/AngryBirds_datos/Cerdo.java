/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_datos;

import java.awt.Rectangle;

/**
 *
 * @author nicol
 */
public class Cerdo {
    
    private int x;
    private int y;
    private String imagen;
    private int valor;
    private Rectangle area;
    
    public Cerdo(int x, int y, int valor) {
        this.x = x;
        this.y = y;
        this.imagen = "cerdo.png";
        this.area = new Rectangle(x,y,60,30);
        this.valor = valor;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImagen() {
        return imagen;
    }
    
    public Rectangle getArea() {
        return area;
    }

    public int getValor() {
        return valor;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setArea() {
        this.area = new Rectangle(x,y,40,40);
    }
  
}
