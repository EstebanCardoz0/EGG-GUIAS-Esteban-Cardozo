/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

import Curso.domain.Individuo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban
 */
@Controller
@Slf4j
public class ControladorREST {

//    @Value("${indice.hola2}")
//    private String hola2;

    @GetMapping("/")
    public String primerComienzo(Model modelo) {

        String hola = "hola mundo con spring boot";

        Individuo individuo = new Individuo();

        individuo.setNombre("Antonio");
        individuo.setApellido("Valencia");
        individuo.setCorreo("avalencia@bdc.com");
        individuo.setTelefono("8877665544");
        individuo.setEdad("35 años");

        Individuo individuo2 = new Individuo();

        individuo2.setNombre("walter");
        individuo2.setApellido("cardozo");
        individuo2.setCorreo("walter@cardozo");
        individuo2.setTelefono("8877665544");
        individuo2.setEdad("58 años");

//        List<individuo> individuos= new ArrayList();
//        individuos.add(indi);
//        individuos.add(indi2);
        List individuos = Arrays.asList(individuo, individuo2);

//        log.info("Estoy ejecutando el controlador spring mvc");
//        modelo.addAttribute("hola", hola);
//        modelo.addAttribute("hola2", hola2);
        modelo.addAttribute("individuo", individuo);
        modelo.addAttribute("individuos", individuos);

        return "indice.html";

    }

}
