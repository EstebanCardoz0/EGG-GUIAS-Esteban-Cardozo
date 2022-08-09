/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Entidades.Matematica;
import Servicio.MatematicaServicio;
import static java.lang.Math.abs;
import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class POOej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Matematica mat = new Matematica();
        mat.setNum1(Math.random() * 11);
        System.out.println("El primer número es :" + (mat.getNum1()));
        mat.setNum2(Math.random() * 11);
        System.out.print("El segundo número es :" + (mat.getNum2()));
        System.out.println("");
        System.out.println("---");
        MatematicaServicio ms = new MatematicaServicio();
        ms.devolverMayor(mat);
        System.out.println("---");
        ms.calcularPotencia(mat);
        System.out.println("---");
        ms.calculaRaiz(mat);
    }

}
