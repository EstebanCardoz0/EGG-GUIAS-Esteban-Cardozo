/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class Juego {
    
    List<Jugador> jugadores;
    Revolver revol;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver revol) {
        this.jugadores = jugadores;
        this.revol = revol;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevol() {
        return revol;
    }

    public void setRevol(Revolver revol) {
        this.revol = revol;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revol=" + revol + '}';
    }

   
    
    
    
    
}
