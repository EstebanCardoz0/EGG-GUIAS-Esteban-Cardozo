/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class PerroServicio2 {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");

    Perro2 raza=new Perro2();
    
    
    
    public ArrayList <Perro2> llenaRazas (ArrayList <Perro2> listaRazas){
        
        Perro2 guau;
        
        System.out.println("Diga la raza: ");
        String razas= leer.nextLine();
        guau= new Perro2 (razas);
        listaRazas.add(guau);
        
        
        
        
        
            return listaRazas;
    }
    
    public void muestraPerros (ArrayList <Perro2> Perros){
    
        Perros.forEach((perro)->{
            System.out.println(perro + " ");
        });
    
    
    
    }
    
//    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
    
    public ArrayList <Perro2> eliminarPerro(ArrayList <Perro2> Perros){
        
    Iterator <Perro2> it=Perros.iterator();
    
        System.out.println("¿Qué raza querés eliminar?");
        String elimi=leer.nextLine();
        int aux=0;
        
        while (it.hasNext()) {
           // System.out.println(it.next());
            if (it.next().getRaza().equalsIgnoreCase(elimi)) {
                ///////FIJARME ACÁ
               
                it.remove();
                aux++;
            }
            //EL PROBLEMA ESTÁ EN EL REMOVER (ELIMINARPERRO), ELIMINA TODO EN VEZ DE SOLO UN INDICE

        }
        
        if (aux!=0) {
            System.out.println("la raza no está en la lista");
        }
    
                   
        Perros.sort(Perro2.ordenarRaza);
        
        
        return Perros ;
        
    }
    
    
    
    
    
    
    
}//final
    

