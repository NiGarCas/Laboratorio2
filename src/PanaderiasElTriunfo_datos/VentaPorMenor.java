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
public class VentaPorMenor extends Venta{
    public VentaPorMenor(Producto producto, int cantidad, double valor_total, int dia, Mes mes) {
        super(producto, cantidad, valor_total, dia, mes);
        this.tipo = "Por Menor";
    }
}
