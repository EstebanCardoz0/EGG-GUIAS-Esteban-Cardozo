/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class POOej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio ps=new PersonaServicio();
        Persona per=ps.crearPersona();
               ps.calcularEdad(per);
               ps.menorQue(per, 22);
               System.out.println("");
               ps.mostrarPersona(per);
               
               
               
//               switch (ps.menorQue(per,20)) {
//                   case 1:
//                            System.out.println(per.getNombre()+" es menor que fulanito, que tiene 20");
//
//                break;
//                   case 2:
//                                    System.out.println(per.getNombre()+" y fulanito tienen la misma edad");
//
//                break;
//                   case 3:
//                                    System.out.println(per.getNombre()+" es mayor que fulanito, que tiene 20");
//
//                break;
            
        
        
    }
    
}
