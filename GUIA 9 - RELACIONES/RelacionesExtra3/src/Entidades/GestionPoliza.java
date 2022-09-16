/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ENUMS.TipoDeCobertura;
import ENUMS.FormaDePago;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class GestionPoliza {
    
   
         private List<GestionIntegralCliente> clientes = new ArrayList<>();
    private List<GestionDeVehiculo> vehiculos = new ArrayList<>();
    private long numPoliza;
    private Date fechaInicio;
    private Date fechaFinal;
    private int cantCuotas;
    private String formaPago;
    private double montoAseguradoMax;
    private boolean granizo;
    private double montoGranizoMax;
    private String tipoCobertura;

    public GestionPoliza() {
    }

    public GestionPoliza(long numPoliza, Date fechaInicio, Date fechaFinal, int cantCuotas, String formaPago, double montoAseguradoMax, boolean granizo, double montoGranizoMax, String tipoCobertura) {
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoAseguradoMax = montoAseguradoMax;
        this.granizo = granizo;
        this.montoGranizoMax = montoGranizoMax;
        this.tipoCobertura = tipoCobertura;
    }
    public List<GestionIntegralCliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<GestionIntegralCliente> clientes) {
        this.clientes = clientes;
    }
    public List<GestionDeVehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(List<GestionDeVehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public long getNumPoliza() {
        return numPoliza;
    }
    public void setNumPoliza(long numPoliza) {
        this.numPoliza = numPoliza;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    public int getCantCuotas() {
        return cantCuotas;
    }
    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }
    public String getFormaPago() {
        return formaPago;
    }
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public double getMontoAseguradoMax() {
        return montoAseguradoMax;
    }
    public void setMontoAseguradoMax(double montoAseguradoMax) {
        this.montoAseguradoMax = montoAseguradoMax;
    }
    public boolean isGranizo() {
        return granizo;
    }
    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }
    public double getMontoGranizoMax() {
        return montoGranizoMax;
    }
    public void setMontoGranizoMax(double montoGranizoMax) {
        this.montoGranizoMax = montoGranizoMax;
    }
    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    @Override
    public String toString() {
        return "GestionPoliza{" + "clientes=" + clientes + ", vehiculos=" + vehiculos + ", numPoliza=" + numPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoAseguradoMax=" + montoAseguradoMax + ", granizo=" + granizo + ", montoGranizoMax=" + montoGranizoMax + ", tipoCobertura=" + tipoCobertura + '}';
    }    

    
    
}
