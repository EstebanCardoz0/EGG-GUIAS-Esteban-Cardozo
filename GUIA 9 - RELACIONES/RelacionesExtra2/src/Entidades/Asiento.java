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
public class Asiento {
    private String ubicacion;
    private Espectador e;

    public Asiento() {
    }

    public Asiento(String ubicacion, Espectador e) {
        this.ubicacion = ubicacion;
        this.e = e;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Espectador getE() {
        return e;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setE(Espectador e) {
        this.e = e;
    }

    @Override
    public String toString() {
        String s = ubicacion.toString();
        if (e == null) {
        s = s.concat("   |")   ; 
        } else{
            s=s.concat(" X |");
        }
        return s;
    }
}
