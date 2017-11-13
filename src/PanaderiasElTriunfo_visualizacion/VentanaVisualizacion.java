/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiasElTriunfo_visualizacion;

import PanaderiasElTriunfo_datos.SucursalPanaderia;
import PanaderiasElTriunfo_logica.Controlador;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class VentanaVisualizacion extends JFrame{
    private SucursalPanaderia sucursal;
    private Controlador controlador;
    private PanelPrincipal principal;
    private PanelAgregarProducto agregar;
    private PanelPromocion promocion;
    private PanelCompra compra;
    private PanelPorMayor pormayor;
    private PanelPorMenor pormenor;
    private PanelInventario inventario;
    private PanelCaja caja;
    private PanelMovimientoInventario movinventario;
    private PanelReporteVentas ventas;
    private PanelReportePyG pyg;
    private Panel panel_actual;

    public VentanaVisualizacion(SucursalPanaderia sucursal) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(400,250);
        this.setSize(600, 400);
        this.setTitle("Panaderias El Triunfo");
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.sucursal = sucursal;
        this.principal = new PanelPrincipal(this);
        this.agregar =new PanelAgregarProducto(this);
        this.promocion = new PanelPromocion(this);
        this.compra = new PanelCompra(this);
        this.pormayor = new PanelPorMayor(this);
        this.pormenor = new PanelPorMenor(this);
        this.inventario = new PanelInventario(this);
        this.caja = new PanelCaja(this);
        this.movinventario = new PanelMovimientoInventario(this);
        this.ventas = new PanelReporteVentas(this);
        this.pyg = new PanelReportePyG(this);
    }
    
    public void agregarPanel(Panel panel){
        this.panel_actual = panel;
        this.add(panel);
        panel.serAgregado();
        this.pack();
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public SucursalPanaderia getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalPanaderia sucursal) {
        this.sucursal = sucursal;
    }

    public Panel getPanel_actual() {
        return panel_actual;
    }

    public void setPanel_actual(Panel panel) {
        this.panel_actual = panel;
    }

    public PanelPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(PanelPrincipal principal) {
        this.principal = principal;
    }

    public PanelAgregarProducto getAgregar() {
        return agregar;
    }

    public void setAgregar(PanelAgregarProducto agregar) {
        this.agregar = agregar;
    }

    public PanelPromocion getPromocion() {
        return promocion;
    }

    public void setPromocion(PanelPromocion promocion) {
        this.promocion = promocion;
    }

    public PanelCompra getCompra() {
        return compra;
    }

    public void setCompra(PanelCompra compra) {
        this.compra = compra;
    }

    public PanelPorMayor getPormayor() {
        return pormayor;
    }

    public void setPormayor(PanelPorMayor pormayor) {
        this.pormayor = pormayor;
    }

    public PanelPorMenor getPormenor() {
        return pormenor;
    }

    public void setPormenor(PanelPorMenor pormenor) {
        this.pormenor = pormenor;
    }

    public PanelInventario getInventario() {
        return inventario;
    }

    public void setInventario(PanelInventario inventario) {
        this.inventario = inventario;
    }

    public PanelCaja getCaja() {
        return caja;
    }

    public void setCaja(PanelCaja caja) {
        this.caja = caja;
    }

    public PanelMovimientoInventario getMovinventario() {
        return movinventario;
    }

    public void setMovinventario(PanelMovimientoInventario movinventario) {
        this.movinventario = movinventario;
    }

    public PanelReporteVentas getVentas() {
        return ventas;
    }

    public void setVentas(PanelReporteVentas ventas) {
        this.ventas = ventas;
    }

    public PanelReportePyG getPyg() {
        return pyg;
    }

    public void setPyg(PanelReportePyG pyg) {
        this.pyg = pyg;
    }
    
}
