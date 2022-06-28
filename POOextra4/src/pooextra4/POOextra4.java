/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import Entidades.NIF;
import NIFservicio.NIFservicio;

/**
 *
 * @author Esteban
 */
public class POOextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFservicio ns=new NIFservicio();
        NIF nif=ns.crearNIF();
        ns.mostrar(nif);
        System.out.println("");
    }
    
}
