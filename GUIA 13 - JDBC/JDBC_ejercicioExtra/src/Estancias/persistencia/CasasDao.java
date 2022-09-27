/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidad.Casas;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Esteban
 */
public final class CasasDao extends DAO {

    public static Collection<Casas> casasAgosto() throws Exception {
        try {

            String sql = "select * from casas where fecha_desde <='2020-08-01' and fecha_hasta<='2020-08-31';";
            consultarBase(sql);
            Casas casita;
            Collection<Casas> casa = new ArrayList();
            while (resultado.next()) {
                casita = new Casas();

                casita.setId_casa(resultado.getInt(1));
                casita.setCalle(resultado.getString(2));
                casita.setNumero(resultado.getInt(3));
                casita.setCodigo_postal(resultado.getString(4));
                casita.setCiudad(resultado.getString(5));
                casita.setPais(resultado.getString(6));
                casita.setFecha_desde(resultado.getDate(7));
                casita.setFecha_hasta(resultado.getDate(8));
                casita.setTiempo_minimo(resultado.getInt(9));
                casita.setTiempo_maximo(resultado.getInt(10));
                casita.setPrecio_habitacion(resultado.getDouble(11)*0.05);
                casita.setTipo_vivienda(resultado.getString(12));

                casa.add(casita);
            }
            desconectarBase();
            return casa;

        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }

    }

    public static Collection<Casas> casasFechaDias(String fecha, int tiempomin, int tiempomax) throws Exception {
        try {

            // select * from casas where fecha_desde>='2019-08-01' and tiempo_minimo>=5 and tiempo_maximo<=30;
            String sql = "select * from casas where fecha_desde>= '" + fecha + "' and tiempo_minimo>= " + tiempomin + " and tiempo_maximo<= " + tiempomax + ";";
            consultarBase(sql);
            Casas casita;
            Collection<Casas> casa = new ArrayList();
            while (resultado.next()) {
                casita = new Casas();

                casita.setId_casa(resultado.getInt(1));
                casita.setCalle(resultado.getString(2));
                casita.setNumero(resultado.getInt(3));
                casita.setCodigo_postal(resultado.getString(4));
                casita.setCiudad(resultado.getString(5));
                casita.setPais(resultado.getString(6));
                casita.setFecha_desde(resultado.getDate(7));
                casita.setFecha_hasta(resultado.getDate(8));
                casita.setTiempo_minimo(resultado.getInt(9));
                casita.setTiempo_maximo(resultado.getInt(10));
                casita.setPrecio_habitacion(resultado.getDouble(11));
                casita.setTipo_vivienda(resultado.getString(12));

                casa.add(casita);
            }
            desconectarBase();
            return casa;

        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }

    }

}//final
