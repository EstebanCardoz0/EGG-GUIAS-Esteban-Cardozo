/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
 * @author Usuario
 */
public class Cafetera {
    
    int capacidadMax;
    int cantidadAct;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantidadAct) {
        this.capacidadMax = capacidadMax;
        this.cantidadAct = cantidadAct;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCantidadAct() {
        return cantidadAct;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCantidadAct(int cantidadAct) {
        this.cantidadAct = cantidadAct;
    }
    
}
