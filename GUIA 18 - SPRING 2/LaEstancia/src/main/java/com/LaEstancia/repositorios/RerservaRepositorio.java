/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LaEstancia.repositorios;

import com.LaEstancia.entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban
 */
@Repository
public interface RerservaRepositorio extends JpaRepository<Reserva, String> {
 
    
//crud
    
    
    
}