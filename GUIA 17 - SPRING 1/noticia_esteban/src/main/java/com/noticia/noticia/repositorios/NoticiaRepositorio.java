/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticia.noticia.repositorios;

import com.noticia.noticia.entidades.Noticia;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Esteban
 */
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long> {

    @Override
    public default void delete(Noticia entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//        @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
//   public Libro buscarPorTitulo(@Param("titulo") String titulo);
//    
//    
   @Query("SELECT n FROM Noticia n WHERE n.titulo= :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);
    



//guardar, modificar, actualizar, dar de baja, consultar


    
    


    
    

 
    
    
    

    
    
    
}//final
