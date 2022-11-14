/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

import Curso.domain.Individuo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Esteban
 */
@Controller
@Slf4j
public class ControladorREST {
    
    @Value("${indice.hola2}")
    private String hola2;
    
    @GetMapping("/")
    
    public String primerComienzo(Model modelo) {
        
        String hola = "hola mundo con spring boot";
        
        Individuo indi = new Individuo();
        
        indi.setNombre("Antonio");
        indi.setApellido("Valencia");
        indi.setCorreo("avalencia@bdc.com");
        log.info("Estoy ejecutando el controlador spring mvc");
        indi.setTelefono("8877665544");
        indi.setEdad("35 años");
        
        modelo.addAttribute("hol", hola);
        modelo.addAttribute("hola1", hola2);
        modelo.addAttribute("individuo", indi);
        
        
        return "indice";
        
    }
    
}
