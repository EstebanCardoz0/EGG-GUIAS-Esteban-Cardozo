/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LaEstancia.entidades;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Esteban
 */
@Entity
@Data
@Table (name="casa")
public class Casa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_casa;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    @Temporal(TemporalType.DATE)
    private Date fechaHasta;
    private int minDias;
    private int maxDias;
    private double precio;
    private String tipoVivienda;
    
    
    
}//final
