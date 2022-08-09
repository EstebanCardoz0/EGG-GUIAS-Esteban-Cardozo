/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class CancionServicio {
    
    public Cancion crearCancion (){
        Cancion can=new Cancion();
        
        
        
        
        return can;
    
    }
    public void llenarCancion(Cancion can){
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("¿Cómo se llama la canción?");
    can.setTitulo(leer.nextLine());
        System.out.println("¿Cómo se llama el artista o banda?");
    can.setAutor(leer.nextLine());
    
    }
    
}
