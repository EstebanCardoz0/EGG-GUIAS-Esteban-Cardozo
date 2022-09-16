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
public class Jugador {
    
    private  int id;
    private  String nombre;
    private boolean muerto;
    
    public boolean getMuerto() {return muerto;}   
    
    public Jugador(int id,String nombre) {
        this.id = id;
        this.nombre = nombre+" " + id;
    }
    
    public void disparo(Revolver r) {
        muerto = r.tirar();
        if(!muerto) {
            r.siguientePlomo();
        }
    }
     @Override
    public String toString() {return nombre;}
    
    
    
    
    
    
    
}//final jugador
