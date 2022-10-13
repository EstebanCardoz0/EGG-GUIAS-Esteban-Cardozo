/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhcp;

import entidades.Canciones;
import persistencia.CancionesJpaController;

/**
 *
 * @author Esteban
 */
public class Rhcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        
        CancionesJpaController can=new CancionesJpaController();
        
        Canciones nueva=new Canciones(4, 6, "Warped");
        
        can.create(nueva);
        
        
    }
    
}
