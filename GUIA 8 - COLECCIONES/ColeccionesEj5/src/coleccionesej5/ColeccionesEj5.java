/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej5;

import Entidades.Pais;
import Servicio.PaisServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ColeccionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio ps=new PaisServicio();
        HashSet<Pais> paises=new HashSet();
        String aux="";
        
        while (!aux.equalsIgnoreCase("n")) {
            paises.add(ps.flag());
            System.out.print("¿Querés ingresar otro?(S/N): ");
            aux=leer.next();
            System.out.println("");
        }
        
        ps.ordenar(paises);
        ps.eliminar(paises);
        System.out.println("");
    }

    
    
}
