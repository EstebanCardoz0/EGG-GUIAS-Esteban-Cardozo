/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class RaicesServicio {
    
    public Raices crearRaices(){
        Raices ra=new Raices();
               Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Definí el coeficiente A");
        ra.setCoa(leer.nextInt());
        System.out.println("Definí el coeficiente B");
        ra.setCob(leer.nextInt());
        System.out.println("Definí el coeficiente B");
        ra.setCoc(leer.nextInt());
        
        
        
        
        return ra;
    
    }
            
//       Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public void getDiscriminante(Raices ra){
    
    double discriminante=(pow(ra.getCob(),2))-4*ra.getCoa()*ra.getCoc();
        System.out.println("Discriminante: "+discriminante);
    
    }
    
//• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices ra){
    boolean tiene;
        if ((pow(ra.getCob(),2))-4*ra.getCoa()*ra.getCoc()>=0) {
            tiene=true;
            System.out.println("¿Tiene dos soluciones?: SI");
        }else{
        tiene=false;
                    System.out.println("¿Tiene dos soluciones?: NO");

        }
        return tiene;
    
    
    }
    
    
//• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices ra){
    boolean tiene;
        if ((pow(ra.getCob(),2))-4*ra.getCoa()*ra.getCoc()==0) {
            tiene=true;
            System.out.println("¿Tiene una única solución");
        }else{
        tiene=false;
                    //System.out.println("¿Tiene dos soluciones?: NO");

        }
        return tiene;
    
    
    }
    
    
//• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
//soluciones.
    public void obtenerRaices(Raices ra){
        if (tieneRaices(ra)==true) {
            System.out.println("Solución 1: "+(-ra.getCob()+Math.sqrt(Math.pow(ra.getCob(),2)-(4*ra.getCoc())))/(2*ra.getCoa()));
            System.out.println("Solución 2: "+(-ra.getCob()-Math.sqrt(Math.pow(ra.getCob(),2)-(4*ra.getCoc())))/(2*ra.getCoa()));
        }
    //System.out.println((-rl.getB()+Math.sqrt(Math.pow(rl.getB(),2)-(4*r1.getA()*r1.getC())))/(2*r1.getA()));
//TEXTO COPIADO
    }
    
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices ra){
        if (tieneRaiz(ra)==true) {
                        System.out.println("Solución 1: "+(-ra.getCob()+Math.sqrt(Math.pow(ra.getCob(),2)-(4*ra.getCoc())))/(2*ra.getCoa()));

        }
    
    
    }
    
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    
    public void calcular (Raices ra){
        if (tieneRaices(ra)==true) {
            obtenerRaices(ra);
            
            
        }else if(tieneRaiz(ra)==true){
            obtenerRaiz(ra);
        
        }else{
            System.out.println("No hay ninguna solución posible");
        
        }
    
    
    
    }
    
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b     
    
    
    
    
    
}
