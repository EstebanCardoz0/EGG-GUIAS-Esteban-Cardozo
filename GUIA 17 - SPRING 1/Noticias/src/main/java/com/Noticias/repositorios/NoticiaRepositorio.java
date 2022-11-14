/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.repositorios;

import com.Noticias.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository 
public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {
    
      @Override
    public default void delete(Noticia entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   @Query("SELECT n FROM Noticia n WHERE n.titulo= :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);  
    



//guardar, modificar, actualizar, dar de baja, consultar
    
    
}//FINAL
