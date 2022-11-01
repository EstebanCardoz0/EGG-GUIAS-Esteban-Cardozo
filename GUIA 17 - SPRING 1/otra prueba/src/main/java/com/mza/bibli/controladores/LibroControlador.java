/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mza.bibli.controladores;

import com.mza.bibli.excepciones.MiException;
import com.mza.bibli.servicios.AutorServicio;
import com.mza.bibli.servicios.EditorialServicio;
import com.mza.bibli.servicios.LibroServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Usuario
 */

@Controller
@RequestMapping("/libro")
public class LibroControlador {
    
        @Autowired
    private LibroServicio libroServicio;
        @Autowired
    private AutorServicio autorServicio;
        @Autowired
    private EditorialServicio editorialServicio;
    
             @GetMapping ("/registrar") //localhost:8080/libro/registrar
    public String registrar() {
        return "libro_form.html";   

    }
         @PostMapping("/registro")
    public String registro (@RequestParam (required = false) Long isbn, @RequestParam(required=false)  String titulo,
            @RequestParam (required = false) Integer ejemplares,
            @RequestParam (required = false) String idAutor, @RequestParam (required = false) String idEditorial, ModelMap modelo){
        try {
            //System.out.println("nombre: "+nombre);
            
            libroServicio.crearLibro(isbn,titulo,ejemplares,idAutor,idEditorial);
            
            modelo.put("exito", "El libro fue cargado correctamente");
            
            
            
        } catch (MiException ex) {
         modelo.put("error",ex.getMessage());
                    return "libro_form.html";

        }
        
        return "index.html";
    }
        
        
}//final
