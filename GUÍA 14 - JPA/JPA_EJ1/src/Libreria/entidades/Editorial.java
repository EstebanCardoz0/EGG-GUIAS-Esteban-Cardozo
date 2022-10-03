/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.entidades;

import com.sun.istack.internal.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Esteban
 */
@Entity
public class Editorial {
    
      @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(unique = true, nullable = false)
    //@Column(unique = true)
    private String nombre;
    private Boolean alta;

    public Editorial() {
    }

    public Editorial(Integer id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
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

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

//    @Override
//    public String toString() {
//        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
//    }
    
     @Override
    public String toString() {
        return String.format("%-35s", nombre);
    }
    
}
