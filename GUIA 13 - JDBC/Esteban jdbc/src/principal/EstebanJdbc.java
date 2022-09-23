/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import principal.dominio.usuario.usuarioServicio;

/**
 *
 * @author Esteban
 */
public class EstebanJdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        usuarioServicio usuarioService = new usuarioServicio();
        try {
            usuarioService.crearUsuario(" malva @ malva ", " asdasdasda ");
        } catch (Exception ex) {
            Logger.getLogger(EstebanJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// final

}
