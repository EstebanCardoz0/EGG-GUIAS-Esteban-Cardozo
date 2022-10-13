/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhcp;

import Entidad.Cancion;
import Entidad.CancionJpaController;

/**
 *
 * @author Usuario
 */
public class RHCP {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        CancionJpaController can=new CancionJpaController();
        
        Cancion c=new Cancion();
        c.setNombre("Eddie");
        c.setDisco_id(13);
        can.create(c);
        
        
        
        
        
        
    }//final
    
}
