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
@Table (name="familia")
public class Familia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private String id_familia;
    private String nombre;
    private int edadMin;
    private int edadMax;
    private int numHijos;
    private String email;
    
}//final
