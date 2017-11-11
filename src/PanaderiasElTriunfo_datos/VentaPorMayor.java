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
public class VentaPorMayor extends Venta{
    
    private String cliente;
    
    public VentaPorMayor(Producto producto, int cantidad, double valor_total, int dia, Mes mes, String cliente) {
        super(producto, cantidad, valor_total, dia, mes);
        this.cliente = cliente;
        this.tipo = "Por Mayor";
    }
    
}
