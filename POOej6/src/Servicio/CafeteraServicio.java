/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la
 * capacidad máxima. • Método servirTaza(int): se pide el tamaño de una taza
 * vacía, el método recibe el tamaño de la taza y simula la acción de servir la
 * taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
 * para llenar la taza, se sirve lo que quede. El método le informará al usuario
 * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza. •
 * Método vaciarCafetera(): pone la cantidad de café actual en cero. • Método
 * agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author Usuario
 */
public class CafeteraServicio {

    public Cafetera definircafe() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera cf = new Cafetera();
        System.out.println("¿Cuál es la capacidad máxima de la cafetera?");
        cf.setCapacidadMax(leer.nextInt());
        System.out.println("¿Cuál es la cantidad actual (ml)");
        cf.setCantidadAct(leer.nextInt());
        return cf;

    }

    public void llenarCafetera(Cafetera cf) {

        cf.setCantidadAct(cf.getCapacidadMax());
        System.out.println("La cafetera está llena (" + cf.getCapacidadMax() + " ml)");

    }
//     • Método servirTaza(int): se pide el tamaño de una taza
// * vacía, el método recibe el tamaño de la taza y simula la acción de servir la
// * taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
// * para llenar la taza, se sirve lo que quede. El método le informará al usuario
// * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.

    public void servirTaza(Cafetera cf) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese capacidad de la taza (ml)");
        int taza = leer.nextInt();
        System.out.println("(Llenando taza...)");
        if (cf.getCantidadAct() >= taza) {
            System.out.println("La taza está llena");
            cf.setCantidadAct(cf.getCantidadAct() - taza);
        } else {
            System.out.println("Café insuficiente, solo se llenó " + cf.getCantidadAct() + "ml");
            cf.setCantidadAct(0);
        }
    }

    //•
// * Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cf) {
        cf.setCantidadAct(0);
        System.out.println("Se vació la cafetera");
    }

    //• Método
// * agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
// * recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cf) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuánto café querés agregar (ml)?");
          int agregar=leer.nextShort();
        cf.setCantidadAct(cf.getCantidadAct()+agregar);
        if (cf.getCantidadAct()>=cf.getCapacidadMax()) {
            System.out.println("La cafetera se llenó");
        }else{
            System.out.println("La cafetera tiene ahora "+(cf.getCantidadAct())+"ml");
        
        }
        
        
    }

}//final
