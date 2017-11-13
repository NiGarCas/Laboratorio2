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

    public EstadoResortera(int xpajaro, int ypajaro, double sinAngulo, double cosAngulo, String imagen1, String imagen2) {
        this.xpajaro = xpajaro;
        this.ypajaro = ypajaro;
        this.sinAngulo = sinAngulo;
        this.cosAngulo = cosAngulo;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = "21.png";
    }

    public int getXpajaro() {
        return xpajaro;
    }

    public void setXpajaro(int xpajaro) {
        this.xpajaro = xpajaro;
    }

    public int getYpajaro() {
        return ypajaro;
    }

    public void setYpajaro(int ypajaro) {
        this.ypajaro = ypajaro;
    }

    public double getSinAngulo() {
        return sinAngulo;
    }

    public void setSinAngulo(double sinAngulo) {
        this.sinAngulo = sinAngulo;
    }

    public double getCosAngulo() {
        return cosAngulo;
    }

    public void setCosAngulo(double cosAngulo) {
        this.cosAngulo = cosAngulo;
    }

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }
   
    
    
}
