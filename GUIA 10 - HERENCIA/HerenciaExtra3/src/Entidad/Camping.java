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
public class Camping extends ExtraHotel{
    
    int capacidadCarpas;
    int baños;
    boolean restaurant;

    public Camping() {
    }

    public Camping(int capacidadCarpas, int baños, boolean restaurant, boolean privado, double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.baños = baños;
        this.restaurant = restaurant;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public boolean isPrivado() {
        return privado;
    }
    
    
    
    
}
