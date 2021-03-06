/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_datos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nicol
 */
public class Fecha {
    private int dia;
    private Mes mes;
    private double dinero_inicial;
    private double dinero_final;
    private HashMap<Producto,Integer> inv_inicial;
    private HashMap<Producto,Integer> inv_final;
    private ArrayList<Compra> compras;
    private ArrayList<Venta> ventas;

    public Fecha(int dia, Mes mes) {
        this.dia = dia;
        this.mes = mes;
        this.inv_inicial = new HashMap<>();
        this.inv_final = new HashMap<>();
        this.compras = new ArrayList();
        this.ventas = new ArrayList();
        if(dia == 1 && mes.getNumero() == 1){
            this.dinero_inicial = 0;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public double getDinero_inicial() {
        return dinero_inicial;
    }

    public void setDinero_inicial(double dinero_inicial) {
        this.dinero_inicial = dinero_inicial;
    }

    public double getDinero_final() {
        return dinero_final;
    }

    public void setDinero_final(double dinero_final) {
        this.dinero_final = dinero_final;
    }

    public HashMap<Producto,Integer> getInv_inicial() {
        return inv_inicial;
    }

    public void setInv_inicial(HashMap<Producto,Integer> inv_inicial) {
        this.inv_inicial = inv_inicial;
    }

    public HashMap<Producto,Integer> getInv_final() {
        return inv_final;
    }

    public void setInv_final(HashMap<Producto,Integer> inv_final) {
        this.inv_final = inv_final;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
}
