/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).Cambio de departamento de un profesor.
 * @author Usuario
 */
public class Profesor extends Empleado {
    
    String departamento;

    public Profesor(String departamento, int anioInc, int numDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioInc, numDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }
    
    public void cambioDepto(){
      System.out.println("El departamento actual de " + nombre + " " + apellido + " es: " + departamento);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Cambiarlo a: ");
        departamento = leer.next();
        System.out.println("");
    
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "departamento=" + departamento + '}'; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
