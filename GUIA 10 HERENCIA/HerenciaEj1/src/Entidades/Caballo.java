/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Caballo extends Animal{

     public Caballo() {
    }

    public Caballo(String nombre, String especie, String alimento, int edad, String raza) {
        super(nombre, especie, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        super.alimentar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
