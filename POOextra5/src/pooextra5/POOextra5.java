/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;

import Entidades.Mes;
import Servicio.MesServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POOextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mes mesito=new Mes();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--- ADIVINÁ EL MES SECRETO ---");
           String apuesta="";
        while (!apuesta.equals(mesito.getSecreto())) {
             System.out.print("Arriesgá: ");
            apuesta=leer.nextLine();
            if (apuesta.equals(mesito.getSecreto())) {
                System.out.println("¡ADIVINASTE!");
            }else{
             System.out.println("Mmm no, probá de nuevo");
            }
        }
        
        
        
        
        
        
    }    
    }
        
//        MesServicio ms = new MesServicio();
//        ms.llenarMes();
//        String secreto="";
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        String apuesta="";
//        System.out.println("--- ADIVINÁ EL MES SECRETO ---");
//        while (!"enero".equals(apuesta)) {
//            System.out.print("Arriesgá: ");
//            apuesta=leer.nextLine();
//            if ("enero".equals(apuesta)) {
//                System.out.println("¡ADIVINASTE!");
//            }else{
//                System.out.println("Mmm no, probá de nuevo");
//            }
//        }
//
//    }


