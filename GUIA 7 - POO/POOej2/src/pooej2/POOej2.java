/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author Esteban
 */
public class POOej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia circo=    cs.CargarCircunferencia();


       cs.Area(circo);
       cs.Perímetro(circo);

    }

}
