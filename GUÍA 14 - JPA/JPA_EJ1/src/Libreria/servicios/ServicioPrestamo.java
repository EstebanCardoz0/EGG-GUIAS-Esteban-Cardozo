/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Cliente;
import Libreria.entidades.Libro;
import Libreria.entidades.Prestamo;
import static Libreria.entidades.Prestamo_.libro;
import Libreria.persistencia.PrestamoDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Libreria.servicios.LibroServicio;

/**
 *
 * @author Esteban
 */
public class ServicioPrestamo {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    private PrestamoDAO prestamoDAO;

    public ServicioPrestamo() {

        prestamoDAO = new PrestamoDAO();
    }

    List<Libro> prestados = new ArrayList();
    LibroServicio ls=new LibroServicio();
    ServicioCliente sc=new ServicioCliente();
    
    public Prestamo creaPrestamo(String nombrecliente, String nombrelibro, Date fechaPrestamo, Date fechaDevolucion) {
        Prestamo prestamonuevo = new Prestamo();
        try {

//            if (nombre == null || nombre.trim().isEmpty())
//            {
//                throw new Exception("Debe indicar el nombre del prestamo");
//            }
            Random azar = new Random();
            prestamonuevo.setId(azar.nextInt(159));

            prestamonuevo.setCliente(sc.buscaCliente(nombrecliente));
            //SEGUIR POR ACÁ
            
            prestamonuevo.setLibro(ls.buscaLibro(nombrelibro));
            prestamonuevo.setFechaPrestamo(fechaPrestamo);
            prestamonuevo.setFechaDevolucion(fechaDevolucion);
            
            prestamonuevo.getLibro().setEjemplaresPrestados(prestamonuevo.getLibro().getEjemplaresPrestados()+1);
            prestamonuevo.getLibro().setEjemplaresRestantes(prestamonuevo.getLibro().getEjemplaresRestantes()-1);
            prestamonuevo.getLibro().setAlta(Boolean.FALSE);

          

            prestados.add(prestamonuevo.getLibro());

            prestamoDAO.guardarPrestamo(prestamonuevo);

            return prestamonuevo;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void devolverPrestamo() {

        System.out.println("¿Qué libro querés devolver?");
        String devuelto = leer.next();

        for (Libro prestado : prestados) {
            if (prestado.getTítulo().equalsIgnoreCase(devuelto)) {

                prestado.setAlta(Boolean.TRUE);
                prestado.setEjemplaresPrestados(prestado.getEjemplaresPrestados() - 1);
                prestado.setEjemplaresRestantes(prestado.getEjemplaresRestantes() + 1);

                prestados.remove(prestado);

            }
        }//final foreach

    }

}//final
