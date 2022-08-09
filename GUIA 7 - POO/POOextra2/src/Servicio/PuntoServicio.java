/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Punto;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. P
 * @author Esteban
 */
public class PuntoServicio {
    
    public Punto crearPunto(){
               Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Punto pun=new Punto();
        System.out.println("Ingresá las coordenadas X del punto 1");
        pun.setX1(leer.nextDouble());
        System.out.println("Ingresá las coordenadas Y del punto 1");
        pun.setY1(leer.nextDouble());
        System.out.println("---  :  ---");
        System.out.println("Ingresá las coordenadas X del punto 2");
        pun.setX2(leer.nextDouble());
        System.out.println("Ingresá las coordenadas Y del punto 2");
        pun.setY2(leer.nextDouble());
        
        
        
        
        
        return pun;
    
    }
    public void calcularDistancia(Punto pun){
    
    double distancia= sqrt((pow((pun.getX2()-pun.getX1()),2))+(pow((pun.getY2()-pun.getY1()),2)));
        System.out.println("La distancia entre ambos puntos es de "+distancia);
    
    }
    
    
}
