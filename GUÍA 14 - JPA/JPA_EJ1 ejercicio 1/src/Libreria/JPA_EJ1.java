/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.servicios.AutorServicio;
import Libreria.servicios.EditorialServicio;
import Libreria.servicios.LibroServicio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Esteban
 */
public class JPA_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_EJ1PU");
        EntityManager em = emf.createEntityManager();
        
  Menu m = new Menu();

        m.menu( );

//        AutorServicio au = new AutorServicio();
//        EditorialServicio eu = new EditorialServicio();
//        LibroServicio lu = new LibroServicio();
//
//        Autor aut1 = au.creaAutor("J.R.R. TOLKIEN");
//        Autor aut2 = au.creaAutor("GABRIEL GARCIA MARQUEZ");
//        Autor aut3 = au.creaAutor("PAULO COHELO");
//        Autor aut4 = au.creaAutor("JORGE LUIS BORGES");
//        Autor aut5 = au.creaAutor("OSCAR WILDE");
//
//        Editorial edit1 = eu.creaEditorial("Minotauro");
//        Editorial edit2 = eu.creaEditorial("Sudamericana");
//        Editorial edit3 = eu.creaEditorial("Penguin Random House");
//        Editorial edit4 = eu.creaEditorial("Bruguera");
//        Editorial edit5 = eu.creaEditorial("Planeta");
//        Editorial edit7 = eu.creaEditorial("Emece");
//        Editorial edit8 = eu.creaEditorial("Siruela");
//        Editorial edit9 = eu.creaEditorial("Companhia das Letras");
//        Editorial edit10 = eu.creaEditorial("New Directions");
//        Editorial edit11 = eu.creaEditorial("Lippincott's Monthly Magazine");
//        Editorial edit12 = eu.creaEditorial("Santillana");
//        Editorial edit13 = eu.creaEditorial("Estrada");
//        Editorial edit14 = eu.creaEditorial("Combel");
//        
//        Libro lb1 = lu.creaLibro("El señor de los anillos", 1937, aut1, edit1);
//        Libro lb2 = lu.creaLibro("El señor de los anillos 2", 1939,  aut1, edit1);
//        Libro lb3 = lu.creaLibro("El señor de los anillos 3", 1940,  aut1, edit1);
//        Libro lb4 = lu.creaLibro("Cien años de soledad", 1967, aut2, edit2);
//        Libro lb5 = lu.creaLibro("El amor en tiempos del colera", 1985, aut2, edit3);
//        Libro lb6 = lu.creaLibro("Cronica de una muerte anunciada", 1981, aut2, edit4);
//        Libro lb7 = lu.creaLibro("Del amor y otros demonios", 1994, aut2, edit2);
//        Libro lb8 = lu.creaLibro("El alquimista", 1988,  aut3, edit5);
//        Libro lb9 = lu.creaLibro("Veronika decide morir", 1998, aut3, edit5);
//        Libro lb10 = lu.creaLibro("Adulterio", 2014, aut3, edit5);
//        Libro lb11 = lu.creaLibro("Manual del guerrero de la luz", 1997, aut3, edit7);  
//        Libro lb12 = lu.creaLibro("Ficciones", 1944, aut3, edit7);
//        Libro lb13 = lu.creaLibro("La Biblioteca de Babel", 1941, aut4, edit8);
//        Libro lb14 = lu.creaLibro("El Libro de arena", 1975, aut4, edit7);
//        Libro lb15 = lu.creaLibro("El hacedor", 1917,  aut4, edit2);
//        Libro lb16 = lu.creaLibro("Labyrinths", 1962,  aut4, edit10);
//        Libro lb17 = lu.creaLibro("El retrato de Dorian Gray", 1890,  aut5, edit11);
//        Libro lb18 = lu.creaLibro("El principe feliz y otros cuentos", 1888,  aut5, edit12);
//        Libro lb19 = lu.creaLibro("El fantasma de Canterville", 1887, aut5, edit13);
//        Libro lb20 = lu.creaLibro("El gigante egoista", 1888, aut5, edit14);
//        

    }//final

}
