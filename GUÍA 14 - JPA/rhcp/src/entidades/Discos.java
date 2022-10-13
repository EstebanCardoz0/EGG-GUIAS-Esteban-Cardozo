/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Esteban
 */
@Entity
public class Discos implements Serializable {
    @Id
    private Integer id;
    @Basic
    private Integer año;
    private String nombre;

    public Discos() {
    }

    public Discos(Integer id, Integer año, String nombre) {
        this.id = id;
        this.año = año;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Discos{" + "id=" + id + ", a\u00f1o=" + año + ", nombre=" + nombre + '}';
    }
    
    
    
}
