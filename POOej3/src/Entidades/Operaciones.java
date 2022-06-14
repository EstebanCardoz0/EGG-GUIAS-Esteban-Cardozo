/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */


public class Operaciones {

    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void CrearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("ingrese el número 1: ");
        numero1 = leer.nextInt();
        System.out.print("ingrese el número 2: ");
        numero2 = leer.nextInt();

    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.

    public int Sumar() {

        int sumar = numero1 + numero2;

        return sumar;

    }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main

    public int Restar() {

        int restar = numero1 - numero2;

        return restar;

    }
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
    public int Multiplicar() {
int multiplicar;
        if (numero1==0||numero2==0) {
              multiplicar = 0;
              System.out.println("error, al menos un de los números es cero");
        }else{
         multiplicar=numero1*numero2;
        }
        
        
        
        return multiplicar;

    }
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
        public int Dividir() {
int dividir;
        if (numero1==0||numero2==0) {
              dividir = 0;
              System.out.println("error, al menos un de los números es cero");
        }else{
         dividir=numero1/numero2;
        }
        
        
        
        return dividir;

    }
    
    
    
    
    

}//final
