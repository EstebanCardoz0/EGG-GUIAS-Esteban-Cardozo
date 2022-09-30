/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistencia;

import Libreria.entidades.Editorial;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class EditorialDAO {
    
     private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_EJ1PU");
    private final EntityManager em = emf.createEntityManager();

    public List<Editorial> buscarPorNombre(String nombre) throws Exception {
        // Para traer objeto con el nombre
        List<Editorial> editorial = em.createQuery("SELECT d "
                + " FROM Editorial d"
                + " WHERE d.nombre LIKE CONCAT('%', :nombre, '%')", Editorial.class)
                .setParameter("nombre", nombre)
                .getResultList();
        return editorial;
    }

    public Editorial buscarPorId(String id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id);
        return editorial;
    }

    public void guardarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public List<Editorial> listarTodos() throws Exception {
        List<Editorial> editoriales = em.createQuery("SELECT d FROM Editorial d")
                .getResultList();
        return editoriales;
    }

    public void modificarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(editorial); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
    }

    public void eliminar(Editorial editorial) throws SQLIntegrityConstraintViolationException, Exception {
        //Editorial editorial = buscarPorId(id);
        
        try
        {
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
            throw new SQLIntegrityConstraintViolationException();
            
        } catch (Exception e)
        {
            //e.printStackTrace();
           throw e;

        }

    }
    
    
    
    
    
}//final
