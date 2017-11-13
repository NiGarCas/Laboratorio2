/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_datos;

/**
 *
 * @author nicol
 */
public class EstadoResortera {
    
    private int xpajaro;
    private int ypajaro;
    private double sinAngulo;
    private double cosAngulo;
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String imagen;

    public EstadoResortera(int xpajaro, int ypajaro, double sinAngulo, double cosAngulo, String imagen1, String imagen2) {
        this.xpajaro = xpajaro;
        this.ypajaro = ypajaro;
        this.sinAngulo = sinAngulo;
        this.cosAngulo = cosAngulo;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = "21.png";
        this.imagen = this.imagen1;
    }

    public int getXpajaro() {
        return xpajaro;
    }

    public int getYpajaro() {
        return ypajaro;
    }

    public double getSinAngulo() {
        return sinAngulo;
    }

    public double getCosAngulo() {
        return cosAngulo;
    }

    public String getImagen1() {
        return imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   
    
    
}
