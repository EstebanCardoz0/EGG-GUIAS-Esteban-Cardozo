/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POOej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServicio cs = new CafeteraServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera cf = cs.definircafe();
        //cs.definircafe();
        System.out.println("");
        System.out.println("MENÚ CAFETERA");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar cafe");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.print("Elija una opción: ");
        int opcion = leer.nextInt();
        System.out.println("");
        switch (opcion) {
            case 1:
                cs.llenarCafetera(cf);
                break;
            case 2:
                cs.servirTaza(cf);
                
                break;
            case 3:
                cs.vaciarCafetera(cf);
                break;
            case 4:
                cs.agregarCafe(cf);
                break;
            case 5:
                System.out.println("Gracias vuelva prontos");
                break;
            
            default:
                System.out.println("Opción no válida");
        }
    }
    
}
