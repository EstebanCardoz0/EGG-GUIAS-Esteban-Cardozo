/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Circunferencia;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *  //d) Método area(): para calcular el área de la circunferencia (���� = � ∗
 * ������). //e) Método perimetro(): para calcular el perímetro (��������� = � ∗
 * � ∗ �����).
 *
 * @author Esteban
 */
public class CircunferenciaServicio {

    Circunferencia Cir = new Circunferencia();

    public Circunferencia CargarCircunferencia() {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el radio");
        double leradio = read.nextDouble();
        Cir.setRadio(leradio);

        return new Circunferencia(leradio);

    }

    public void Area(){
        
        double area = 3.1415+pow(Cir.getRadio(),2);
        System.out.println("El área es de "+area);
        
    }
    
    public void Perímetro(){
        
        double perímetro = 2* 3.1415 * Cir.getRadio();
      System.out.println("El área es de "+perímetro);
        
    }
    

}
