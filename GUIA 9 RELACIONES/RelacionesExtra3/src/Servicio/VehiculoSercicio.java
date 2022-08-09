/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.GestionDeVehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class VehiculoSercicio {
    
        List<GestionDeVehiculo> vehiculos = new ArrayList<>();

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void crearVehiculo() {

        String resp;

        do {

            GestionDeVehiculo v = new GestionDeVehiculo();

            System.out.print("Marca: ");
            String marca = Leer.next();
            v.setMarca(marca);

            System.out.print("Modelo: ");
            String modelo = Leer.next();
            v.setModelo(modelo);

            System.out.print("Año: ");
            int anio = Leer.nextInt();
            v.setAnio(anio);

            System.out.print("Número de motor: ");
            Long numMotor = Leer.nextLong();
            Integer numeroMotor = null;
            v.setNumeroMotor(numeroMotor);

            System.out.print("Número de chasis: ");
            Long chasis = Leer.nextLong();
            v.setChasis(chasis);
            System.out.print("Color: ");
            String color = Leer.next();
            v.setColor(color);

            
            System.out.println("Desea agregar otro cliente?");
            System.out.println("S (SI) - N (NO).");
            resp = Leer.next().toUpperCase();

            vehiculos.add(v);

        } while (resp.equalsIgnoreCase("S"));

    }

    
}
