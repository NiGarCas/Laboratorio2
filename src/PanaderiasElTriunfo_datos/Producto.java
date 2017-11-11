/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_datos;

/**
 *
 * @author nicol
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad_actual;
    private int dias_descuento;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_actual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }
    
}
