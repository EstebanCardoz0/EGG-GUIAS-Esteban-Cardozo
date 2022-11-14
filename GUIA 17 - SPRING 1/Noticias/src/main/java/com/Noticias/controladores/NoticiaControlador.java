/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.controladores;

import com.Noticias.entidades.Noticia;
import com.Noticias.excepciones.MiExcepcion;
import com.Noticias.servicios.NoticiaServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private NoticiaServicio notiServicio;

    // Esta clase tiene la responsabilidad de llevar adelante las funcionalidades
    // necesarias para operar
    // con la vista del usuario diseñada para la gestión de noticias
    // (guardar/modificar noticia, listar
    // noticias, dar de baja, etc).
    @GetMapping("/guardar") // localhost:8080/autor/guardar
    public String guardar() {

        return "noticia_form.html";

    }

    @PostMapping("/guardado")
    public String guardado(@RequestParam String titulo, @RequestParam String cuerpo, @RequestParam String foto,
            ModelMap modelo) {

        // System.out.println("TITULO ====== " + titulo);
        // System.out.println("CUERPO ====== " + cuerpo);
        // System.out.println("FOTO ====== " + foto);
        try {
            notiServicio.crearNoticia(titulo, cuerpo, foto);
            modelo.put("exito", "Salió todo bien rey");

        } catch (MiExcepcion ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";
        }

        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Noticia> noticias = notiServicio.listarNoticias();

        modelo.addAttribute("noticias", noticias);
        return "noticia_list.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("noticia", notiServicio.getOne(id));

        return "noticia_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo, String foto,
            ModelMap modelo) {

        try {
            notiServicio.modificarNoticia(id, titulo, cuerpo, foto);
            return "redirect:../lista";
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return "noticia_modificar.html";
        }

    }

}// FINAL
