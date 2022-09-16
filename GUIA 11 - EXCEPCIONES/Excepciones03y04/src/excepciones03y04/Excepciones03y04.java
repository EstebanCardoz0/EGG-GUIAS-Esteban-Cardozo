/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones03y04;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Excepciones03y04 {

    /**
     * Defina una clase llamada DivisionNumero. En el método main utilice un
     * Scanner para leer dos números en forma de cadena. A continuación, utilice
     * el método parseInt() de la clase Integer, para convertir las cadenas al
     * tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
     * una división con los dos numeros y mostrar el resultado.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        DivisionNumero div = new DivisionNumero();

        System.out.println("Ingrese dos números");
        System.out.print("num 1: ");
        String cad1 = leer.next();
        System.out.print("num 2: ");
        String cad2 = leer.next();
        
        
        int aux1= parseInt(cad1,10);
        int aux2= parseInt(cad2,10);
        System.out.println("");
       div.division(aux1, aux2);
    
        
    }

}
