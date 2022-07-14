/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class OperacionesServicio {
    
    Operaciones ope=new Operaciones();
    
    
     public Operaciones CrearOperacion() {
         
         
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("ingrese el número 1: ");
        ope.setNumero1(leer.nextInt());
        
        System.out.print("ingrese el número 2: ");
                ope.setNumero2(leer.nextInt());
         return ope;


    }
         //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.

    public int Sumar(Operaciones ope) {

        int sumar = ope.getNumero1() + ope.getNumero2();

        return sumar;

    }
       //f) Método restar(): calcular la resta de los números y devolver el resultado al main

    public int Restar(Operaciones ope) {

        int restar = ope.getNumero1() - ope.getNumero2();

        return restar;

    }
      //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
    public int Multiplicar(Operaciones ope) {
int multiplicar;
        if (ope.getNumero1()==0||ope.getNumero2()==0) {
              multiplicar = 0;
              System.out.println("error, al menos un de los números es 0");
        }else{
         multiplicar=ope.getNumero1()*ope.getNumero2();
        }
        
        
        
        return multiplicar;

    }
     //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
        public int Dividir(Operaciones ope) {
int dividir;
        if (ope.getNumero1()==0) {
              dividir = 0;
              System.out.println("error, el primer número es 0");
        }else if 
            (ope.getNumero2()==0){
        dividir=ope.getNumero2();
                      System.out.println("error, el segundo número es 0");

        }else {
                
         dividir=ope.getNumero1()/ope.getNumero2();
        }
        
        
        
        return dividir;

    }
     
     
     
     
     
     
}//
