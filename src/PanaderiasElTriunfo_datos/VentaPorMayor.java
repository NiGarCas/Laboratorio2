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
    
    public VentaPorMayor(Producto producto, int cantidad, double valor_total, Fecha fecha, String cliente,SucursalPanaderia sucursal) {
        super(producto, cantidad, valor_total, fecha, sucursal);
        this.cliente = cliente;
    }
    
}
