/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LaEstancia.entidades;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Esteban
 */
@Entity
@Table(name="reserva")
@Data
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_reserva;
    private String huesped;
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    private Date fechaHasta;
    
}
