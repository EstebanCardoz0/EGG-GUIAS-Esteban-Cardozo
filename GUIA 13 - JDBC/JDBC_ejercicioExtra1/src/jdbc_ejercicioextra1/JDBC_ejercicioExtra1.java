/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicioextra1;

import java.util.Collection;
import jdbc_ejercicioextra1.entidades.Familias;
import jdbc_ejercicioextra1.entidades.persistencia.FamiliasDao;

/**
 *
 * @author Usuario
 */
public class JDBC_ejercicioExtra1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        

        Familias fami = new Familias(19, "Cardozo", 25, 58, 2, "soniel@1970", 4489);

        FamiliasDao fadao = new FamiliasDao();

        Collection hola= fadao.listarFamiliaHijos();
        for (Object object : hola) {
            System.out.println(object);
        }
       

    }//final

}
