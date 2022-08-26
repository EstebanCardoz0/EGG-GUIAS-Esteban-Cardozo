/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 * @author Usuario
 */
public class AlumnoServicio {
                    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList <Alumno> listado(){
        
       String aux=null;
       int num=1;
        ArrayList <Alumno> listado=new ArrayList();
       
        do {
            Alumno alu=new Alumno();
            ArrayList<Integer> not=new ArrayList();
            System.out.println("Alumno "+num);
            
            System.out.print("Escribra su nombre: ");
            alu.setNombre(leer.next());
            System.out.print("Escriba la 1er nota: ");
            not.add(leer.nextInt());
            System.out.print("Escriba la 2da nota: ");
            not.add(leer.nextInt());
            System.out.print("Escriba la 3er nota: ");
            not.add(leer.nextInt());
            
            alu.setNotas(not);
            
            listado.add(alu);
            System.out.println("");
            num++;
            System.out.print("¿Desea ingresar otro alumno? (s/n): ");
            aux=leer.next();
            
        } while (!aux.equalsIgnoreCase("n"));
        
        
        
        return listado;
    }
    
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    
    public void notaFinal(ArrayList<Integer> lista){
        
        double promedio=(lista.get(0)+lista.get(1)+lista.get(2))/3;
       
        
        
        System.out.println("El promedio final es: "+promedio);
    }
    
}
