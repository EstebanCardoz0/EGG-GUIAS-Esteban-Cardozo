/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
 * incorporación a la facultad y qué número de despacho tienen asignado.
 * Reasignación de despacho a un empleado.
 *
 * @author Usuario
 */
public class Empleado extends Persona {

    int anioInc;
    int numDespacho;

    public Empleado(int anioInc, int numDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioInc = anioInc;
        this.numDespacho = numDespacho;
    }

    public void Reasignacion() {
        System.out.println("El despacho actual de " + nombre + " " + apellido + " es: " + numDespacho);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Cambiarlo a: ");
        numDespacho = leer.nextInt();
        System.out.println("");
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "anioInc=" + anioInc + ", numDespacho=" + numDespacho + '}'; //To change body of generated methods, choose Tools | Templates.
    }

  

    

    
    
    
}
