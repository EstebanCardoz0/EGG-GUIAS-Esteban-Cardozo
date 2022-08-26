/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Esteban
 */
public class Alquiler {

    String nombre;
    int dni;
    LocalDate inicio;
    LocalDate devolucion;
    int posAmarre;
    Barco nave;

    public Alquiler(String nombre, int dni, LocalDate inicio, LocalDate devolucion, int posAmarre, Barco nave) {
        this.nombre = nombre;
        this.dni = dni;
        this.inicio = inicio;
        this.devolucion = devolucion;
        this.posAmarre = posAmarre;
        this.nave = nave;
    }

    public Alquiler() {
    }

    public void calcularAlquiler() {

        long dias = ChronoUnit.DAYS.between(inicio, devolucion);
//        System.out.println("dias de diferencia "+dias);
//        System.out.println("modulo "+nave.modulo());



        int precio = (int) dias * nave.modulo();
        
        

        System.out.println("El alquiler costará: $" + precio);

    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", inicio=" + inicio + ", devolucion=" + devolucion + ", posAmarre=" + posAmarre + ", nave=" + nave + '}';
    }

}
