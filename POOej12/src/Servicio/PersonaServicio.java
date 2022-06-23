/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *  
 *  • Agregar a la clase el método menorQue(int
 * edad) que recibe como parámetro otra edad y retorna true en caso de que el
 * receptor tenga menor edad que la persona que se recibe como parámetro, o
 * false en caso contrario. 
 *
 * @author Usuario
 */
public class PersonaServicio {

//    Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona per =new Persona(); 
        System.out.println("Escribí el nombre de la persona:");
        per.setNombre(leer.nextLine());
        System.out.println("Ahora la fecha de nacimiento:");
        System.out.print("Dia: ");
        per.setDia(leer.nextInt());
        
        System.out.print("Mes: ");
       per.setMes(leer.nextInt());
       
        System.out.print("Año: ");
         per.setAnio(leer.nextInt());
        Date fechita=new Date(per.getAnio(),per.getMes()-1,per.getDia());
        
        per.setFechaNac(fechita);
        
       // System.out.println(per.getFechaNac());
        
        return per;

    }
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento
// * ingresada. Tener en cuenta que para conocer la edad de la persona también se
// * debe conocer la fecha actual.
    public int calcularEdad(Persona per){
    Date fecha=new Date();
    int edad=(fecha.getYear()-per.getFechaNac().getYear())-1;
    
        if (fecha.getMonth()>per.getFechaNac().getMonth()) {
            edad=edad+1;
           // System.out.println("Edad: "+edad);
            
            
            if (fecha.getDate()<per.getFechaNac().getDate()) {
                 edad=edad-1;
                 System.out.println("Edad: "+edad);
            }
           
        }
        System.out.println("Edad: "+edad);
        return edad;
    
    }
//    • Agregar a la clase el método menorQue(int
// * edad) que recibe como parámetro otra edad y retorna true en caso de que el
// * receptor tenga menor edad que la persona que se recibe como parámetro, o
// * false en caso contrario.
    
    public void era(Persona per){
        int era=calcularEdad(per);
        
        
    
    
    }
    
    
    public void menorQue(Persona per, int era){
    Date fecha=new Date();
    int edad=(fecha.getYear()-per.getFechaNac().getYear())-1;
    
        if (fecha.getMonth()>per.getFechaNac().getMonth()) {
            edad=edad+1;
           // System.out.println("Edad: "+edad);
            
            
            if (fecha.getDate()<per.getFechaNac().getDate()) {
                 edad=edad-1;
                // System.out.println("Edad: "+edad);
            }
           
        }
        //System.out.println("Edad: "+edad);
        if (edad<era) {
            System.out.println(per.getNombre()+" es menor que fulanito, que tiene "+edad);
        }else if(edad>era){
                    System.out.println(per.getNombre()+" es mayor que fulanito, que tiene "+edad);

        }else{
                            System.out.println(per.getNombre()+" y fulanito tienen la misma edad");

        }
        
    
    }
       
//        int menor;
//        if (calcularEdad(per)<era) {
//            menor=1;
//            //System.out.println(per.getNombre()+" es menor que fulanito, que tiene "+edad);
//        }else if(calcularEdad(per)==era){
//              //      System.out.println(per.getNombre()+" y fulanito tienen la misma edad");
//
//            menor=2;
//            
//        }else{
//        menor=3;
//                //    System.out.println(per.getNombre()+" es mayor que fulanito, que tiene "+edad);
//
//        }
//        
//        
//        return menor;
        
        //System.out.println(calcularEdad(Persona per));
    
    
    //}
   // • Metodo mostrarPersona(): este método muestra la
 //* persona creada en el método anterior.
    
    public void mostrarPersona(Persona per){
        System.out.println("--- DATOS DE LA PERSONA ---");
        System.out.println("Nombre: "+per.getNombre());
        System.out.println("Fecha de nacimiento: "+per.getFechaNac());
    
    
    
    }
    
}
