/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring;

import CursoSpring.domain.Individuo;
import lombok.extern.slf4j.Slf4j;
import CursoSpring.servicio.IndividuoServicio;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Esteban
 */
@Controller
@Slf4j
public class ControladorREST {

    @Autowired
    private IndividuoServicio indiServicio;

//    @Value("${indice.hole}")
//    private String holu;
    @GetMapping("/")
    public String comienzo(Model modelo) {

//        Iterable<Individuo> indis = indiDao.findAll();
        List<Individuo> indis = indiServicio.listarIndividuos();

        //  Iterable<Individuo> indis= indiDao.findAll();
//           String hola = "estamos probando msjes";
//        Individuo indi = new Individuo();
//        indi.setNombre("Antonio");
//        indi.setApellido("Cardozo");
//        indi.setEdad("27 años");
//        indi.setCorreo("antonio@cardozo");
//        indi.setTelefono("459295");
//
//        Individuo indi2 = new Individuo();
//        indi2.setNombre("Sonia");
//        indi2.setApellido("Mendoza");
//        indi2.setEdad("52 años");
//        indi2.setCorreo("sonia@mendoza");
//        indi2.setTelefono("459296");
//        List<Individuo> indis = new ArrayList();
//        indis.add(indi);
//        indis.add(indi2);
        //esta es otra manera de agregar a la lista
//        List indis= Arrays.asList(indi,indi2);
        log.info("este es el controler rest");

//        modelo.addAttribute("ola", hola);
//        modelo.addAttribute("holi", holu);
//        modelo.addAttribute("indiv", indi);
        modelo.addAttribute("indis", indis);

        return "indice";
    }
    
    @GetMapping("/anexar")
    public String anexar(Individuo individuo){
    
    return "cambiar.html";
    }
    
    @PostMapping("/salvar")
    public String salvar (@Valid Individuo indi, Errors error){
        
        if (error.hasErrors()) {
        return "cambiar";    
        }
        
    indiServicio.salvar(indi);
     //   System.out.println(indi.toString() +" eso es lo que se guardó");
    return "redirect:/";
    }

    @GetMapping("/cambiar/{id_individuo}")
    public String cambiar (Individuo individuo, Model modelo){
    
       individuo= indiServicio.buscarIndividuo(individuo);
    modelo.addAttribute("indis", individuo);
    return "cambiar";
    }
    
    @GetMapping//("/borrar/{id_individuo}")
    ("/borrar")
    public String borrar(Individuo individuo, Model modelo){
    
        indiServicio.borar(individuo);
    return "redirect:/";
    }
    
}//final
