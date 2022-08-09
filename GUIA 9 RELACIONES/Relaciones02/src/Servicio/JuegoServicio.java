/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class JuegoServicio {

    public Juego llenarJuego(ArrayList<Jugador> juga, Revolver r) {

        ArrayList<Jugador> jug = juga;
        Revolver rev = r;

        return new Juego(juga, r);

    }

    public void ronda(JugadorServicio js, Revolver rec, ArrayList<Jugador> juga, RevolverServicio rs) {

        boolean aux = false;
        int num = 0;
        do {
            boolean com = false;
            for (int i = 0; i < juga.size(); i++) {

                if (js.disparo(rec, juga.get(i), rs) == true) {
                    System.out.println(juga.get(i).getNombre() + " cagó fuego");
                    com = true;
                    break;
                } else {
                    System.out.println(juga.get(i).getNombre() + " se salvó");
                    rs.siguientePlomo(rec);
                }

            }
            num++;
            aux = com;

        } while (num < 7);

        System.out.println("---GAME OVER---");

    }//final ronda

    public boolean ronda2(int ayu,JugadorServicio js, Revolver rec, Jugador juga, RevolverServicio rs) {
        boolean help=false;
        int ayus=0;
            
            if (js.disparo(rec, juga, rs) == true) {
            System.out.println(juga.getNombre()+" cagó fuego");
            ayu=1;
            help=true;
            
            
            
            
           
        }else{System.out.println(juga.getNombre()+" se salvó");}
        return help;
            
        
        

    }

}//final clase service
