/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban
 */
@RestController
@Slf4j
public class ControladorREST {
    
    @GetMapping("/")
    public String comienzo(){
    
        log.info("este es el controler rest");
        log.debug("MAS INFO");
    return "hola mundo";
    }
    
    
    
    
    
    
    
    
}//final
