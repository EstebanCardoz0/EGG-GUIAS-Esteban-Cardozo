/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.controladores;

import com.Noticias.entidades.Usuario;
import com.Noticias.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Esteban
 */
@Controller
@RequestMapping("/admin")
public class AdminControlador {

    private UsuarioServicio usuarioServicio;

    @GetMapping("/dashboard")
    public String panelAdministrativo() {

        return "panel.html";
    }

    
    @GetMapping("/usuarios")
    public String listar(ModelMap modelo) {
         
        System.err.println("HOLA ESTOY PROBANDO");
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        modelo.addAttribute("usuarios", usuarios);
    
    return "usuario_list";
    }
    
      @GetMapping("/modificarRol/{id}")
    public String cambiarRol(@PathVariable String id) {

       usuarioServicio.cambiarRol(id);
    
    return "redirect:/admin/usuarios";
    }

}//final