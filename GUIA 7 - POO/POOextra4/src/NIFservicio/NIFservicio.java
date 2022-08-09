/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFservicio;

import Entidade.NIF;
import java.util.Scanner;

/**
 *Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 * @author Esteban
 */
public class NIFservicio {
    
    public NIF crearNIF(){
 NIF nif=new NIF();
               Scanner leer = new Scanner(System.in).useDelimiter("\n");
               System.out.println("Ingrese su DNI (sin puntos)");
               nif.setDNI(leer.nextLong());
               //System.out.println("");
               String[] vector={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
               int división=(int) (nif.getDNI()%23);
               
               nif.setLetra(vector[división] );
              
          System.out.println("Su letra es la "+nif.getLetra());    
        return nif;
    }

    public void mostrar (NIF nif){
        System.out.println("--- Dígito verificador ---");
        
        
        System.out.println(nif.getDNI()+"-"+nif.getLetra());
    
    
    }
    
    
    
}
