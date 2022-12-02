/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LaEstancia.servicios;

import com.LaEstancia.entidades.Usuario;
import com.LaEstancia.repositorios.UsuarioRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 *
 * @author Esteban
 */
@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuRep;
    
    
    
    @Transactional
    public Usuario guardarUsuario(String alias,String email, String clave,Date fechaAlta, Date fechaBaja){
    
        Usuario usuario=new Usuario();
        
        usuario.setAlias(alias);
        usuario.setClave(new BCryptPasswordEncoder().encode(clave));
        usuario.setEmail(email);
        usuario.setFechaAlta(fechaAlta);
        usuario.setFechaBaja(fechaBaja);
    
    return usuRep.save(usuario);
    }
    
    
    
    
}//final
