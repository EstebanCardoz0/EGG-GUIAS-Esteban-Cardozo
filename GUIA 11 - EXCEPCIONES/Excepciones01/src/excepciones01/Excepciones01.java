/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones01;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 * @author Esteban
 */
public class Excepciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        
       
        
        try{
        
        System.out.println("--- PERSONA 1 ---");
       // Persona per1 = ps.crearPersona();
        Persona per1 = null;
        //int per1imc = ps.calcularIMC(per1);
        boolean per1may = ps.esMayorDeEdad(per1);
        //System.out.println(per1imc);
        }catch(NullPointerException a){
            System.out.println("la persona es nula");
        }
        
        
//        System.out.println("--- PERSONA 2 ---");
//        Persona per2 = ps.crearPersona();
//        int per2imc = ps.calcularIMC(per2);
//        boolean per2may = ps.esMayorDeEdad(per2);
//        System.out.println("--- PERSONA 3 ---");
//
//        Persona per3 = ps.crearPersona();
//        int per3imc = ps.calcularIMC(per3);
//        boolean per3may = ps.esMayorDeEdad(per3);
//        System.out.println("--- PERSONA 4 ---");
//        Persona per4 = ps.crearPersona();
//        int per4imc = ps.calcularIMC(per4);
//        boolean per4may = ps.esMayorDeEdad(per4);
//
//        int pesoIdeal = 0;
//        int sobrepeso = 0;
//        int pocopeso = 0;
//        int mayores = 0;
//        int menores = 0;
//        int auxPeso[] = new int[4];
//        auxPeso[0] = (int) per1imc;
//        auxPeso[1] = (int) per2imc;
//        auxPeso[2] = (int) per3imc;
//        auxPeso[3] = (int) per4imc;
//       // System.out.println(auxPeso[0]);
//       //HASTA ACÁ ME TOMA
// 
//       
//       
//       
//       
//       //EL PROBLEMA ESTÁ ACÁ
//       for (int i = 0; i < 4; i++) {
//            if (auxPeso[i]==-1) {
//                pocopeso = pocopeso+1;
//                
//            }
//            if (auxPeso[i]==1) {
//                sobrepeso = sobrepeso+1;
//                
//            }
//            if (auxPeso[i]==0) {
//                pesoIdeal = pesoIdeal+1;
//                
//            }
//            
//        }
////        System.out.println("p"+pocopeso);
////        System.out.println("i"+pesoIdeal);
////        System.out.println("s"+sobrepeso);
//        boolean auxMayor[] = new boolean[4];
//        auxMayor[0] = (boolean) per1may;
//        auxMayor[1] = (boolean) per2may;
//        auxMayor[2] = (boolean) per3may;
//        auxMayor[3] = (boolean) per4may;
//        for (int i = 0; i < 4; i++) {
//            if (auxMayor[i] == true) {
//                mayores++;
//            } else {
//                menores++;
//            }
//
//        }
//        System.out.println("");
//        System.out.println("--- CONCLUSIONES ---");
//        System.out.println("Peso:");
//        System.out.println("cantidad de personas con bajo peso: "+pocopeso+ "("+(pocopeso*100)/4+"%)");
//        System.out.println("cantidad de personas con peso ideal: "+pesoIdeal+ "("+(pesoIdeal*100)/4+"%)");
//        System.out.println("cantidad de personas con sobrepeso: "+sobrepeso+ "("+(sobrepeso*100)/4+"%)");
//        System.out.println("Edad:");
//                System.out.println("cantidad de personas mayores de edad: "+mayores+ "("+(mayores*100)/4+"%)");
//                System.out.println("cantidad de personas menores de edad: "+menores+ "("+(menores*100)/4+"%)");
//
//        
        
    }
    
}
