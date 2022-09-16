/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import ENUMS.TipoDeCoche;
import Entidades.GestionIntegralCliente;
import Entidades.GestionDeVehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class GestionIntegralClienteServicio {

    List<GestionIntegralCliente> clientes = new ArrayList<>();

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCliente() {

        String resp;

        do {

            GestionIntegralCliente c = new GestionIntegralCliente();

            System.out.print("Nombre: ");
            String nombre = Leer.next();
            c.setNombre(nombre);

            System.out.print("Apellido: ");
            String apellido = Leer.next();
            c.setApellido(apellido);

            System.out.print("DNI: ");
            long dni = Leer.nextLong();
            c.setDni(dni);

            System.out.print("Mail: ");
            String mail = Leer.next();
            c.setMail(mail);

            System.out.print("Domicilio: ");
            String domicilio = Leer.next();
            c.setDireccion(domicilio);

            System.out.print("Telefono: ");
            long tel = Leer.nextLong();
            c.setTelefono(tel);

            System.out.println("Desea agregar otro cliente?");
            System.out.println("S (SI) - N (NO).");
            resp = Leer.next().toUpperCase();

            clientes.add(c);

        } while (resp.equalsIgnoreCase("S"));

    }

}
   

//final servicio
