/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Esteban
 */
public class HerenciaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo cir = new Circulo(34, 56);
        Rectangulo rec = new Rectangulo(5.18, 19);

        System.out.println("---CÍRCULO---");
        System.out.println("");
        cir.area();
        cir.perimetro();
        System.out.println("");
        System.out.println("---RECTÁNGULO---");
        System.out.println("");
        rec.area();
        rec.perimetro();
    }

}
