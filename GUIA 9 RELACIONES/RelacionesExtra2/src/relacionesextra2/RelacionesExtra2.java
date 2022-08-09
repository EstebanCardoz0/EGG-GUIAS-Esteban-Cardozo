/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesextra2;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Servicio.cepServicio;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class RelacionesExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         cepServicio cs = new cepServicio();
        
        Cine c = cs.abrirCine();
        
        ArrayList<Espectador> e = cs.crearPosiblesEspectadores();
        
        cs.recibirPosiblesEspectadores(c, e);
        
        cs.verSala(c);
        
        cs.revisarEspectadores(c);
        
        
        
        

    }//final main
        

}
