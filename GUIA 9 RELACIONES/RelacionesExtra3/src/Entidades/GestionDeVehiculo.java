/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ENUMS.TipoDeCoche;

/**
 *
 * @author Esteban
 */
public class GestionDeVehiculo {
    
      private String marca;
    private String color;
    private String modelo;
    private Integer anio;
    private Integer numeroMotor;
    private Long chasis;

    public GestionDeVehiculo() {
    }

    public GestionDeVehiculo(String marca, String color, String modelo, Integer anio, Integer numeroMotor, Long chasis) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public Integer getNumeroMotor() {
        return numeroMotor;
    }
    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }
    public Long getChasis() {
        return chasis;
    }
    public void setChasis(Long chasis) {
        this.chasis = chasis;
    }

    
    
    
    
    
    
}
