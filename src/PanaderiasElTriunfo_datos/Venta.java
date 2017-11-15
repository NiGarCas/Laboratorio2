/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_datos;

import java.util.Date;

/**
 *
 * @author nicol
 */
public abstract class Venta {
    
    protected SucursalPanaderia sucursal;
    protected Producto producto;
    protected int cantidad;
    protected double valor_total;
    private Fecha fecha;

    public Venta(Producto producto, int cantidad, double valor_total, Fecha fecha, SucursalPanaderia sucursal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor_total = valor_total;
        this.fecha = fecha;
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
