/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticia.noticia.servicios;

import com.noticia.noticia.entidades.Noticia;
import com.noticia.noticia.excepciones.MiExcepcion;
import com.noticia.noticia.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Optional;
import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esteban
 */
@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(Long id, String titulo, String cuerpo, String foto) throws MiExcepcion {
        validar(id, titulo, cuerpo, foto);
        Noticia noticia = new Noticia(id, titulo, cuerpo, foto);

        noticiaRepositorio.save(noticia);

    }

    public List<Noticia> listarNoticias() {

        List<Noticia> noticias = new ArrayList();

        noticias = noticiaRepositorio.findAll();
        return noticias;

    }

    @Transactional
    public void modificarNoticia(Long id, String titulo, String cuerpo, String foto) throws MiExcepcion {

        validar(id, titulo, cuerpo, foto);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();

            noticia.setTitulo(titulo);
            noticia.setFoto(foto);
            noticia.setCuerpo(cuerpo);

            noticiaRepositorio.save(noticia);

        }

    }

    private void validar(Long id, String titulo, String cuerpo, String foto) throws MiExcepcion {

        if (id == null) {
            throw new MiExcepcion("El ID no puede ser nulo mijo/a");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new MiExcepcion("El titulo no puede ser nulo mijo/a");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiExcepcion("El cuerpo no puede ser nulo mijo/a");
        }
        if (foto == null || foto.isEmpty()) {
            throw new MiExcepcion("La foto no puede ser nula mijo/a");
        }

    }

}//final
