/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Revolver;
import java.util.Random;

/**
 *
 * @author Esteban
 */
public class RevolverServicio {
    
    Random aleatorio=new Random();
    
    public void llenarRevolver (Revolver rec){
    
        rec.setPosicionACT(1+aleatorio.nextInt(6));
        rec.setPosicionPlomo(1+aleatorio.nextInt(6));
    
    }
    
     public boolean tirar (Revolver rec){
    boolean aux;
         if (rec.getPosicionACT()==rec.getPosicionPlomo()) {
             aux=true;
         }else{
         aux=false;
         
         }
        return aux;   
    }
     
     public void siguientePlomo (Revolver rec){
    
         if (rec.getPosicionACT()!=6) {
            rec.setPosicionACT(rec.getPosicionACT()+1); 
         }else{
         rec.setPosicionACT(1);
         }
         
        
        
    
    }
    public void mostrarRevolver (Revolver rec){
        
        System.out.println("REVOLVER");
        System.out.println("Pos. actual: "+rec.getPosicionACT());
        System.out.println("Pos. plomo: "+rec.getPosicionPlomo());
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}// final clase
