/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud.
 * @author Esteban
 */
public class Cadena {
    String frase="";
    int longi=frase.length();

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongi() {
        return longi;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }
    
}
