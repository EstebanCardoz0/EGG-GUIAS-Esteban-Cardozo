/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 * @author Usuario
 */
public class PerroServicio {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

    Perro raza=new Perro();
    
    
    
    public ArrayList <Perro> llenaRazas (ArrayList <Perro> listaRazas){
        
        Perro guau;
        
        System.out.println("Diga la raza: ");
        String razas= leer.nextLine();
        guau= new Perro (razas);
        listaRazas.add(guau);
        
        
        
        
        
            return listaRazas;
    }
    
    public void muestraPerros (ArrayList <Perro> Perros){
    
        Perros.forEach((perro)->{
            System.out.println(perro + " ");
        });
    
    
    
    }
    
    
    
    
    
    
    }
    
    

