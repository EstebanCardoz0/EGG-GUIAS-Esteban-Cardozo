/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author Esteban
 */
public class HerenciaEj2 {

    /**
     * Vamos a crear una Lavadora y un Televisor y llamar a los métodos
     * necesarios para mostrar el precio final de los dos electrodomésticos.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lavadora lavarropa = new Lavadora();

        System.out.println("---LAVARROPA DREAN---");
        lavarropa.crearLavadora();
        System.out.println("");
        lavarropa.precioFinal();
        System.out.println("");
        System.out.println("---TELEVISOR LG---");
        Televisor tele = new Televisor();
        tele.crearTv();
        System.out.println("");
        tele.precioFinal();

    }

}
