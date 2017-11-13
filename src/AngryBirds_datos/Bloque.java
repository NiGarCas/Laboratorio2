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
public class Bloque {
    private int x;
    private int y;
    private String imagen;
    private Rectangle area;

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

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setArea(int x_, int y_) {
        this.area = new Rectangle(x,y,x_,y_);
    }

    public Bloque(int x, int y) {
        this.x = x;
        this.y = y;
        this.imagen = "bloque.png";
        this.area = new Rectangle(x,y,60,30);
    }
}
