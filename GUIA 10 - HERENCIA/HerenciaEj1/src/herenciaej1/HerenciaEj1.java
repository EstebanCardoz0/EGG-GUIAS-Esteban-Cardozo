/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Usuario
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Animal perro1=new Perro("Oziko", "perro", "huesos", 8, "mestizo");
       perro1.alimentar();
        
       Animal perro2=new Perro("Negra", "perra", "alimento balanceado", 4, "mestiza");
       perro1.alimentar(); 
       
       Animal gato1=new Gato("Suri", "gata", "pescado", 1, "manchada");
       gato1.alimentar(); 
        
       Animal caballo1=new Caballo("Tornado", "caballo", "zanahorias", 10, "poderoso");
       caballo1.alimentar(); 
        
        
        
        
        
        
    }
    
}
