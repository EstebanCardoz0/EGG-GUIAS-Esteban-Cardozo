/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring;

import CursoSpring.domain.Individuo;
import java.util.ArrayList;
import java.util.List;
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

    @Value("${indice.hole}")
    private String holu;

    @GetMapping("/")
    public String comienzo(Model modelo) {

        String hola = "estamos probando msjes";

        Individuo indi = new Individuo();
        indi.setNombre("Antonio");
        indi.setApellido("Cardozo");
        indi.setEdad("27 años");
        indi.setCorreo("antonio@cardozo");
        indi.setTelefono("459295");

        Individuo indi2 = new Individuo();
        indi.setNombre("Sonia");
        indi.setApellido("Mendoza");
        indi.setEdad("52 años");
        indi.setCorreo("sonia@mendoza");
        indi.setTelefono("459296");
        
        List<Individuo> indis= new ArrayList();
        indis.add(indi);
        indis.add(indi2);
        
        //esta es otra manera de agregar a la lista
//        List indis= Arrays.asList(indi,indi2);

        log.info("este es el controler rest");

        modelo.addAttribute("ola", hola);
        modelo.addAttribute("holi", holu);
        modelo.addAttribute("indiv", indi);
        modelo.addAttribute("indis",indis);

        return "indice";
    }

}//final
