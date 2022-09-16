/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones02;

import Entidades.Jugador;
import Entidades.Revolver;
import Servicio.JuegoServicio;
import Servicio.JugadorServicio;
import Servicio.RevolverServicio;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Relaciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RevolverServicio rs=new RevolverServicio();
        JuegoServicio jues=new JuegoServicio();
        JugadorServicio js=new JugadorServicio();
        
        Revolver rev=new Revolver();
        rs.llenarRevolver(rev);
        //rs.mostrarRevolver(rev);
        
        Jugador jug1=new Jugador(01,"Esteban 01");
        Jugador jug2=new Jugador(02,"Eugenia 02");
        Jugador jug3=new Jugador(03,"Constanza 03");
        
        ArrayList players=new ArrayList();
        players.add(jug1);
        players.add(jug2);
        players.add(jug3);
        
        //System.out.println(players.get(2));
        
        jues.llenarJuego(players, rev);
        
      //  jues.ronda(js, rev, players, rs);
        
        System.out.println("----¡¿RULETA RUSA!----");
        System.out.println("");
        int i=0;
           int ayu=0;  
        
        do {
            for (int j = 0; j < players.size(); j++) {
                jues.ronda2(ayu,js, rev, (Jugador) players.get(j), rs);
            rs.siguientePlomo(rev);
            i++;
//                if (jues.ronda2(js, rev, (Jugador) players.get(j), rs)==true) {
//                    ayu=1;
//                    
//                    break;
       //         }
            
            }//finalfor
           // rs.siguientePlomo(rev);
           
            
            //System.out.println("");
            
        } while (i<6);
        System.out.println("");
        System.out.println("---GAME OVER---");
//        jues.ronda2(js, rev, jug3, rs);
//        rs.siguientePlomo(rev);
//        jues.ronda2(js, rev, jug3, rs);
//        
//        System.out.println("");
        
        
        
        
        
    }//FINAl
   //rev.getPosicionACT()!=rev.getPosicionPlomo()
}
