/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ENUMS.FormaDePago;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Esteban
 */
public class GestionCuotas {
    
    
      private ArrayList<GestionPoliza> poliza;
    private Integer numeroCuota;
    private Integer montoTotalCuota;
    private Boolean pagado;
    private Date vencimientoCuota;
    private FormaDePago formadepago;

    public GestionCuotas() {
    }
    public GestionCuotas(ArrayList<GestionPoliza> poliza, Integer numeroCuota, Integer montoTotalCuota, Boolean pagado, Date vencimientoCuota, FormaDePago formadepago) {
        this.poliza = poliza;
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagado = pagado;
        this.vencimientoCuota = vencimientoCuota;
        this.formadepago = formadepago;
    }
    public ArrayList<GestionPoliza> getPoliza() {
        return poliza;
    }
    public void setPoliza(ArrayList<GestionPoliza> poliza) {
        this.poliza = poliza;
    }
    public Integer getNumeroCuota() {
        return numeroCuota;
    }
    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }
    public Integer getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Integer montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }
    public Boolean getPagado() {
        return pagado;
    }
    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
    public Date getVencimientoCuota() {
        return vencimientoCuota;
    }
    public void setVencimientoCuota(Date vencimientoCuota) {
        this.vencimientoCuota = vencimientoCuota;
    }
    public FormaDePago getFormadepago() {
        return formadepago;
    }
    public void setFormadepago(FormaDePago formadepago) {
        this.formadepago = formadepago;
    }
    @Override
    public String toString() {
        return "GestionCuotas{" + "poliza=" + poliza + ", numeroCuota=" + numeroCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagado=" + pagado + ", vencimientoCuota=" + vencimientoCuota + ", formadepago=" + formadepago + '}';
    } 
}

    
    
    
    

