/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones01;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author Usuario
 */
public class Relaciones01 {

    /**Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro dog1=new Perro("Preta", "mestiza", 2, "mediano");
        Perro dog2=new Perro("Dylan", "mestizo", 1, "mediano");
        
        Persona per1=new Persona("Esteban", "Cardozo", 27, 38714397, dog1);
        Persona per2=new Persona("Eugenia", "Torres", 22, 40555397, dog2);
        
        System.out.println(per1);
        System.out.println("-------------------------");
        System.out.println(per2);
        
    }
    
}
