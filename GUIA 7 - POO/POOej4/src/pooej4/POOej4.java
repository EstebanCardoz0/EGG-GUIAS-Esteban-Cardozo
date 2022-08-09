/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidades.Rectangulo;
import RectanguloServicio.RectanguloServicio;

/**
 *
 * @author Usuario
 */
public class POOej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloServicio rs=new RectanguloServicio();
        Rectangulo re=rs.CrearRectangulo();
        
        
        rs.Perímetro(re);
        rs.Superficie(re);
       rs.dibujorec(re);
       
       
    }
    
}
