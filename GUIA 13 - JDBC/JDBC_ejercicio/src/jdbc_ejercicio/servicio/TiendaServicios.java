/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio.servicio;

import jdbc_ejercicio.entidades.Tienda;
import jdbc_ejercicio.persistencia.TiendaDao;

/**
 *
 * @author Usuario
 */
public class TiendaServicios {

    public static void crearTienda(String nombre) throws Exception {
        try {

            if (nombre == null) {
                throw new Exception("Debe indicar un nombre de tienda ");
            }
            Tienda tienda = new Tienda();
            tienda.setNombre(nombre);

            TiendaDao td = new TiendaDao();

            td.guardarFabricante(tienda);

        } catch (Exception e) {
            throw e;
        }
    }

}//final
