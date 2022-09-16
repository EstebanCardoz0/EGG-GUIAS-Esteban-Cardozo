/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Juego {
    private Revolver revolver;
    private ArrayList<Jugador> jugadores;
    
        public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        
        revolver = new Revolver();
        
        jugadores = new ArrayList();
        
        System.out.print("» Número de jugadores [2..6]: "); 
        int n_jug = leer.nextInt();
        if(n_jug > 6 || n_jug < 2) {
            n_jug = 6;
        }
        revolver.llenarRevolver();
        for(int i = 1; i <= n_jug; i++) {
            System.out.println("Ingrese el nombre del jugador "+i);
            jugadores.add(new Jugador(i,leer.next()));
        }
    }
    
    public void ronda(boolean fin) {
        Iterator<Jugador> it = jugadores.iterator();
        
        while(it.hasNext()) {
            Jugador player = it.next();
            System.out.println("Turno de: " + player);
            System.out.println();
            System.out.println("Presione intro para que dispare...");
            leer.next();
            System.out.println("REVOLVER ANTES DE DISPARAR: " + revolver);
            player.disparo(revolver);
            if(player.getMuerto()) {
                System.out.println("El jugador que se mojó fue: " + player);
                fin = true;
                System.out.println("REVOLVER: " + revolver);
                break;
            } else {System.out.println("REVOLVER DESPUÉS DE DISPARAR: " + revolver);}
            System.out.println();
        }
    }
    
    //Informar número de ronda, turno de jugador y resultado.
    
    
    
    
    
    
}//final juego