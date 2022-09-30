/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistencia;

import Libreria.entidades.Libro;

/**
 *
 * @author Esteban
 */
public class LibroDAO extends DAO {
    
    public void guardarLibro(Libro librito) {
        
        guardar(librito);
        
    }
    
    
    
    
    
}// final
