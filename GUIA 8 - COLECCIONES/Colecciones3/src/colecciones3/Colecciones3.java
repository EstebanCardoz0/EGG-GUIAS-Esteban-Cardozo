/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                            Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoServicio as=new AlumnoServicio();
        
        ArrayList <Alumno> li=as.listado();
        System.out.println("");
         System.out.println("Ingrese el alumno a evaluar: ");
        String al=leer.next();
        int otro=0;
        
         for (Alumno alum : li) {
            if (alum.getNombre().equalsIgnoreCase(al)) {
             as.notaFinal(alum.getNotas());
                
                
                otro++;
              
            }
        }
         if (otro==0) {
             System.out.println("no se encontró al alumno");
        }
         
         
        
    }//main
    
}
