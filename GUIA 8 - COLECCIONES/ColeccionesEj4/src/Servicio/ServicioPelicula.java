/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pelicula;
import static Entidades.Pelicula.compararDirector;
import static Entidades.Pelicula.compararDuracion;
import static Entidades.Pelicula.compararDuracionMenos;
import static Entidades.Pelicula.compararTitulo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

import static java.util.Spliterators.iterator;

/**
 *
 * @author Esteban
 */
public class ServicioPelicula {

//    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
    public Pelicula crearPeli() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la info de la peli");
        System.out.print("TÍTULO: ");
        String titulo = leer.next();
        
        System.out.print("DIRECTOR: ");
        String director = leer.next();
        
        System.out.print("DURACIÓN (hs): ");
        Integer duracion = leer.nextInt();
        
        System.out.println("");
        return new Pelicula(titulo, director, duracion);

    }//final crear peli

//    • Mostrar en pantalla todas las películas.
    public void mostrarPeli(ArrayList<Pelicula> peli) {
        System.out.println("----LISTA COMPLETA----");
        System.out.println("");
        for (int i = 0; i < peli.size(); i++) {

            System.out.println(peli.get(i));

        }
        System.out.println("");

    }

//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void unaHora(ArrayList<Pelicula> peli) {
         System.out.println("----DURAN + DE 1 HORA----");
        System.out.println("");
       // Iterator it = peli.iterator();
        for (int i = 0; i < peli.size(); i++) {
            if (peli.get(i).getDuracion()>1) {
                System.out.println(peli.get(i));
            }
        }
        System.out.println("");
    }

//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void duracionOrden(ArrayList<Pelicula> peli) {
         System.out.println("----RANKING DE + DURACIÓN----");
        System.out.println("");
        
        peli.sort(compararDuracion);
       
        for (int i = 0; i < peli.size(); i++) {
            
                System.out.println(peli.get(i));
            
        }
        System.out.println("");
    }
    
    
    
    
    
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
      public void duracionOrdenMenos(ArrayList<Pelicula> peli) {
         System.out.println("----RANKING DE - DURACIÓN----");
        System.out.println("");
        
        peli.sort(compararDuracionMenos);
       
        for (int i = 0; i < peli.size(); i++) {
            
                System.out.println(peli.get(i));
            
        }
        System.out.println("");
    }
    
    
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
      
      public void tituloOrden(ArrayList<Pelicula> peli) {
         System.out.println("----ORDEN POR TÍTULO----");
        System.out.println("");
        
        peli.sort(compararTitulo);
       
        for (int i = 0; i < peli.size(); i++) {
            
                System.out.println(peli.get(i));
            
        }
        System.out.println("");
    }
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
      public void directorOrden(ArrayList<Pelicula> peli) {
         System.out.println("----ORDEN POR DIRECTOR----");
        System.out.println("");
        
        peli.sort(compararDirector);
       
        for (int i = 0; i < peli.size(); i++) {
            
                System.out.println(peli.get(i));
            
        }
        System.out.println("");
    }
}//final clase
