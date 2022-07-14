/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Servicio.CuentaBancariaServicio;
import java.util.Scanner;
import Entidades.CuentaBancaria;

/**
 *
 * @author Esteban
 */
public class POOej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
       
       
        System.out.println("BANCO WEC");
        System.out.println("");
        System.out.println("presione S si desea crear una cuenta, de lo contrario presione N");
        String eleccion = leer.nextLine();
        if ("S".equals(eleccion)||"s".equals(eleccion)) {
            System.out.println("");
             CuentaBancaria cb = cbs.crearCuenta();
            System.out.println("");
            System.out.println("MENÚ DEL BANCO WEC");
            System.out.println("");
           
            System.out.println("1. Ingresar Dinero ");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Retiro Express (hasta 20% del saldo)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos de la Cuenta");
            System.out.println("6. Salir");
             System.out.print("Elija una opción: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cbs.ingresar(cb);
                    cbs.consultarSaldo(cb);
                    
                    break;
                case 2:
                    cbs.retirar(cb);
                    cbs.consultarSaldo(cb);
                    break;
                case 3:
                    cbs.extracciónRapida(cb);
                    cbs.consultarSaldo(cb);
                    break;
                case 4:
                    cbs.consultarSaldo(cb);
                    break;
                case 5:
                    cbs.consultarDatos(cb);
                    break;
                case 6:
                    
                    break;
                    
                    
                    
                    
                default:
                    System.out.println("Opción inválida");
            }
            
        } else {
            
        }
        
    }
    
}
