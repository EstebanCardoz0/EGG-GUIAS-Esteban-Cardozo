/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidad.Familias;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Esteban
 */
public final class FamiliaDao extends DAO {

    public  void guardarFamilia(Familias familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("familia null");
            }
            String sql = "INSERT INTO familia (id_familia, nombre, edad_minima, edad_maxima, num_hijos, email, id_casa_familia) "
                    + "VALUES (" + familia.getId_familia() + ", '" + familia.getNombre() + "' , " + familia.getEdad_minima() + " , " + familia.getEdad_maxima() + " , " + familia.getNum_hijos() + " , '" + familia.getEmail() + "' , " + familia.getId_casa_familia()+ ");";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    

    public static Collection<Familias> listarFamiliasHijos() throws Exception {

        try {

            String sql = "select * from familias where num_hijos>=3 and edad_maxima<10;";
            consultarBase(sql);
            Familias fami;
            Collection<Familias> familia = new ArrayList();
            while (resultado.next()) {
                fami = new Familias();
                
                fami.setId_familia(resultado.getInt("id_familia"));

                fami.setNombre(resultado.getString("nombre"));
                fami.setEdad_minima(resultado.getInt(3));
                fami.setEdad_maxima(resultado.getInt(4));
                fami.setNum_hijos(resultado.getInt(5));
                fami.setEmail(resultado.getString(6));
                fami.setId_casa_familia(resultado.getInt(7));
                
                

                familia.add(fami);
            }
            desconectarBase();
            return familia;

        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }

    }
    
    
    public static Collection<Familias> familiaMail() throws Exception {

        try {

            String sql = "select * from familias where email like '%hotmail%';";
            consultarBase(sql);
            Familias fami;
            Collection<Familias> familia = new ArrayList();
            while (resultado.next()) {
                fami = new Familias();
                
                fami.setId_familia(resultado.getInt("id_familia"));

                fami.setNombre(resultado.getString("nombre"));
                fami.setEdad_minima(resultado.getInt(3));
                fami.setEdad_maxima(resultado.getInt(4));
                fami.setNum_hijos(resultado.getInt(5));
                fami.setEmail(resultado.getString(6));
                fami.setId_casa_familia(resultado.getInt(7));
                
                

                familia.add(fami);
            }
            desconectarBase();
            return familia;

        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }

    }

}//final
