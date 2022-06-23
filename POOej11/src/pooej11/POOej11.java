/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;

/**
 *
 * @author Esteban
 */
public class POOej11 {

    /**Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. 
* Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
* 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia=05;
        int mes=0;
        int anio=95;
        Date fechanac=new Date(anio,mes,dia);
        System.out.println("Fecha de nacimiento: "+fechanac);
       Date fechaact= new Date();
        System.out.println("Fecha actual: "+fechaact);
        int edad=(fechaact.getYear()-fechanac.getYear());
        System.out.println("Edad: "+edad);
        System.out.println(fechaact.getDate());
        
    }//
    
}
