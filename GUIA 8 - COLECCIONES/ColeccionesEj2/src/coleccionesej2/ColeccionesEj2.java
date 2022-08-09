/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej2;

import Entidades.Perro2;
import Servicio.PerroServicio2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ColeccionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Perro2> perritos = new ArrayList();
        String resp = "r";
        PerroServicio2 ps = new PerroServicio2();

        do {
            System.out.print("¿Ingresar raza de perro? [S/N]: ");
            resp = leer.next();
            //System.out.println();

            if (!resp.equalsIgnoreCase("N")) {
                ps.llenaRazas(perritos);

            }

        } while (!resp.equalsIgnoreCase("N"));
        System.out.println("");

        System.out.println("---Razas de la lista---");
        ps.muestraPerros(perritos);
        
        ps.eliminarPerro(perritos);
                

        
        System.out.println("---Razas de la lista---");
                ps.muestraPerros(perritos);

//EL PROBLEMA ESTÁ EN EL REMOVER (ELIMINARPERRO), ELIMINA TODO EN VEZ DE SOLO UN INDICE
    }

}
