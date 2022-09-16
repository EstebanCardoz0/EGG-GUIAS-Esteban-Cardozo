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
public class Animal {
    
    String nombre;
    String especie;
    String alimento;
    int edad;
    String raza;

    public Animal() {
    }

    public Animal(String nombre, String especie, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void alimentar(){
    
        System.out.println("Hola, soy "+nombre+", un "+especie+" "+raza+" de "+edad+" años\ny me alimento de "+alimento);
        System.out.println("");
    }
    
    
  
    
    
    
}
