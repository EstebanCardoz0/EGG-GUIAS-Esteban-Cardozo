/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Esteban
 */
public class Revolver {
    
    private int posActual;
    private int posPlomo;
    private final int nPosTambor = 6;

    public Revolver() {
    }
    
    public void llenarRevolver() {
        posActual = (int) Math.round((Math.random() * 10 + 1) * 0.55); // Números aleatorios de 1 a 6
        posPlomo = (int) Math.round((Math.random() * 10 + 1) * 0.55); // Números aleatorios de 1 a 6
    }
    
    public boolean tirar() {
        return posActual == posPlomo;
    }
    
    public void siguientePlomo() {
        
        if (posActual<6) {
            posActual++;
        }else
            posActual=1;
        
           }
    
    public void mostrarCargador(){
        System.out.println("Cargador del revolver");
        System.out.println("Posición actual: "+posActual);
        System.out.println("Posición de la bala "+posPlomo);
    
    }

    @Override
    public String toString() {
        return "Gatillo en posición: " + posActual + " | Posición de plomo: " + posPlomo + ")";
    }
    
    
    
    
}// final clase
