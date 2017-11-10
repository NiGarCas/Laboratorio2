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
    protected Producto producto;
    protected int cantidad;
    protected double valor_total;
    protected Date fecha;
}
