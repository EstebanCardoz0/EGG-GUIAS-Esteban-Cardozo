/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones03;

import Entidaes.Baraja;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Relaciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int aux = 0;
        Baraja b = new Baraja();

        ArrayList mazo = b.llenarBaraja();
        ArrayList monton = new ArrayList();

        System.out.println("----BARAJA ESPAÑOLA----");
        
        do {
            System.out.println("");
            System.out.println("MENÚ");
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente carta ");
            System.out.println("3- Cartas por repartir");
            System.out.println("4- Mostrar varias cartas");
            System.out.println("5- Cartas repartidas");
            System.out.println("6- Repartir todas las cartas");
            System.out.println("7- Salir");
            System.out.print("Elija una opción: ");
            int opc = leer.nextInt();
            System.out.println("");
            
            switch (opc) {
                case 1:
                    b.barajar(mazo);
                    break;
                case 2:
                    b.siguienteCarta(mazo, monton);
                    break;
                case 3:
                     b.cartasDisponibles(mazo);
                    break;
                case 4:
                     b.darCartas(mazo, monton);
                    break;
                case 5:
                     b.CartasMonton(mazo, monton);
                    break;
                case 6:
                    b.mostrarBaraja(mazo, monton);
                    break;
                case 7:
                    aux++;
                    System.out.println("Hasta la próxima");
                    break;
                
            }
        } while (aux == 0);

        

       

    }//final main

}
