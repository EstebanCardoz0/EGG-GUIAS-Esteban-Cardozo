/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej3;

import Servicio.AlumnoServicio;
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ColeccionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> alumnito = new ArrayList();
        String aux = "";

        while (!aux.equalsIgnoreCase("n")) {
            alumnito.add(as.crearAlumno());
            System.out.print("¿Ingresar otro alumno?(S/N): ");
            aux=leer.nextLine();
            System.out.println("");
            
            
            }
            
        as.notaFinal(alumnito);
            
        
            

        
        
        
        System.out.println("");

    }//final

}
