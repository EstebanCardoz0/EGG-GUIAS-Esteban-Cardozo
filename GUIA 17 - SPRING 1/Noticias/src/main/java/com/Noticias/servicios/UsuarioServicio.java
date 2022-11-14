/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.servicios;

import com.Noticias.entidades.Usuario;
import com.Noticias.enumeraciones.Rol;
import com.Noticias.excepciones.MiExcepcion;
import com.Noticias.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


/**
 *
 * @author Esteban
 */
@Service
public class UsuarioServicio //implements UserDetailsService 
{

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
                 
            
           

    @Transactional
    public void registrar(String nombre, String email, String password, String password2) throws MiExcepcion {


            
        validar(nombre, email, password, password2);
        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setEmail(email);

        usuario.setPassword(password);
        usuario.setRol(Rol.USER);

        usuarioRepositorio.save(usuario);

    }

//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//
//        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
//
//        if (usuario != null) {
//            List<GrantedAuthority> permisos = new ArrayList<>();
//            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
//            permisos.add(p);
//
////              ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
////
////            HttpSession sesion = attr.getRequest().getSession(true);
//            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
//
//        } else {
//
//            return null;
//        }
//
//    }

    private void validar(String nombre, String email, String password, String password2) throws MiExcepcion {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiExcepcion("el nombre no puede ser nulo o estar vacio");

        }

        if (nombre.isEmpty() || nombre == null) {
            throw new MiExcepcion("el email no puede ser nulo o estar vacio");

        }

        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiExcepcion("La contraseña no puede estar vacia y debe tener mas de 5 digitos");
        }

        if (!password.equals(password2)) {
            throw new MiExcepcion("Las contraseñas ingresadas deben ser iguales");
        }
    }
    

    
    
    
}//final