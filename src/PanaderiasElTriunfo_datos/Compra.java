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
public class Compra {
    private SucursalPanaderia sucursal;
    private Producto producto;
    private int cantidad;
    private double valor_total;
    private Fecha fecha;
    private String proovedor;

    public Compra(Producto producto, int cantidad, double valor_total, Fecha fecha, String proovedor, SucursalPanaderia sucursal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor_total = valor_total;
        this.fecha = fecha;
        this.proovedor = proovedor;
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
    
    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }
    
    
}
