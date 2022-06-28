/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6;

import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;

/**
 *
 * @author Esteban
 */
public class POOextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AhorcadoServicio as=new AhorcadoServicio();
        Ahorcado aho=as.crearJuego();
        
    }
    
}
