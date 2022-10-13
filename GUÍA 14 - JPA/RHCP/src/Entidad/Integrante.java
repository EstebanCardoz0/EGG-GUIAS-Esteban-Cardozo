/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity
public class Integrante implements Serializable {

    @Id
    private String nombre;
    @Column
    private String instrumento;
    private String ingreso;

    public Integrante() {
    }

    public Integrante(String nombre, String instrumento, String ingreso) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.ingreso = ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "Integrante{" + "nombre=" + nombre + ", instrumento=" + instrumento + ", ingreso=" + ingreso + '}';
    }
}
