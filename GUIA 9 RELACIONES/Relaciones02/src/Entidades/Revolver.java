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
    
    int posicionACT;
    int posicionPlomo;

    public Revolver(int posicionACT, int posicionAgua) {
        this.posicionACT = posicionACT;
        this.posicionPlomo = posicionPlomo;
    }

    public Revolver() {
    }

    public void setPosicionACT(int posicionACT) {
        this.posicionACT = posicionACT;
    }

    public void setPosicionPlomo(int posicionPlomo) {
        this.posicionPlomo = posicionPlomo;
    }

    public int getPosicionACT() {
        return posicionACT;
    }

    public int getPosicionPlomo() {
        return posicionPlomo;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionACT=" + posicionACT + ", posicionPlomo=" + posicionPlomo + '}';
    }
    
}
