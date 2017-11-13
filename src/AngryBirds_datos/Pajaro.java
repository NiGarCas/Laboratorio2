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
public class Pajaro {
    private int x_inicial;
    private int y_inicial;
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

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX_inicial() {
        return x_inicial;
    }

    public void setX_inicial(int x_inicial) {
        this.x_inicial = x_inicial;
    }

    public int getY_inicial() {
        return y_inicial;
    }

    public void setY_inicial(int y_inicial) {
        this.y_inicial = y_inicial;
    }

    public Rectangle getArea() {
        return area;
    }

    public void setArea() {
        this.area.setLocation(x, y);
    }

    public Pajaro() {
        this.imagen = "pajaro.png";
        this.area = new Rectangle(x,y,40,40);
    }
}
