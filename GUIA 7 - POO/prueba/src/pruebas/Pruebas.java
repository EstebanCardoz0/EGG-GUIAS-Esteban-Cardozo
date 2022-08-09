/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Esteban
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libros uno=new Libros("Rayuela");
        Libros dos=new Libros("Ébano");
        Libros tres=new Libros("Jaramillo");
        Libros cuatro=new Libros("Leviatán");
        
        
         ArrayList<Libros> libreri=new ArrayList();
        libreri.add(tres);
        libreri.add(uno);
        libreri.add(dos);
        libreri.add(cuatro);
        
        libreri.sort(Libros.compTitulo);
        
        for (Libros librosi : libreri) {
            
            System.out.println(librosi);
        }
       
        
        System.out.println("");
        
        
        
        
        //////////////////////////////////////////////////////////////////
        
      ArrayList<Integer> lista=new ArrayList();
       lista.add(45);
       lista.add(6);
       lista.add(100);
       lista.add(22);
       // System.out.println(lista);
        
        lista.remove(Integer.valueOf(100));
       //REMOVER  lista.remove(new Integer(6));
        
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i)==22) {
//                lista.remove(i);
//                break;
//            }
//            
//        }
        System.out.println("for each");
            for (Integer integer : lista) {
                System.out.println(integer);
                }
            
            
        TreeSet<String> listaTree =new TreeSet();       
           listaTree.add("holaaaa");
        
           listaTree.add("Esteban");
                   listaTree.add("soyprueba");
                   
                for (String cade : listaTree) {
                    System.out.println(cade);
                }
                ////////////////////////
     HashMap<Integer,String> maplista =new HashMap();
                maplista.put(4,"buenas" );
                maplista.put(1,"tardes" );
                maplista.put(55,"america" );
                
                TreeMap<Integer,String>maplistaTree =new TreeMap();
                
                for (Map.Entry<Integer, String> entry : maplista.entrySet()) {
                    Integer key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(entry);
                }

        HashMap<String,Integer> personas = new HashMap();
        String n1="Albus";
        String n2="Severus";
        
        personas.put(n1,77);
        personas.put(n2,5);  
        
        System.out.println("---iterator---");
        Iterator it= listaTree.iterator();
                
        while (it.hasNext()) {
           
            System.out.println(it.next()+" ");
        }
                
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it2 = bebidas.iterator();

        while (it2.hasNext()) {
            if (it2.next().equals("café")) {
                it2.remove();
            }
        }
   while (it2.hasNext()) {
           
            System.out.println(it2.next()+" ");
        }
            System.out.println("");
            System.out.println("ordenar colecciones");
                System.out.println("");
                
           Collections.sort(lista);
           
            for (Integer integer : lista) {
                System.out.println(integer);
                }
        ////////////////////////////////////////////////////////////////////        
                
                
                
                
                
                
        ///

    }
    
}

