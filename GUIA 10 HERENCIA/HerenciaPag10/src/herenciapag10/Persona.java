/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapag10;

import Intefaces.Prueba;

/**
 *
 * @author Esteban
 */
public class Persona implements Prueba {
    
    
    

    @Override
    public void tridente(String uno, String dos, String tres) {
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vacio() {
        System.out.println("hola grupo");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vf() {
        return false;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Persona{" + '}';
    }
    
}
