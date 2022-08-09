/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import Entidades.Operaciones;
import Servicio.OperacionesServicio;

/**
 *
 * @author Esteban
 */
public class POOej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionesServicio os=new OperacionesServicio();
        
        Operaciones op=new Operaciones();
                
           op=os.CrearOperacion();
       
        
        System.out.println("la suma de los números es: "+os.Sumar(op));
        System.out.println("la resta de los números es: "+os.Restar(op));
        System.out.println("la multiplicación de los números es: "+os.Multiplicar(op));
        System.out.println("la división de los números es: "+os.Dividir(op));
        
        System.out.println("-------------------");
      
        
         
    }
    
}
