/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej6;

import Servicio.ProductoServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ColeccionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> inventario = new HashMap();
        ProductoServicio ps = new ProductoServicio();
        System.out.println("----INVENTARIO----");
        System.out.println("");
        boolean aux = true;
        String otro="s";
        while (otro.equalsIgnoreCase("s")) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");

            System.out.println("");
            System.out.print("Elija una opción: ");
            int num = leer.nextInt();
            System.out.println("");

            switch (num) {
                case 1:
                    ps.llenarMapa(inventario);

                    break;
                case 2:
                   ps.CambiarValor(inventario);

                    break;
                case 3:
                    ps.eliminarProducto(inventario);

                    break;
                case 4:
                    ps.mostrarProducto(inventario);

                    break;
                case 5:
                   //aux=false;
                    otro="n";

                    break;
            }
        }

        System.out.println("---Sesión finalizada---");

       

        System.out.println("");

    }

}
