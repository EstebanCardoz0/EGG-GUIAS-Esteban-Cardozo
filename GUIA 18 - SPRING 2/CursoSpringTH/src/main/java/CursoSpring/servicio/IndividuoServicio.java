/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring.servicio;

import CursoSpring.domain.Individuo;
import java.util.List;

/**
 *
 * @author Esteban
 */
public interface IndividuoServicio {
    
    public List<Individuo> listarIndividuos();
    
    public void salvar(Individuo indi);
    public void borar(Individuo indi);
    public Individuo buscarIndividuo (Individuo indi);
    
     
    
    
    
    
}//final
