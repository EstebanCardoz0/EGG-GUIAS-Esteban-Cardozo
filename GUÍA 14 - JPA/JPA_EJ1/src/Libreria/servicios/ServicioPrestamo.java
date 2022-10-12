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
import java.util.Collection;

/**
 *
 * @author Esteban
 */
public class ServicioPrestamo {

   private PrestamoDAO prestamoPersistence;
    private LibroServicio libroService;
    private ServicioCliente clienteService;

    /**
     * Constructer method
     */
    public ServicioPrestamo() {
        this.prestamoPersistence = new PrestamoDAO();
        this.libroService = new LibroServicio();
        this.clienteService = new ServicioCliente();
    }

    /**
     * Method to create loan
     *
     * @param id
     * @param loanDate
     * @param dateOfReturn
     * @param isbn
     * @param dni
     * @throws Exception
     */
    public void crearPrestamo(Integer id, Date loanDate, Date dateOfReturn, Long isbn, Long dni) throws Exception {
        try {
            if (id == null || prestamoPersistence.buscarPorId(id) != null) {
                throw new Exception("id nula");
            }
            if (isbn == null || libroService.buscaISBN(isbn)== null) {
                throw new Exception("isbn nulo");
            }
           
            if (dni == null || clienteService.buscarDni(dni) == null) {
                throw new Exception("dni null or unregistered customer");
            }
            if (dateOfReturn.before(loanDate)) {
                throw new Exception("Fecha de devolución anterior a la fecha de prestamo");
            }
            if (dateOfReturn == null) {
                throw new Exception("Fecha de devolución nula");
            }
            if (loanDate == null) {
                throw new Exception("Fecha de prestamo nula");
            }

            Libro libro = libroService.buscaISBN(isbn);
            if (libro.getEjemplaresRestantes() > 0 && libro.getAlta()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setId(id);
                prestamo.setFechaPrestamo(loanDate);
                prestamo.setFechaDevolucion(dateOfReturn);
                prestamo.setLibro(libroService.buscaISBN(isbn));
               
                prestamo.setCliente(clienteService.buscarDni(dni));

                prestamoPersistence.guardarPrestamo(prestamo);
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
             
                libroService.actualizaLibro(libro);
            } else {
                System.out.println("ALGO SALIÓ MAL");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Method that searches for the loan according to the book's isbn, deletes
     * the loan, and updates the book's statu
     *
     * @param isbn
     * @throws Exception
     */
    public void returnABook(Long isbn) throws Exception {
        try {
            if (isbn == null) {
                throw new Exception("isbn null");
            }
            
            Prestamo loan = (Prestamo) prestamoPersistence.buscarISBN(isbn);
            prestamoPersistence.borrarPrestamo(loan);

            Libro libro = libroService.buscaISBN(isbn);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
    
            libroService.actualizaLibro(libro);
        } catch (Exception e) {
            throw e;
        }
    }
    
    /**
     * Method that searches for loans per customer
     * 
     * @param dni
     * @throws Exception 
     */
    public void searchLoanByCustomer(Long dni) throws Exception{
        try {
            if(dni == null){
                throw new Exception("dni nulo");
            }
            //SUMAR ESTO AL SERVICIO CLIENTE
            Cliente customer = clienteService.buscarDni(dni);
            Collection<Prestamo> customers = prestamoPersistence.listLoanByCustomer(dni);
            for(Prestamo aux : customers){
                System.out.println("TÍTULO: " + aux.getLibro().getTítulo());
            }
        } catch (Exception e) {
            throw e;
        }
    }

}//final
