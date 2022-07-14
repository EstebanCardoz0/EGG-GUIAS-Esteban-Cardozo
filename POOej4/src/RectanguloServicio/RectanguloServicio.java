/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloServicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
   

* 

 * @author Usuario
 */
public class RectanguloServicio {
   
    
    public Rectangulo CrearRectangulo(){
         Rectangulo rec=new Rectangulo();
         Scanner leer = new Scanner(System.in);
         
         System.out.println("ingrese la altura");
         rec.setAltura(leer.nextDouble());
         
        System.out.println("ingrese la base");
        rec.setBase(leer.nextDouble());
            
        return rec ;
    
    }
    //Superficie = base * altura
    public double Superficie(Rectangulo rec){
        
        double superficie=rec.getBase()*rec.getAltura();
        
        return superficie;
   
    }
    //Perímetro = (base + altura) * 2
    public double Perímetro(Rectangulo rec){
        
        double perímetro=(rec.getBase()+rec.getAltura())*2;
        
        return perímetro;
   
    }
    //un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    
    public void dibujorec(Rectangulo rec){
    
        System.out.println("Réctangulo: ");
        System.out.println();
        for(int h = 1; h <= rec.getAltura(); h++) {
            for(int b = 1; b <= rec.getBase(); b++) {
                if(h == 1 || h == rec.getAltura()) {
                    System.out.print(" * ");
                } else if(b == 1 || b == rec.getBase()) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    
    
    
    
}//final
