/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio.persistencia;

import jdbc_ejercicio.entidades.Tienda;

/**
 *
 * @author Usuario
 */
public final class TiendaDao extends DAO {

    public  void guardarFabricante(Tienda fabricante) throws Exception {

        try {

            if (fabricante == null) {
                throw new Exception("Debe indicar fabricante ");
            }
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + fabricante.getNombre() + "');";
            System.out.println("FABRICANTE " + fabricante.getNombre() + " AGREGADO CORRECTAMENTE A LA BASE DE DATOS ");
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }

}//final
