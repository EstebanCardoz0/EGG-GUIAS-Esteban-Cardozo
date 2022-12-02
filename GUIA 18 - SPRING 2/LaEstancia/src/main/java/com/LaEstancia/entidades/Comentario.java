/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LaEstancia.entidades;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Esteban
 */
@Entity
@Data
@Table(name="comentario")
public class Comentario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_comentario;
    private String descripcion;
    
}
