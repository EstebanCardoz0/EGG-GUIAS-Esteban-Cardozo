/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import Entidades.Operaciones;

/**
 *
 * @author Esteban
 */
public class POOej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Operaciones op=new Operaciones();
       
        op.CrearOperacion();
        System.out.println("la suma de los números es: "+op.Sumar());
        System.out.println("la resta de los números es: "+op.Restar());
        System.out.println("la multiplicación de los números es: "+op.Multiplicar());
        System.out.println("la división de los números es: "+op.Dividir());
      
         
    }
    
}
