/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6;

import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class POOextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AhorcadoServicio as=new AhorcadoServicio();
        Ahorcado aho=as.crearJuego();
        System.out.println("---- . ----");
        as.longitud(aho);
        // System.out.println("---- . ----");
         System.out.println("---- AHORCARDO ----");
        
//System.out.println("---- . ----");

            
        while (aho.getJugadas()!=0) {
            System.out.println("Ingresá una letra");
            String letra=leer.next();
            as.buscar(aho,letra);
        as.encontradas(aho, letra);
        as.restantes(aho);
            if (aho.getEncontradas()==aho.getVector().length) {
                break;
            }
            System.out.println("------------------");
            
        }



        System.out.println("--- GAME OVER ---");
    }
    
}
