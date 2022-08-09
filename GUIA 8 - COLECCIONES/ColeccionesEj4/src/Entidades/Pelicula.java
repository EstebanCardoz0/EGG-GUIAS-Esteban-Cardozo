/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación:
 *
 * @author Esteban
 */
public class Pelicula {

    String titulo;
    String direccion;
    Integer duracion;

    public Pelicula(String titulo, String direccion, Integer duracion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return titulo + ". dir. " + direccion + ". " + duracion + " hs.";
    }

    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //ARREGLAR ESTO   
    };//final comparator
public static Comparator<Pelicula> compararDuracionMenos = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //ARREGLAR ESTO   
    };//final comparator
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //ARREGLAR ESTO   
    };//final comparator
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDireccion().compareTo(t1.getDireccion());
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //ARREGLAR ESTO   
    };//final comparator
    
    
    
}//final clase
