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
        System.out.println("por favor, rellene los datos del libro");
        System.out.println("");
        System.out.print("título del libro: ");
        String titulo=leer.nextLine();
        System.out.println("");
        System.out.print("autor: ");
        String autor=leer.nextLine();
        System.out.println("");
        System.out.print("número de páginas: ");
        int numpag=leer.nextInt();
         System.out.println("");
        System.out.print("número de páginas: ");
        int ISBN=leer.nextInt();
         return new Libro( ISBN,  titulo,  autor,  numpag);
        
        
    }
    public void mostrarlibro(Libro lib) {
        System.out.println("título del libro: "+lib.titulo);
        System.out.println("autor: "+lib.autor);
        System.out.println("número de páginas: "+lib.numpag);
        System.out.println("ISBN: "+lib.ISBN);
    
    
    
    }
    
}
