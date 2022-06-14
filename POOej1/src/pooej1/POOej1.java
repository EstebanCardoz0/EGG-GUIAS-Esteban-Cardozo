/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidades.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author Esteban
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        LibroServicio servi = new LibroServicio();
        Libro lib = servi.cargarlibro();
        
        
        
        
        
        
                servi.mostrarlibro(primerlib);
        
          // ServicioLibro serv = new ServicioLibro();
        //Libro lib = serv.CargarLibro();
        //serv.MostrarLibro(lib);
        
    }
    
}
