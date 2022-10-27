/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mza.bibli.servicios;

import com.mza.bibli.entidades.Editorial;
import com.mza.bibli.excepciones.MiException;
import com.mza.bibli.repositorios.EditorialRepositorio;
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
public class EditorialServicio {

    @Autowired
    EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {
        
             if (nombre == null || nombre.isEmpty()) {
            throw new MiException("el nombre no puede ser nulo o estar vacio");
        }

        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);

        editorialRepositorio.save(editorial);

    }

    public List<Editorial> listarEditoriales() {

        List<Editorial> editoriales = new ArrayList();

        editoriales = editorialRepositorio.findAll();

        return editoriales;

    }

    public void modificarEditorial(String nombre, String id) throws MiException {
        
              if (nombre == null || nombre.isEmpty()) {
            throw new MiException("el nombre no puede ser nulo o estar vacio");
        }
               if (id == null || id.isEmpty()) {
            throw new MiException("el Id no puede ser nulo o estar vacio");
        }

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Editorial editorial = respuesta.get();

            editorial.setNombre(nombre);

            editorialRepositorio.save(editorial);

        }

    }

}//final
