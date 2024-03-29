/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.servicios;

import com.Noticias.entidades.Usuario;
import com.Noticias.entidades.imagen;
import com.Noticias.enumeraciones.Rol;
import com.Noticias.excepciones.MiExcepcion;
import com.Noticias.repositorios.ImagenRepositorio;
import com.Noticias.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Esteban
 */
@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private ImagenServicio imagenServicio;

    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String email, String password, String password2) throws MiExcepcion {

        validar(nombre, email, password, password2);
        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setEmail(email);

        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);

        imagen imagen = imagenServicio.guardar(archivo);

        usuario.setImagen(imagen);

        usuarioRepositorio.save(usuario);

    }

    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);
    }
    

    //@Transactional(readOnly=true)
    public List<Usuario> listarUsuarios() throws Exception {

        System.out.println("------------SERVICIO PROBANDO------------------");
        
        List<Usuario> usuarios = usuarioRepositorio.findAll();
        
        
//        if (usuarios.size()==0) {
//            throw new Exception("LA LISTA ESTÁ VACIA");
//        }
        return usuarios;
    }
    

    @Transactional
    public void actualizar(MultipartFile archivo, String id, String nombre, String email, String password, String password2) throws MiExcepcion {

        validar(nombre, email, password, password2);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setEmail(email);

            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuario.setRol(Rol.USER);

            String idImagen = null;

            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
            }

            imagen imagen = imagenServicio.actualizar(archivo, idImagen);

            usuario.setImagen(imagen);

            usuarioRepositorio.save(usuario);
        }

    }

        @Transactional
    public void cambiarRol(String id){
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
    	
    	if(respuesta.isPresent()) {
    		
    		Usuario usuario = respuesta.get();
    		
    		if(usuario.getRol().equals(Rol.USER)) {
    			
    		usuario.setRol(Rol.ADMIN);
    		
    		}else if(usuario.getRol().equals(Rol.ADMIN)) {
    			usuario.setRol(Rol.USER);
    		}
    	}
    }
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);

        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getEmail(), usuario.getPassword(), permisos);

        } else {

            return null;
        }

    }

    private void validar(String nombre, String email, String password, String password2) throws MiExcepcion {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiExcepcion("el nombre no puede ser nulo o estar vacio");

        }

        if (email.isEmpty() || email == null) {
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
