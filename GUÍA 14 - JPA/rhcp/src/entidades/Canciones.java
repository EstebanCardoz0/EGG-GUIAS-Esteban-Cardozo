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
public class Canciones implements Serializable {

    @Id
    private Integer codigo_canc;
    @Basic
    private Integer album;
    private String nombre_canc;

    public Canciones() {
    }

    public Canciones(Integer codigo_canc, Integer album, String nombre_canc) {
        this.codigo_canc = codigo_canc;
        this.album = album;
        this.nombre_canc = nombre_canc;
    }

    public Integer getCodigo_canc() {
        return codigo_canc;
    }

    public void setCodigo_canc(Integer codigo_canc) {
        this.codigo_canc = codigo_canc;
    }

    public Integer getAlbum() {
        return album;
    }

    public void setAlbum(Integer album) {
        this.album = album;
    }

    public String getNombre_canc() {
        return nombre_canc;
    }

    public void setNombre_canc(String nombre_canc) {
        this.nombre_canc = nombre_canc;
    }

    @Override
    public String toString() {
        return "Canciones{" + "codigo_canc=" + codigo_canc + ", album=" + album + ", nombre_canc=" + nombre_canc + '}';
    }
    
    

}
