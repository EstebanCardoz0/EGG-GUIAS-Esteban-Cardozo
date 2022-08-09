/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.
 * @author Esteban
 */
public class Arreglo {
    double [] vectorA=new double [50];
    double [] vectorB=new double [20];
 
    public Arreglo() {
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }
    
    
    
    
}
