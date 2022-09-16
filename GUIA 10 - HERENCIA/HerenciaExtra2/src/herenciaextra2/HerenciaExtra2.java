/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HerenciaExtra2 {

//* 
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Edificio> catastro = new ArrayList();

        Edificio poli1 = new Polideportivo("Liceo", "Techado", 15, 5, 30);
        Edificio poli2 = new Polideportivo("Mil viviendas", "Abierto", 20, 7, 35);
        Edificio ofi1 = new EdificioDeOficinas("Catamarca", 4, 7, 4, 20, 4, 27);
        Edificio ofi2 = new EdificioDeOficinas("Anubis", 7, 10, 7, 21, 3, 23);

        catastro.add(poli1);
        catastro.add(poli2);
        catastro.add(ofi1);
        catastro.add(ofi2);

        for (Edificio edificio : catastro) {

            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            System.out.println("");
        }
        //Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.

        int contecho=0;
        int sintecho=0;
            
            for (Edificio edifi : catastro) {
                
                if (edifi instanceof Polideportivo) {
                    
                    if (((Polideportivo) edifi).getTipo().equalsIgnoreCase("techado")) {
                        contecho++;
                    }else{
                    sintecho++;
                    }
                    
                    
                }
            
        }
           System.out.println("Polideportivos techados: "+contecho); 
           System.out.println("Polideportivos abiertos: "+sintecho); 
           System.out.println("");
        
        for (Edificio edifi : catastro) {
            if (edifi instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) edifi).canPersonas();
            }
        }






    }//final main

}
