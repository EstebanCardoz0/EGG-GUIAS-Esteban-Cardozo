/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public final class EstanciasDao extends DAO {
    
    /**
     * method that returns the list of some of the ids of the table estancias
     *
     * @param id
     * @return idClientes
     * @throws Exception
     */
    public ArrayList<Integer> listaXid (String id) throws Exception {
        
        try {
            if (id.isEmpty() || id == null) {
                throw new Exception("id vacia o nula");
            }
            String sql = "SELECT " + id + " FROM estancias;";
            consultarBase(sql);
            ArrayList<Integer> idClientes = new ArrayList<>();
            while (resultado.next()) {
                idClientes.add(resultado.getInt(1));
            }
            desconectarBase();
            return idClientes;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    
    
}//final
