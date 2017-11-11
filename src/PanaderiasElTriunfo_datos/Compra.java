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
    private Producto producto;
    private int cantidad;
    private double valor_total;
    private Mes mes;
    private int dia;
    private String proovedor;

    public Compra(Producto producto, int cantidad, double valor_total, int Dia, Mes mes, String proovedor) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor_total = valor_total;
        this.dia = dia;
        this.mes = mes;
        this.proovedor = proovedor;
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

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }
    
    
}
