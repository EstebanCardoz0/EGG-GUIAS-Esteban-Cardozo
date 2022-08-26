/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).Traslado de sección de un empleado del personal de servicio.
 * @author Usuario
 */
public class PersonalServicio extends Empleado {
    
    String seccion;

    public PersonalServicio(String seccion, int anioInc, int numDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioInc, numDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }
    
      public void cambioSeccion(){
      System.out.println("La sección actual de " + nombre + " " + apellido + " es: " + seccion);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Cambiarla a: ");
        seccion = leer.next();
        System.out.println("");
    
    }

    @Override
    public String toString() {
        return super.toString()+"PersonalServicio{" + "seccion=" + seccion + '}'; //To change body of generated methods, choose Tools | Templates.
    }

    

   
}
