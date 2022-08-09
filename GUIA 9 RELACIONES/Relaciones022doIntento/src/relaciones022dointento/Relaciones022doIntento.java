/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones022dointento;

import Entidades.Juego;

/**
 *
 * @author Esteban
 */
public class Relaciones022doIntento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n_ronds = 1;
        boolean fin = false;
        
        Juego ruletaRusa = new Juego();
        ruletaRusa.llenarJuego();
        
        System.out.println();
        
        do {
            System.out.println("RONDA " + n_ronds);
            
            ruletaRusa.ronda(fin);
            
            n_ronds++;
            
        } while(fin);
        
        
        
    }//final main
    
}
