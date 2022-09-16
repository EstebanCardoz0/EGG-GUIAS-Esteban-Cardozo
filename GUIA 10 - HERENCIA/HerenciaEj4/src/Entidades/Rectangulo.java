/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Esteban
 */
public class Rectangulo implements CalculosFormas {
    
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    
    
    
    

    @Override
    public void area() {
  //To change body of generated methods, choose Tools | Templates.
     double area=base*altura;
        System.out.println("ÁREA: "+area);
  
    }

    @Override
    public void perimetro() {
       
   double perimetro=(base+altura)*2;
        System.out.println("PERÍMETRO: "+perimetro);

//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
