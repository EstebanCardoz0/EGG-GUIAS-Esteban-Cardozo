/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/**
 *
 * @author Esteban
 */
public class MatematicaServicio {
    
//    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public void devolverMayor(Matematica mat){
        if (max(mat.getNum1(),mat.getNum2())==mat.getNum1()) {
            System.out.println("El mayor es el PRIMER número");
        }else{
                    System.out.println("El mayor es el SEGUNDO número");

        }
        
    
    
    }
    
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matematica mat){
    int num1=(int) mat.getNum1();
    int num2=(int) mat.getNum2();
        if (num1>num2) {
            System.out.println("Potencia del primer número elevado al segundo: "+pow(num1,num2));
        }else{
                    System.out.println("Potencia del segundo número elevado al primero: "+pow(num2,num1));

        }
        
    }
    
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    public void calculaRaiz(Matematica mat){
    double num1=abs(mat.getNum1());
    double num2=abs(mat.getNum2());
        if (num1>num2) {
            System.out.println("Raiz cuadrada del segundo número: "+sqrt(num2));
        }else{
            System.out.println("Raiz cuadrada del primer número: "+sqrt(num1));

        }
    }
    
}//final
