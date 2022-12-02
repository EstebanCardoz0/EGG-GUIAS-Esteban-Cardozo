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
@Table(name="cliente")
@Data
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id_cliente;
    private String nombre;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private String email;
    
    
    
    
}
