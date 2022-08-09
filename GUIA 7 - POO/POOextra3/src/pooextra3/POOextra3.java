/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra3;

import Entidades.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author Esteban
 */
public class POOextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServicio rs=new RaicesServicio();
        
        Raices raiz=rs.crearRaices();
        System.out.println("---  .  ---");
        rs.getDiscriminante(raiz);
        //rs.tieneRaices(raiz);
        //rs.tieneRaiz(raiz);
        rs.calcular(raiz);
    }
    
}
