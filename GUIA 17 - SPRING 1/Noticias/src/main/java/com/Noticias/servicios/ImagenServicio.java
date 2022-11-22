/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.servicios;

import com.Noticias.entidades.imagen;
import com.Noticias.excepciones.MiExcepcion;
import com.Noticias.repositorios.ImagenRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Esteban
 */
@Service
public class ImagenServicio {
    
    @Autowired
    private ImagenRepositorio imagenRepositorio;
    
    public imagen guardar(MultipartFile archivo) throws MiExcepcion {
        
        if (archivo != null) {
            try {
                imagen imagen = new imagen();
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                
                return imagenRepositorio.save(imagen);
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            
        }
        return null;
    }
    
    public imagen actualizar(MultipartFile archivo, String id) throws MiExcepcion{
    
       if (archivo != null) {
            try {
                imagen imagen = new imagen();
                
                if (id!=null) {
                    Optional <imagen> respuesta=imagenRepositorio.findById(id);
                    
                    if (respuesta.isPresent()) {
                        imagen= respuesta.get();
                    }
                }
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                
                return imagenRepositorio.save(imagen);
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            
        }
        return null; 
    
    
    }
    
}//final
