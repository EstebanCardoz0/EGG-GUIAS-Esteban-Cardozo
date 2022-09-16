/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej3;

import ENUM.ColorEnum;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class HerenciaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Electrodomestico> listas = new ArrayList();

        Televisor tele1 = new Televisor(29, true, 1000.0, "negro", "F", 555.0, "Televisor LG");
        Televisor tele2 = new Televisor(32, true, 1000.0, "azul", "B", 896.0, "Televisor Samsung");
//        Televisor tele1 = new Televisor();
//        Televisor tele2 = new Televisor();

        Lavadora lava1 = new Lavadora(43, 1000.0, "BLANCO", "F", 70.0, "Lavarropas Drean");
        Lavadora lava2 = new Lavadora(20, 1000.0, "NEGRO", "A", 66.0, "Lavarropas Whirpool");
        listas.add(tele1);
        listas.add(tele2);
        listas.add(lava1);
        listas.add(lava2);


        for (Electrodomestico electro : listas) {
            System.out.println(electro.getNombre());
            electro.precioFinal();

//            System.out.println(electro.getNombre());
//            System.out.println("precio: $"+electro.getPrecio());
            System.out.println("");
        }
        
        
            
            System.out.println("---Precios por tipo---");
            System.out.println("");
            double precioLava= lava1.getPrecio()+lava2.getPrecio();
            System.out.println("Lavarropas: $"+precioLava);
            double precioTele= tele1.getPrecio()+tele2.getPrecio();
            System.out.println("Televisores: $"+precioTele);
            
            double aux=0;
            for (Electrodomestico lista : listas) {
            
                lista.getPrecio();
                
                 aux=lista.getPrecio()+aux;
            
                
        }
        System.out.println("");
        System.out.print("PRECIO TOTAL DE LOS PRODUCTOS: $"+aux);
           System.out.println("");
        

    }//final main

}
