/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.repositorios;

import com.Noticias.entidades.imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban
 */
@Repository
public interface ImagenRepositorio extends JpaRepository<imagen, String> {
    
    
    
    
    
    
    
}//final
