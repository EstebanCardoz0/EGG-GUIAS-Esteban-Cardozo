/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Esteban
 */
public class Cine {
    
    Pelicula peli;
    int precio;
    Asiento [][] sala;
    List<String> asientosLibres;

    public Cine(Pelicula peli, int precio, Asiento[][] sala, List<String> asientosLibres) {
        this.peli = peli;
        this.precio = precio;
        this.sala = sala;
        this.asientosLibres = asientosLibres;
    }

    public Cine() {
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public List<String> getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(List<String> asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", precio=" + precio + ", sala=" + sala + ", asientosLibres=" + asientosLibres + '}';
    }

   
    
}
