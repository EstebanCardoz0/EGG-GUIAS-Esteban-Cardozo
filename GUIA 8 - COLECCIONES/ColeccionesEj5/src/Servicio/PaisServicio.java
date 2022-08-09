/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pais flag() {

        System.out.print("Ingresá un país: ");
        String nombre = leer.next();
        return new Pais(nombre);
    }

    public void ordenar( HashSet<Pais> paises) {
        System.out.println("----LISTA DE PAISES----");
        ArrayList<Pais> country=new ArrayList(paises);
        country.sort(Pais.ordenAlfabetico);
        Iterator it= country.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
               
        System.out.println("");

    }
    
    public void eliminar( HashSet<Pais> paises){
        System.out.print("¿Qué país querés eliminar?: " );
        String pais=leer.next();
        int aux=0;
                Iterator <Pais>it= paises.iterator();

        while (it.hasNext()) {
            
            if (it.next().getNombre().equalsIgnoreCase(pais)) {
                it.remove();
                System.out.println("pais removido");
                aux++;
            }
            
        }
        if (aux==0) {
            System.out.println("el país no está en la lista");
        }
    
    }

}
