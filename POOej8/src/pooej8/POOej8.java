/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 * En el main se creará el objeto y se le pedirá al usuario que ingrese una
 * frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de
 * manera automática según la longitud de la frase ingresada.
 *
 * @author Esteban
 */
public class POOej8 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena cad1 = cs.crearCadena();
        System.out.println("---");
       cs.mostrarVocales(cad1);
        System.out.println("---");
        cs.invertirFrase(cad1);
        System.out.println("---");
        cs.vecesRepetido(cad1);
        System.out.println("---");
//IR AL SERVICIO
cs.compararLongitud(cad1);
        System.out.println("---");   
        cs.unirFrases(cad1);
        System.out.println("---");
        cs.reemplazar(cad1);
         System.out.println("---");
         cs.contiene(cad1);
    }//

}
