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
public class Hotel5 extends Hotel4{
    
    int salonesConferencia;
    int suites;
    int limosinas;

    public Hotel5() {
    }

    public Hotel5(int salonesConferencia, int suites, int limosinas, String gym, String restaurante, int CapacidadRestaurante, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(gym, restaurante, CapacidadRestaurante, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.salonesConferencia = salonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    @Override
    public Double calcularPrecio() {
        
        
        
        
        return super.calcularPrecio()+(limosinas*15); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    
    
    
}
