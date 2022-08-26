/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.Matriculación de un estudiante en un nuevo curso.
 * @author Usuario
 */
public class Estudiante extends Persona {
    
    String curso;

    public Estudiante(String curso, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    

  
    
    public void matriculacion(){
      System.out.println("El curso actual de " + nombre + " " + apellido + " es: " + curso);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Cambiarlo a: ");
        curso = leer.next();
        System.out.println("");
    
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "curso=" + curso + '}'; //To change body of generated methods, choose Tools | Templates.
    }

    

    

    
    
    
    
}
