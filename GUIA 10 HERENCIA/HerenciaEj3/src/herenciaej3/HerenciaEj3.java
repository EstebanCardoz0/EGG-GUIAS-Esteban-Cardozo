/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej3;

import ENUM.ColorEnum;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class HerenciaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("hola");

        ArrayList<Electrodomestico> listas = new ArrayList();

//        Televisor tele1 = new Televisor(29, true, 1000, "negro", "F", 555);
//        Televisor tele2 = new Televisor(32, true, (1000), "azul", "B", (896));
//        Televisor tele1 = new Televisor();
//        Televisor tele2 = new Televisor();

        Lavadora lava1 = new Lavadora(43, (1000), "BLANCO", "F", (70));
        Lavadora lava2 = new Lavadora(20, (1000), "NEGRO", "A", (66));
//        lilistas.add(tele1);
//        stas.add(tele2);
        listas.add(lava1);
        listas.add(lava2);

//        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
        for (Electrodomestico electro : listas) {
            System.out.println(electro.getPrecio());
        }

    }//final main

}
