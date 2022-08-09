/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej1;

import Entidades.Perro;
import Servicio.PerroServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ColeccionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer=new Scanner(System.in).useDelimiter("\n");

        ArrayList <Perro> perritos=new ArrayList();
        String resp = "r";
                PerroServicio ps=new PerroServicio();

        
        do {
             System.out.print("¿Desea ingresar una raza de perro? [S/N]: ");
            resp = leer.next();
            System.out.println();
            
                    
                    if (!resp.equalsIgnoreCase("N")) {
                                    ps.llenaRazas(perritos);

            }

            
            
            
        } while (!resp.equalsIgnoreCase("N"));
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("---Razas de la lista---");
        ps.muestraPerros(perritos);
        
        
        
        
        
        
        
        
        
    }////
    
}
