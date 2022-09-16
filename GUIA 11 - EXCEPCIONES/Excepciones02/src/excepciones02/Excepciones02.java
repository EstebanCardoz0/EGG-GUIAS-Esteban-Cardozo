/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 * @author Esteban
 */
public class Excepciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                  Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] numeros=new int [4];
        
        int num=34;
        
        try{
        
        numeros[6]=num;
            
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("te pasaste pavote");
        }
        
        
        
        
        
    }
    
}
