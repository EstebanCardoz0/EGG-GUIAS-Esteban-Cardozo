/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Estas las realizaremos en el servicio. Como, introducir un elemento,
 * modificar su precio, eliminar un producto y mostrar los productos que tenemos
 * con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
 * producto y de valor el precio. Realizar un menú para lograr todas las
 * acciones previamente mencionadas.
 *
 * @author Esteban
 */
public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //  HashMap<String,Double>
    public void llenarMapa(HashMap<String, Double> inventario) {
        System.out.print("Ingrese el producto: ");
        String nombre = leer.next();
        System.out.print("Precio($): ");
        Double precio = leer.nextDouble();

        //return new Producto(nombre,precio);
        inventario.put(nombre, precio);
        System.out.println("");
        System.out.println("presione ENTER para seguir");
         try{System.in.read();}
            catch(IOException e){}
    }

    public void CambiarValor(HashMap<String, Double> inventario) {

        System.out.println("¿Qué producto desea cambiar de precio?:");
        String nprod = leer.next();
        boolean aux = false;
        for (String nombre : inventario.keySet()) {
            if (nprod.equals(nombre)) {
                aux = true;
                System.out.print("Precio nuevo: ");
                Double npre = leer.nextDouble();
                inventario.remove(nombre);
                inventario.put(nprod, npre);

            }

        }
        System.out.println("");
        if (aux = false) {
            System.out.println("El producto no existe");
        }
        System.out.println("");
          System.out.println("presione ENTER para seguir");

         try{System.in.read();}
            catch(IOException e){}
    }

    public void eliminarProducto(HashMap<String, Double> inventario) {
System.out.println("¿Qué producto desea eliminar?:");
        String nprod = leer.next();
        boolean aux = false;
        for (String nombre : inventario.keySet()) {
            if (nprod.equals(nombre)) {
                aux = true;
                
                inventario.remove(nombre);
                System.out.println("Producto eliminado");

            }

        }
        System.out.println("");
        if (aux = false) {
            System.out.println("El producto no existe");
        }
        System.out.println("");          
        System.out.println("presione ENTER para seguir");

         try{System.in.read();}
            catch(IOException e){}
    }
    
    public void mostrarProducto(HashMap<String, Double> inventario){
        for (Map.Entry<String, Double> entry : inventario.entrySet()) {
            System.out.println("- "+entry.getKey()+" $"+entry.getValue());
            
        }
        System.out.println("");
              System.out.println("presione ENTER para seguir");

         try{System.in.read();}
            catch(IOException e){}
    }

}//FINAL CLASE
