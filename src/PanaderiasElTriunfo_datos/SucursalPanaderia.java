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
    private int dia;
    private Mes mes;

    public SucursalPanaderia(int dia, Mes mes) {
        this.productos = new ArrayList();
        this.compras = new ArrayList();
        this.ventas = new ArrayList();
        this.dia = dia;
        this.mes = mes;
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
                Compra compra = new Compra(this.productos.get(i),cantidad,valor,this.dia, this.mes, proovedor);
                this.compras.add(compra);
                this.productos.get(i).setCantidad_actual(this.productos.get(i).getCantidad_actual() + cantidad);
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
                    VentaPorMayor venta = new VentaPorMayor(this.productos.get(i),cantidad,valor,this.dia,this.mes, cliente);
                    this.ventas.add(venta);
                    this.productos.get(i).setCantidad_actual(this.productos.get(i).getCantidad_actual() - cantidad);
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
                    VentaPorMenor venta = new VentaPorMenor(this.productos.get(i),cantidad,valor,this.dia,this.mes);
                    this.ventas.add(venta);
                    this.productos.get(i).setCantidad_actual(this.productos.get(i).getCantidad_actual() - cantidad);
                    a = true;
                    break;
                }
            }
        }
        return a;
    }
    public void cambiarDeDia(int numero_mes, int dia){
        Mes enero = new Mes ("enero", 1, 31);
        Mes febrero = new Mes ("febrero", 2, 28);
        Mes marzo = new Mes ("marzo", 3, 31);
        Mes abril = new Mes ("abril", 4, 30);
        Mes mayo = new Mes ("mayo", 5, 31);
        Mes junio = new Mes ("junio", 6, 30);
        Mes julio = new Mes ("julio", 7, 31);
        Mes agosto = new Mes ("agosto", 8, 31);
        Mes septiembre = new Mes ("septiembre", 9, 30);
        Mes octubre = new Mes ("octubre", 10, 31);
        Mes noviembre = new Mes ("noviembre", 11, 30);
        Mes diciembre = new Mes ("diciembre", 12, 31);
        int nuevodia = 0;
        Mes month =  this.getMes();
        if (numero_mes == 1){
            if (dia == 31){
		nuevodia = 1;
                month = febrero;
            }else{
        	nuevodia = dia + 1;
            }
        }else{
            if(numero_mes == 2){
		if (dia == 28){
			nuevodia = 1;
                    	month = marzo;
                }else{
                    nuevodia = dia + 1;
                }
            }else{
		if(numero_mes == 3){
                    if (dia == 31){
			nuevodia = 1;
                    	month = abril;
                    }else{
                    	nuevodia = dia + 1;
                    }
		}else{
                    if(numero_mes == 4){
                        if (dia == 30){
                            nuevodia = 1;
                            month = mayo;
                        }else{
                            nuevodia = dia + 1;
                        }
                    }else{
                        if(numero_mes == 5){
                            if (dia == 31){
                                nuevodia = 1;
                    		month = junio;
                            }else{
                                nuevodia = dia + 1;
                            }
			}else{
                            if(numero_mes == 6){
				if (dia == 30){
                                    nuevodia = 1;
                                    month = julio;
                		}else{
                                    nuevodia = dia + 1;
                		}
                            }else{
				if(numero_mes == 7){
                                    if (dia == 31){
					nuevodia = 1;
                    			month = agosto;
                                    }else{
                    			nuevodia = dia + 1;
                                    }
				}else{
                                    if(numero_mes == 8){
					if (dia == 31){
                                            nuevodia = 1;
                                            month = septiembre;
               				}else{
                                            nuevodia = dia + 1;
                			}
                                    }else{
					if(numero_mes == 9){
                                            if (dia == 30){
						nuevodia = 1;
                    				month = octubre;
                                            }else{
                                                nuevodia = dia + 1;
                                            }
					}else{
                                            if(numero_mes == 10){
						if (dia == 31){
                                                    nuevodia = 1;
                                                    month = noviembre;
                				}else{
                                                    nuevodia = dia + 1;
                				}
                                            }else{
						if(numero_mes == 11){
                                                    if (dia == 30){
							nuevodia = 1;
                    					month = diciembre;
                                                    }else{
                    					nuevodia = dia + 1;
                                                    }
						}else{
                                                    if(numero_mes == 12){
							if (dia == 31){
                                                            nuevodia = 1;
                                                            month = enero;
                					}else{
                                                            nuevodia = dia + 1;
                					}
                                                    }
						}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }       
        }
        this.setDia(nuevodia);
        this.setMes(month);
        for(int i = 0; i < this.productos.size(); i++){
            this.productos.get(i).regresarAPrecioNormal();
            this.productos.get(i).setDias_descuento(this.productos.get(i).getDias_descuento() - 1);
            this.productos.get(i).aplicarDescuento();
        }   
    }
}