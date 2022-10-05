/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.PrestamoDAO;

/**
 *
 * @author Bangho
 */
public class ServicioPrestamo {
    
   Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    private PrestamoDAO prestamoDAO;
    
    public ServicioPrestamo(){
    
    prestamoDAO= new PrestamoDAO();
    }
    
      List <Libro> prestados =new ArrayList();
    
    public Prestamo creaPrestamo(Cliente cliente,Libro libro, Date fechaPrestamo,Date fechaDevolucion) {
        Prestamo prestamonuevo = new Prestamo();
        try
        {
            
//            if (nombre == null || nombre.trim().isEmpty())
//            {
//                throw new Exception("Debe indicar el nombre del prestamo");
//            }
            
            prestamonuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            prestamonuevo.setCliente(cliente);
            prestamonuevo.setLibro(libro);
            prestamonuevo.setFechaPrestamo(fechaPrestamo);
            prestamonuevo.setFechaDevolucion(fechaDevolucion);
            
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
            libro.setAlta(Boolean.FALSE);
            
          
            prestados.add(prestamonuevo.getLibro());
            
            prestamoDAO.guardarPrestamo(prestamonuevo);

            return prestamonuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    
    public void devolverPrestamo(){
    
        System.out.println("¿Qué libro querés devolver?");
        String devuelto=leer.next();
      
        for (Libro prestado : prestados) {
            if (prestado.getTitulo()==devuelto) {
                
                prestado.setAlta(Boolean.TRUE);
                prestado.setEjemplaresPrestados(prestado.getEjemplaresPrestados()-1);
                prestado.setEjemplaresRestantes(prestado.getEjemplaresRestantes()+1);
                
                prestados.remove(prestado);
                
            }
        }//final foreach
        
        
    
    
    
    }
    
    
    
    
}//final
