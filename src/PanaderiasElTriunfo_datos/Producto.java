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
    private double descuento;

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

    public int getDias_descuento() {
        return dias_descuento;
    }

    public void setDias_descuento(int dias_descuento) {
        this.dias_descuento = dias_descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public void aplicarDescuento(){
        if (this.dias_descuento > 0){
            this.setPrecio( precio * (1-(descuento/100)));
        }
    }
    public void regresarAPrecioNormal(){
        this.setPrecio( precio / (1-(descuento/100)));
    }
}
