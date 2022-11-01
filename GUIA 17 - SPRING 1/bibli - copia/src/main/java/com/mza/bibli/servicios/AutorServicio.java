/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mza.bibli.servicios;

import com.mza.bibli.entidades.Autor;
import com.mza.bibli.excepciones.MiException;
import com.mza.bibli.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class AutorServicio {

    @Autowired
    AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MiException {
        
             if (nombre == null || nombre.isEmpty()) {
            throw new MiException("el nombre no puede ser nulo o estar vacio");
        }

        Autor autor = new Autor();

        autor.setNombre(nombre);

        autorRepositorio.save(autor);

    }

    public List<Autor> listarAutores() {

        List<Autor> autores = new ArrayList();

        autores = autorRepositorio.findAll();

        return autores;

    }

    public void modificarAutor(String nombre, String id) throws MiException {
        
             if (nombre == null || nombre.isEmpty()) {
            throw new MiException("el nombre no puede ser nulo o estar vacio");
        }
               if (id == null || id.isEmpty()) {
            throw new MiException("el Id no puede ser nulo o estar vacio");
        }

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }

    }

}//FINAL
