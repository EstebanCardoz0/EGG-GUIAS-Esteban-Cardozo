/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistencia;

import Libreria.entidades.Prestamo;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Esteban
 */
public class PrestamoDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_EJ1PU");
    private final EntityManager em = emf.createEntityManager();

    public Prestamo buscarPorId(Integer id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe indicar un ID");
            }

            Prestamo prestamo = em.find(Prestamo.class, id);
            return prestamo;

        } catch (NoResultException ex) {
            return null;

        } catch (Exception e) {
            throw e;
        }

    }

//     public Prestamo buscarPorNombre(String nombre) throws Exception {
//        // Para traer objeto con el nombre
//        Prestamo cliente = (Prestamo) em.createQuery("SELECT c "
//                + " FROM Prestamo p"
//                + " WHERE p.nombr LIKE :nombre").
//                setParameter("nombre", nombre).
//                getSingleResult();
//        return cliente;
//    }
    
    
    
     public Collection<Prestamo> listLoanByCustomer(Long dni) throws Exception {
        try {
            if (dni == null) {
                throw new Exception("dni null");
            }
            String isbnString = String.valueOf(dni);
            isbnString = isbnString.substring(0, isbnString.length() - 1);
            Long newDni = Long.parseLong(isbnString);
            Query nativeQuery = em.createNativeQuery("SELECT ID FROM Prestamo WHERE LIBRO_ISBN = " + newDni, Prestamo.class);
            nativeQuery.setParameter("isbn", newDni);
            
            Collection<Prestamo> loans = nativeQuery.getResultList();
            return loans;
        } catch (NoResultException ex) {
            return null;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Prestamo buscarISBN(Long isbn) throws Exception {
        try {
            if (isbn == null) {
                throw new Exception("isbn nulo");
            }
            String isbnString = String.valueOf(isbn);
            isbnString = isbnString.substring(0, isbnString.length() - 1);
            Long newIsbn = Long.parseLong(isbnString);
            Query nativeQuery = em.createNativeQuery("SELECT ID FROM Prestamo WHERE LIBRO_ISBN = " + newIsbn, Prestamo.class);
            nativeQuery.setParameter("isbn", isbn);
            return (Prestamo) nativeQuery.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
    
        public void borrarPrestamo(Prestamo loan) throws Exception {
        try {
            if (loan == null) {
                throw new Exception("loan nulo");
            }

            em.getTransaction().begin();
            em.remove(loan);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }
    //C R U D
    //CREATE
    public void guardarPrestamo(Prestamo prestamo) throws Exception {

        try {
            if (prestamo == null) {
                throw new Exception("Debe indicar un préstamo");
            }

            em.getTransaction().begin();
            em.persist(prestamo);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }

    }

    //READ
    public List<Prestamo> listarTodos() throws Exception {
        
        try {
            List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p")
                    .getResultList();
            return prestamos;
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    //UPDATE

    public void modificarPrestamo(Prestamo prestamo) throws Exception { // Este metodo es para ingresar o modificar
        try {
            
            if (prestamo == null) {
                throw new Exception("Debe indicar un préstamo");
            }
            
             em.getTransaction().begin();
        em.merge(prestamo); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
        
       
    }

    //DELETE
    public void eliminar(Integer id) throws Exception {
         if (id == null) {
                throw new Exception("Debe indicar un ID");
            }
        try {
             Prestamo cliente = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
       
    }

//    public void eliminarPorNombre(String nombre) throws Exception {
//        Prestamo cliente = buscarPorNombre(nombre);
//        em.getTransaction().begin();
//        em.remove(cliente);
//        em.getTransaction().commit();
//    }
//    
}
