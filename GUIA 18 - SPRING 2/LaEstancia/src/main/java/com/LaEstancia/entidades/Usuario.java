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
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_usuario;
    private String alias;
    private String email;
    private String clave;
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;

//     @OneToOne
//    private imagen imagen;
}//final
