/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Arreglo;

/**
 *
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 * @author Esteban
 */
public class ArregloServicio {
    
    public static Arreglo crearVector(){
        Arreglo arA=new Arreglo();
        double[] vectorA=new double [50];
        int ind=0;
        System.out.println("VECTOR A");
        for (int i = 0; i < 50; i++) {
            vectorA[i]=Math.random()*10;
            System.out.println("Ind "+ind+": "+vectorA[i]);
            ind++;
        }
        System.out.println("");
        
        int orden=0,pos=0;
        double men;
        while (orden<50) {
            men=vectorA[orden];
            for (int i = orden; i < 50; i++) {
                if (men>vectorA[i]) {
                    men=vectorA[i];
                    pos=i;
                }
            }
            vectorA[pos]=vectorA[orden];
            vectorA[orden]=men;
            orden++;
        }
        arA.setVectorA(vectorA);
        
        
           System.out.println("");
                System.out.println("VECTOR A (menor a mayor)");
                
                for (int i = 0; i < 50; i++) {
                    System.out.print(vectorA[i]+" ");
        }
        System.out.println("");
        
        double[] vectorB=new double [20];
        int aux=0;
        int ulti=10;
        System.out.println("VECTOR B");
        for (int i = 0; i < 10; i++) {
            vectorB[i]=vectorA[i];
            vectorB[ulti]=0.5;
            ulti++;
            
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
          System.out.println("Ind "+aux+": "+vectorB[i]);
          aux++;
        }
        
        
        return arA;
    
     
        
    }
    
                

    
    
    
    
}
