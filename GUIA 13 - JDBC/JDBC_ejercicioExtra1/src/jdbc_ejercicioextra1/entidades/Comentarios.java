/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicioextra1.entidades;

/**
 *
 * @author Usuario
 */
public class Comentarios {
    
       private Integer id_comentario;
    private Integer id_casa;
    private String comentario;

    public Comentarios() {
    }

    public Comentarios(Integer id_comentario, Integer id_casa, String comentario) {
        this.id_comentario = id_comentario;
        this.id_casa = id_casa;
        this.comentario = comentario;
    }

    public Integer getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Integer id_comentario) {
        this.id_comentario = id_comentario;
    }

    public Integer getId_casa() {
        return id_casa;
    }

    public void setId_casa(Integer id_casa) {
        this.id_casa = id_casa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    

    @Override
    public String toString() {
        return "Comentarios{" + "id_comentario=" + id_comentario + ", casa=" + id_casa + ", comentario=" + comentario + '}';
    }
    
    
    
    
    
    
}
