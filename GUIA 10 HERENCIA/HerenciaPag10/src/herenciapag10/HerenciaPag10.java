/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapag10;

import Intefaces.Prueba;

/**
 *
 * @author Esteban
 */
public class HerenciaPag10 implements Prueba{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(NUMERO);
        
        System.out.println();
        
     Persona per=new Persona();
       
        per.tridente("Egg", "education", "herencia");
       
        System.out.println("-----------------");
        
        per.vacio();
        
        System.out.println("---------");
        
        System.out.println(per.vf());
        
        
        
        
        
        
        
         System.out.println("hola");

        ArrayList<Electrodomestico> listas = new ArrayList();

        Televisor tele1 = new Televisor(29, true, (1000), ColorEnum.NEGRO, "F", (555));
        Televisor tele2 = new Televisor(32, true, (1000), ColorEnum.AZUL, "B", (896));

        Lavadora lava1 = new Lavadora(43, (1000), "BLANCO", "F", (70));
        Lavadora lava2 = new Lavadora(20, (1000), "NEGRO", "A", (66));
        listas.add(tele1);
        listas.add(tele2);
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



        
    }

    @Override
    public void tridente(String uno, String dos, String tres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vacio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
