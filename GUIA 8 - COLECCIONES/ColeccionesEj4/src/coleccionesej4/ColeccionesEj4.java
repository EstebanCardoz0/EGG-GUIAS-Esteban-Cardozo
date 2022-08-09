/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;

import Entidades.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ColeccionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Pelicula> peli=new ArrayList ();
        ServicioPelicula ps=new ServicioPelicula();
        
        String aux="";
               Scanner leer = new Scanner(System.in).useDelimiter("\n");

        
        while (!aux.equalsIgnoreCase("n")) {
            peli.add(ps.crearPeli());
            System.out.print("¿Ingresar otra peli? (S/N): ");
            aux=leer.next();
            System.out.println("");
        }
        
        ps.mostrarPeli(peli);
        ps.unaHora(peli);
        ps.duracionOrden(peli);
        ps.duracionOrdenMenos(peli);
        ps.tituloOrden(peli);
        ps.directorOrden(peli);
        
        System.out.println("");
        
    }//final main
    
}
