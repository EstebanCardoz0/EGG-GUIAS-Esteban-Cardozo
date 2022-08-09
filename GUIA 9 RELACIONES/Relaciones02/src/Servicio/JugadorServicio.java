/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Jugador;
import Entidades.Revolver;

/**
 *
 * @author Esteban
 */
public class JugadorServicio {
    
    RevolverServicio rs=new RevolverServicio();
    
    public boolean disparo(Revolver rec,Jugador jug,RevolverServicio rs){
        boolean aux;
        if (rs.tirar(rec)==true) {
            jug.setMojado(false);
            aux=true;
            
        }else{
        aux=false;
        }
        
        
        
        
        
        return aux;
    
    }
    
}
