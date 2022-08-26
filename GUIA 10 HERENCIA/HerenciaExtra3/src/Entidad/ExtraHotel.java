/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Esteban
 */
public class ExtraHotel extends Alojamiento {
    
    boolean privado;
    double m2;

    public ExtraHotel(boolean privado, double m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public ExtraHotel() {
    }
    
    
    
}
