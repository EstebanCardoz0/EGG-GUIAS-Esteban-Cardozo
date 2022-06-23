/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import Entidades.Punto;
import Servicio.PuntoServicio;

/**
 *
 * @author Esteban
 */
public class POOextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       PuntoServicio ps=new PuntoServicio();
       Punto puntito=ps.crearPunto();
        System.out.println("---");
        ps.calcularDistancia(puntito);
       
       
    }
    
}
