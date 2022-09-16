/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones.
 * @author Esteban
 */
public class Hotel extends Alojamiento {
    
    int habitaciones;
    int camas;
    int pisos;
    

    public Hotel(int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        
    }

    public Hotel() {
    }

    
    
    
    
}
