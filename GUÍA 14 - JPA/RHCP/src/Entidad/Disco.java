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
public class Disco implements Serializable {
    
    @Id
   private Integer id;
    @Column
   private String nombre;
   private Integer año;

    public Disco() {
    }

    public Disco(Integer id, String nombre, Integer año) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Disco{" + "id=" + id + ", nombre=" + nombre + ", a\u00f1o=" + año + '}';
    }
   
   
    
    
    
}
