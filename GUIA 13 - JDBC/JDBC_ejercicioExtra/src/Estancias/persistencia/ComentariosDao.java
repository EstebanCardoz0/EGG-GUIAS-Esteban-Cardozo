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
public final class ComentariosDao extends DAO {
    
      private CasasDao casaDAO;

    public ComentariosDao() {
        this.casaDAO = new CasasDao();
    }

    public ArrayList<String> listarComentarios() throws Exception {
        try {
            ArrayList<Integer> idCasa = casaDAO.listHousesId();
            ArrayList<String> comments = new ArrayList<>();
            String comment = "";
            String sql = "";
            for (Integer aux : idCasa) {
                sql = "SELECT id_casa, comentario FROM comentarios WHERE id_casa = " + aux;
                consult(sql);
                while (resultSet.next()) {
                    comment = "id casa: " + resultSet.getInt(1) + " Comments: " + resultSet.getString(2);
                    comments.add(comment);
                }
                close();
            }
            return comments;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Integer> idHousesCleanList() throws Exception {
        try {
            ArrayList<Integer> id = casaDAO.idHouseByUK();
            ArrayList<Integer> idHouseClean = new ArrayList<>();
            String sql = "";
            for (Integer aux : id) {
                sql = "SELECT id_casa FROM comentarios WHERE comentario LIKE '%limpia%' AND id_casa = " + aux + ";";
                consult(sql);
                while (resultSet.next()) {
                    idHouseClean.add(resultSet.getInt(1));
                }
                close();
            }
            return idHouseClean;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    
    
}//final
