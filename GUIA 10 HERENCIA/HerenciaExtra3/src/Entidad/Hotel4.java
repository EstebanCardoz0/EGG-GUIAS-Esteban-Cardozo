/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Esteban
 */
public class Hotel4 extends Hotel{
    
    String gym;
    String restaurante;
    int CapacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gym, String restaurante, int CapacidadRestaurante, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.restaurante = restaurante;
        this.CapacidadRestaurante = CapacidadRestaurante;
    }

   


public Double calcularPrecio(){
    
    int valorRestaurante=0;
    int valorGym=0;
    
    if (CapacidadRestaurante<30) {
        valorRestaurante=10;
    }else if (CapacidadRestaurante>=30 && CapacidadRestaurante<=50) {
        valorRestaurante=30;
    }else if (CapacidadRestaurante>50) {
        valorRestaurante=50;
    }
    
    if (gym.equalsIgnoreCase("a")) {
        valorGym=50;
    }else{
    valorGym=30;
    }
    
    
    Double precio=50.0+habitaciones+valorRestaurante+valorGym;
    
    
    
    
        return precio;
}    


  public static Comparator <Hotel4> compararPrecio = new Comparator <Hotel4>(){
        @Override
        public int compare(Hotel4 t, Hotel4 t1) {
            return t1.calcularPrecio().compareTo(t.calcularPrecio());
        }



};



    
    
}
