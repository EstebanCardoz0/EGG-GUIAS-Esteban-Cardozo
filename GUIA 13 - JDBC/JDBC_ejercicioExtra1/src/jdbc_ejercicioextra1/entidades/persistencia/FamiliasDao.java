/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicioextra1.entidades.persistencia;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import jdbc_ejercicioextra1.entidades.Familias;

/**
 *
 * @author Usuario
 */
public final class FamiliasDao extends DAO {
    
    /**
     *
     * @param familia
     * @throws Exception
     */
    public   void guardarFamilia(Familias familia) throws Exception {
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
    
    public Collection<Familias> listarFamiliaHijos() throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos <= 3 AND edad_maxima <= 10;";
             consultarBase(sql);
            Collection<Familias> families = new ArrayList();
            Familias family = null;
            while (resultado.next()) {
                family = new Familias();
                family.setId_familia(resultado.getInt(1));
                family.setNombre(resultado.getString(2));
                family.setEdad_minima(resultado.getInt(3));
                family.setEdad_maxima(resultado.getInt(4));
                family.setNum_hijos(resultado.getInt(5));
                family.setEmail(resultado.getString(6));
                family.setId_casa_familia(resultado.getInt(7));
               
             
                families.add(family);
            }
            desconectarBase();
            return families;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    
    
}//final///////////////////////////


