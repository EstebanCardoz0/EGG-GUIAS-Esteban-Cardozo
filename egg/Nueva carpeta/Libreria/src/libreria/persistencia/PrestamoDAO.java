/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Prestamo;

/**
 *
 * @author Bangho
 */
public class PrestamoDAO {
      private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();
    
     public Prestamo buscarPorId(Integer id) throws Exception {
        Prestamo prestamo = em.find(Prestamo.class, id);
        return prestamo;
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
    
    
     //C R U D
    //CREATE
    public void guardarPrestamo(Prestamo prestamo) throws Exception {
        em.getTransaction().begin();
        em.persist(prestamo);
        em.getTransaction().commit();
    }

    //READ
    public List<Prestamo> listarTodos() throws Exception {
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamos p")
                .getResultList();
        return prestamos;
    }
    //UPDATE

    public void modificarPrestamo(Prestamo prestamo) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(prestamo); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
    }

    //DELETE
    public void eliminar(Integer id) throws Exception {
        Prestamo cliente = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }

//    public void eliminarPorNombre(String nombre) throws Exception {
//        Prestamo cliente = buscarPorNombre(nombre);
//        em.getTransaction().begin();
//        em.remove(cliente);
//        em.getTransaction().commit();
//    }
//    
    
}
