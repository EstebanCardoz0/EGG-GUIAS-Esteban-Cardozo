/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LaEstancia.servicios;

import com.LaEstancia.entidades.Usuario;
import com.LaEstancia.excepciones.ExcepcionEstancia;
import com.LaEstancia.repositorios.UsuarioRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;



/**
 *
 * @author Esteban
 */
@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuRep;
    
    
    
    @Transactional
    public void guardarUsuario(String alias,String email, String clave,Date fechaAlta, Date fechaBaja){
    
        Usuario usuario=new Usuario();
        
        usuario.setAlias(alias);
        usuario.setClave(clave);
        usuario.setEmail(email);
        usuario.setFechaAlta(fechaAlta);
        usuario.setFechaBaja(fechaBaja);
    
    usuRep.save(usuario);
    }
    
@Transactional(readOnly=true)
    public List <Usuario> listarUsuarios(){
    
    List<Usuario> usuarios= usuRep.findAll();
    
    
    return usuarios;
    
    }
    
    @Transactional
    public void actualizarUsuario(String alias,String email, String clave,String clave2,Date fechaAlta, Date fechaBaja){
    
        Usuario usuario=new Usuario();
        
        usuario.setAlias(alias);
        usuario.setClave(clave);
        usuario.setEmail(email);
        usuario.setFechaAlta(fechaAlta);
        usuario.setFechaBaja(fechaBaja);
    
    usuRep.save(usuario);
    }
    
    
    private void validar(String alias, String email, String clave, String clave2,Date fechaAlta, Date fechaBaja) throws ExcepcionEstancia{
    
        if (alias.isEmpty()||alias==null) {
            throw new ExcepcionEstancia("El alias no puede estar nulo o vacio");
        }
        if (email.isEmpty()||email==null) {
            throw new ExcepcionEstancia("El email no puede estar nulo o vacio");
        }
        if (clave.isEmpty()||clave==null || clave.length() <= 5) {
            throw new ExcepcionEstancia("La clave no puede estar nula o vacia y debe tener más de 5 caracteres");
        }
        if (fechaAlta==null) {
            throw new ExcepcionEstancia("Fecha nula");
        }
        if (!clave2.equals(clave)) {
            throw new ExcepcionEstancia("Las claves ingresadas deben ser iguales");
        }
        if (fechaBaja==null) {
            throw new ExcepcionEstancia("Fecha nula");
        }
    
    
    
    }
    
}//final
