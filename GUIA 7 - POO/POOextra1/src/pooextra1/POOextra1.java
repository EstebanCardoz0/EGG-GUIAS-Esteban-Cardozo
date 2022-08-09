/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra1;

import Entidades.Cancion;
import Servicio.CancionServicio;

/**
 *
 * @author Esteban
 */
public class POOextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CancionServicio cs=new CancionServicio();
        Cancion rola=cs.crearCancion();
        cs.llenarCancion(rola);
    }
    
}
