/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

//    Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para operar
//con la vista del usuario diseñada para la gestión de noticias (guardar/modificar noticia, listar
//noticias, dar de baja, etc).
    @GetMapping("/guardar") //localhost:8080/autor/guardar
    public String guardar() {
        return "noticia_form.html";

    }
    
    @PostMapping("/guardado")
    public String guardado(@RequestParam String titulo,@RequestParam String cuerpo){
    
       System.out.println("TITULO ====== "+titulo);
        System.out.println("CUERPO ====== "+cuerpo);
        
        
        
    return "noticia_form.html";     
    }
    

}//FINAL
