/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias;

import Estancias.entidad.Casas;
import Estancias.entidad.Familias;
import Estancias.persistencia.CasasDao;
import static Estancias.persistencia.CasasDao.casasAgosto;
import Estancias.persistencia.FamiliaDao;
import static Estancias.persistencia.FamiliaDao.familiaMail;
import com.mysql.fabric.FabricCommunicationException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Esteban
 */
public class JDBC_ejercicioExtra {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
       
        FamiliaDao fam=new FamiliaDao();
        
       CasasDao casita= new CasasDao();
       
     
Familias fan=new Familias(19, "Cardozo", 25, 58, 2, "soniel@1970", 19);

//fam.guardarFamilia(fan);
      
      

    
    Collection <Casas> col = casita.casasFechaDias("2019-08-01", 5, 30);
    
        for (Casas casas : col) {
            System.out.println(casas);
        }
        
        
        
        
    }//final main
    
}
