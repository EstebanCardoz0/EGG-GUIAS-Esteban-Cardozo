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
public class Residencia extends ExtraHotel {    
    
    int habitaciones;
    boolean descGremios;
    boolean campoDepor;

    public Residencia() {
    }

    public Residencia(int habitaciones, boolean descGremios, boolean campoDepor, boolean privado, double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descGremios = descGremios;
        this.campoDepor = campoDepor;
    }

    public boolean isDescGremios() {
        return descGremios;
    }
    
    
    
}
