/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Noticias.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *  
 * @author Usuario
 */
@Entity
public class Noticia {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name= "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
    private String cuerpo;
    private String foto;

    public Noticia(String id, String titulo, String cuerpo, String foto) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.foto = foto;
    }

    public Noticia() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}//FINAL
