/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.Scanner;
import Entidades.Libro;
/**
 *
 * @author Esteban
 */
public class LibroServicio {
    
      Scanner leer = new Scanner(System.in);
    
     public Libro cargarlibro() {
         Libro cargarlibro=new Libro();
        System.out.println("por favor, rellene los datos del libro");
        System.out.println("");
        System.out.print("título del libro: ");
        cargarlibro.setTitulo(leer.nextLine());
        
        System.out.print("autor: ");
                cargarlibro.setAutor(leer.nextLine());

       
        System.out.print("número de páginas: ");
        cargarlibro.setNumpag(leer.nextInt());
        
        System.out.print("ISBN: ");
        cargarlibro.setISBN(leer.nextInt());
         return cargarlibro ;
        
        
    }
    public void mostrarlibro(Libro cargarlibro) {
        System.out.println("INFO DEL LIBRO:");
        System.out.println("");
        System.out.println("título del libro: "+cargarlibro.getTitulo());
        System.out.println("autor: "+cargarlibro.getAutor());
        System.out.println("número de páginas: "+cargarlibro.getNumpag());
        System.out.println("ISBN: "+cargarlibro.getISBN());
    
    
    
    }
    
}
