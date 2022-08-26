/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class EdificioDeOficinas extends Edificio {
    
    String nombre;
 
    int numOficinas;
    int cantidadPersonasOficina;
    int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(String nombre, int numOficinas, int cantidadPersonasOficina, int pisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.numOficinas = numOficinas;
        this.cantidadPersonasOficina = cantidadPersonasOficina;
        this.pisos = pisos;
    }

   

  
 
    
//    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    public void canPersonas(){
        System.out.println("Edificio "+nombre);
        System.out.println("Capacidad por piso: "+cantidadPersonasOficina+" personas");
        System.out.println("Capacidad por piso: "+cantidadPersonasOficina*pisos+" personas");
        System.out.println("");
    
    }
    
    
    
    @Override
    public void calcularVolumen() {
        super.calcularVolumen(); //To change body of generated methods, choose Tools | Templates.
                int volumen = (ancho * largo) * alto;
        

        
            System.out.println("El volumen del edificio "+nombre+" es: "+volumen +" mts.");
    }

    @Override
    public void calcularSuperficie() {
        super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
       
        int superficie;
        int base = (ancho * largo) * 2;
        int cara1 = (ancho * alto) * 2;
        int cara2 = (alto * largo) * 2;

        superficie = (base + cara1 + cara2);

        

            System.out.println("La superficie del edificio "+nombre+" es: "+superficie +" mts.");

    }
}
