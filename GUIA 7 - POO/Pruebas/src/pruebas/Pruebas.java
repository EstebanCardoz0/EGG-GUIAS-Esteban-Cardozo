  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
        
      ArrayList<Integer> lista=new ArrayList();
       lista.add(5);
       lista.add(6);
       lista.add(7);
       lista.add(22);
       // System.out.println(lista);
        
        lista.remove(0);
        
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)==22) {
                lista.remove(i);
                break;
            }
            
        }
        System.out.println("for each");
            for (Integer integer : lista) {
                System.out.println(integer);
                }
        TreeSet<String> listaTree =new TreeSet();       
           listaTree.add("hola");
           listaTree.add("soy");
           listaTree.add("Esteban");
                
                for (String cade : listaTree) {
                    System.out.println(cade);
                }
                ////////////////////////
     HashMap<Integer,String> maplista =new HashMap();
                maplista.put(4,"buenas" );
                maplista.put(3,"tardes" );
                maplista.put(54,"america" );
                
//                for (Map.Entry<Integer, String> entry : maplista.entrySet()) {
//                    Integer key = entry.getKey();
//                    String value = entry.getValue();
//                    System.out.println(entry);
//                }
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
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        ///

    }
    
}
