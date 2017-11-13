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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImagen() {
        return imagen;
    }

    public Cerdo(int x, int y) {
        this.x = x;
        this.y = y;
        this.imagen = "cerdo.png";
        this.area = new Rectangle(x,y,40,40);
    }
}
