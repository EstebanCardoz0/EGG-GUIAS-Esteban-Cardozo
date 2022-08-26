/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra3;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class HerenciaExtra3 {

    /**
     * Realizar un sistema de consulta que le permite al usuario consultar por
     * diferentes criterios: • todos los alojamientos. • todos los hoteles de
     * más caro a más barato. • todos los campings con restaurante • todos las
     * residencias que tienen descuento.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Alojamiento> cuchas = new ArrayList();

        Hotel4 hotel4 = new Hotel4("a", "Don Manolo", 80, 32, 90, 4, "Hotel 4E. Macha", "Santa Fe s/n", "Machagai", "Eugenia Torres");
        Hotel4 hotel41 = new Hotel4("b", "Exquisito", 67, 25, 74, 3, "Hotel 4E. Dos se van", "E. del Campo", "Corrientes", "Esteban Cardozo");
        Hotel5 hotel5 = new Hotel5(1, 5, 8, "a", "Don manolo", 45, 33, 33, 2, "Hotel 5E. Tutú", "Orcola 345", "Resistencia", "Telma Trangoni");
        Hotel5 hotel51 = new Hotel5(2, 3, 10, "b", "Don manolo", 33, 45, 14, 4, "Hotel 5E. Lo de Elsa", "Cristo Rey 3342", "Resistencia", "Elsa González");
        Alojamiento camping = new Camping(26, 10, false, true, 100.0, "Camping Complejo Totora", "Calle de tierra", "San Cosme", "Don Rojas");
        Alojamiento camping1 = new Camping(34, 25, true, false, 124.0, "Camping Curuzú Jaime", "Entrada principal", "Ramada Paso", "Longui");
        Alojamiento residencia = new Residencia(15, true, false, true, 57.0, "Residencia Finkecueva", "Virasoro 1900", "Corrientes", "Dominique Finke");
        Alojamiento residencia1 = new Residencia(4, false, true, false, 29.0, "Residencia El Sanger", "Ontiveros 4785", "Corrientes", "Frenky Acevedo");

        cuchas.add(hotel4);
        cuchas.add(hotel41);
        cuchas.add(hotel5);
        cuchas.add(hotel51);
        cuchas.add(camping);
        cuchas.add(camping1);
        cuchas.add(residencia);
        cuchas.add(residencia1);

        System.out.println("---Alojamientos---");
        System.out.println("");
        int num = 1;
        for (Alojamiento cu : cuchas) {

            System.out.println(num + ". " + cu.getNombre());
            num++;
        }
        System.out.println("");
        System.out.println("---Precios---");
        List<Hotel4> hoteles = new ArrayList();
        hoteles.add(hotel4);
        hoteles.add(hotel41);
        hoteles.add(hotel5);
        hoteles.add(hotel51);

        hoteles.sort(Hotel4.compararPrecio);

        for (Hotel4 hotele : hoteles) {
        System.out.println(hotele.getNombre() + ": $" + ((Hotel4) hotele).calcularPrecio());

        }

        System.out.println("");
        System.out.println("---Campings con restaurante---");
        for (Alojamiento cucha : cuchas) {
            if (cucha instanceof Camping) {
                if (((Camping) cucha).isRestaurant()) {
                    System.out.println(cucha.getNombre());
                }
            }
        }
        System.out.println("");
        System.out.println("---Residencias con descuento---");
        for (Alojamiento cucha : cuchas) {
            if (cucha instanceof Residencia) {
                if (((Residencia) cucha).isDescGremios()) {
                    System.out.println(cucha.getNombre());
                }
            }
        }
    }//final main

}
