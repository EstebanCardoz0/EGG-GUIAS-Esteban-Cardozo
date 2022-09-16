/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Lavadora extends Electrodomestico {

    int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        crearElectrodomestico();

        System.out.print("Escribra la capacidad de carga(kg): ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        setCarga(leer.nextInt());

    }

    @Override
    public void precioFinal() {
//        Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.

        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500);
            System.out.println("(por su capacidad de carga aumenta $500)");

        }
        System.out.println("PRECIO FINAL: $" + getPrecio());
    }

}//final clase
