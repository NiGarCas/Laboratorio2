/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_datos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nicol
 */
public class SucursalPanaderia {
    private ArrayList<Producto> productos;
    private ArrayList<Compra> compras;
    private ArrayList<Venta> ventas;
    private double dinero;
    private Fecha fecha;
    private Fecha[] fechas;

    public SucursalPanaderia( Fecha[] fechas) {
        this.productos = new ArrayList();
        this.compras = new ArrayList();
        this.ventas = new ArrayList();
        this.fechas = fechas;
        this.fecha = this.fechas[0];
        this.dinero = 0;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
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

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
    public boolean agregarProducto(String nombre, double precio){
        boolean a = false;
        boolean b = true;
        for(int i = 0; i < this.productos.size(); i++){
            if(this.productos.get(i).getNombre().equals(nombre)){
                b = false;
                break;
            }
        }
        if (b){
            Producto producto = new Producto(nombre, precio);
            this.productos.add(producto);
            a = true;
        }
        return a;
    }
    
    public boolean eliminarProducto(String nombre){
        boolean a = false;
        for(int i = 0; i < this.productos.size(); i++){
            if(this.productos.get(i).getNombre().equals(nombre)){
                this.productos.remove(i);
                a = true;
                break;
            }
        }
        return a;
    }
    
    public boolean cambiarPrecio(String nombreproducto, double descuento, int dias){
        boolean a = false;
        for(int i = 0; i < this.productos.size(); i++){
            if(descuento < 0 || descuento > 100){
                break;
            }
            if(this.productos.get(i).getNombre().equals(nombreproducto)){
                this.productos.get(i).setDias_descuento(dias);
                this.productos.get(i).setDescuento(descuento);
                a = true;
                break;
            }
        }
        return a;
    }
    
    public boolean registrarCompra(String nombreproducto, int cantidad, double valor, String proovedor){
        boolean a = false;
        for(int i = 0; i < this.productos.size(); i++){
            if(this.productos.get(i).getNombre().equals(nombreproducto)){
                Compra compra = new Compra(this.productos.get(i),cantidad,valor,this.fecha, proovedor, this);
                this.compras.add(compra);
                this.productos.get(i).setCantidad_actual(this.productos.get(i).getCantidad_actual() + cantidad);
                this.dinero = this.dinero - valor;
                this.fecha.getCompras().add(compra);
                a = true;
                break;
            }
        }
        return a;
    }
    
    public boolean registrarVentaPorMayor(String nombreproducto, int cantidad, double valor, String cliente){
        boolean a = false;   
        for(int i = 0; i < this.productos.size(); i++){
            if(this.productos.get(i).getNombre().equals(nombreproducto)){
                if(cantidad <= this.productos.get(i).getCantidad_actual()){
                    VentaPorMayor venta = new VentaPorMayor(this.productos.get(i),cantidad,valor,this.fecha, cliente, this);
                    this.ventas.add(venta);
                    this.productos.get(i).setCantidad_actual(this.productos.get(i).getCantidad_actual() - cantidad);
                    this.dinero = this.dinero + valor;
                    this.fecha.getVentas().add(venta);
                    a = true;
                    break;
                }
            }
        }
        return a;
    }
    
    public boolean registrarVentaPorMenor(String nombreproducto, int cantidad){
        boolean a = false;   
        for(int i = 0; i < this.productos.size(); i++){
            if(this.productos.get(i).getNombre().equals(nombreproducto)){
                if(cantidad <= this.productos.get(i).getCantidad_actual()){
                    double valor = cantidad * this.productos.get(i).getPrecio();
                    VentaPorMenor venta = new VentaPorMenor(this.productos.get(i),cantidad,valor,this.fecha, this);
                    this.ventas.add(venta);
                    this.productos.get(i).setCantidad_actual(this.productos.get(i).getCantidad_actual() - cantidad);
                    this.dinero = this.dinero + valor;
                    this.fecha.getVentas().add(venta);
                    a = true;
                    break;
                }
            }
        }
        return a;
    }
    
    public void cambiarDeDia(){
        this.fecha.setDinero_final(this.dinero);
        for(int i = 0;i< this.getProductos().size(); i++){
            this.fecha.getInv_final().put(this.getProductos().get(i), this.getProductos().get(i).getCantidad_actual());
        }
        for (int i = 0; i<364;i++){
            if(this.fechas[i].equals(this.fecha)){
                this.setFecha(this.fechas[i+1]);
                break;
            }else if(this.fechas[364].equals(this.fecha)){
                this.setFecha(this.fechas[0]);
                break;
            }
        }
        this.fecha.setDinero_inicial(this.dinero);
        for(int i = 0;i< this.getProductos().size(); i++){
            this.fecha.getInv_inicial().put(this.getProductos().get(i), this.getProductos().get(i).getCantidad_actual());
        }
        for(int i = 0; i < this.productos.size(); i++){
            this.productos.get(i).regresarAPrecioNormal();
            this.productos.get(i).setDias_descuento(this.productos.get(i).getDias_descuento() - 1);
            this.productos.get(i).aplicarDescuento();
        }   
    }
    
    public Fecha existeFecha(int dia, int mes){
        boolean a = false;
        Fecha fecha = null;
        for(int i = 0; i < 365; i++){
            if (dia == this.fechas[i].getDia()){
                if (mes == this.fechas[i].getMes().getNumero()){
                    fecha = this.fechas[i];
                    break;
                }
            }
        }
        return fecha;
    }
}