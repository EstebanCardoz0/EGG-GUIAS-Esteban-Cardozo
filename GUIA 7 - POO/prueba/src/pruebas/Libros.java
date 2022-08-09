/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Comparator;

/**
 *
 * @author Esteban
 */
public class Libros {
    
    String titulo;

    public Libros() {
    }

    public Libros(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Libros crearLibro(String titulo){
        
        
        
        
        return null;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + '}';
    }
    
    public static Comparator<Libros> compTitulo= new Comparator <Libros> () {
        @Override
        public int compare(Libros l1, Libros l2) {
            return l1.getTitulo().compareTo(l2.getTitulo());
             
    }
    
};
            
}//final
