/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
* Cambio del estado civil de una persona.
 * @author Usuario
 */
public class Persona {
    
    String nombre;
    String apellido;
    int id;
    String estadoCivil;

    public Persona(String nombre, String apellido, int id, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }
    
    public void cambioEstado(){
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("El estado civil de "+nombre+" "+apellido+ " es: "+estadoCivil);
        System.out.print("Cambiarlo a: ");
        estadoCivil=leer.next();
        System.out.println("");
    
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ",\n estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
