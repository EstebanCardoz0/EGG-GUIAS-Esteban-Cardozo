/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * @author Esteban
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public Alumno crearAlumno() {
        
    ArrayList<Integer> notas=new ArrayList();

        
            System.out.print("¿Cómo se llama el alumno?: ");
            String nombre = leer.next();
            System.out.println("");
            System.out.print("primer nota: ");
            
            notas.add(leer.nextInt());
            //System.out.println("");
            System.out.print("segunda nota: ");
            notas.add(leer.nextInt());
            //System.out.println("");
            System.out.print("tercera nota: ");
            notas.add(leer.nextInt());
            System.out.println("");
            

           

            return new Alumno(nombre, notas);

        

    }
    
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

    /**
     *
     * @param alumnito
     */
    
    public void notaFinal(ArrayList<Alumno> alumnito){
        System.out.print("Buscar por nombre: ");
        String nombre=leer.next();
        
        for (int i = 0; i < alumnito.size(); i++) {
           if (alumnito.get(i).getNombre().equalsIgnoreCase(nombre)) {
                
                double calculo=(alumnito.get(i).getNotas().get(0)+alumnito.get(i).getNotas().get(1)+alumnito.get(i).getNotas().get(2))/3;
                System.out.println("Promedio final: "+calculo);
            } 
            
            
            
        }
        
//        for (Alumno alumno : alumnito) {
//         int aux=0;
//            if (alumnito.get(aux).getNombre().equalsIgnoreCase(nombre)) {
//                
//                int calculo=(alumnito.get(aux).getNotas().get(0)+alumnito.get(aux).getNotas().get(1)+alumnito.get(aux).getNotas().get(2))/3;
//                System.out.println("Promedio final: "+calculo);
//            }
//            aux++;
//            
//        }
        
    
    }//final notafinal
    
    
    

}////final clase
