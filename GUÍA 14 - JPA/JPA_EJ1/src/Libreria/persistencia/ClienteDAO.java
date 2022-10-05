/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistencia;

import Libreria.entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Esteban
 */
public class ClienteDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_EJ1PU");
    private final EntityManager em = emf.createEntityManager();

    public Cliente buscarPorId(Integer id) throws Exception {

        try {
            if (id == null) {
                throw new Exception("debe indicar un ID");
            }

            Cliente cliente = em.find(Cliente.class, id);
            return cliente;
        } catch (Exception e) {
            throw e;
        }

    }

    public Cliente buscarPorNombre(String nombre) throws Exception {
         try {
            if (nombre== null) {
                throw new Exception("debe indicar un nombre");
            }
        // Para traer objeto con el nombre
        Cliente cliente = (Cliente) em.createQuery("SELECT c "
                + " FROM Cliente c"
                + " WHERE c.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult();
        return cliente;
         } catch (Exception e) {
            throw e;
        }
    }

    //C R U D
    //CREATE
    public void guardarCliente(Cliente cliente) throws Exception {
         try {
            if (cliente== null) {
                throw new Exception("debe indicar un cliente");
            }
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
         } catch (Exception e) {
            throw e;
        }
    }

    //READ
    public List<Cliente> listarTodos() throws Exception {
        try {
                List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c")
                .getResultList();
        return clientes;
        } catch (Exception e) {
            throw e;
        }
    
    }
    //UPDATE

    public void modificarCliente(Cliente cliente) throws Exception {
 try {
            if (cliente== null) {
                throw new Exception("debe indicar un cliente");
            }        
// Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(cliente); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
        
         } catch (Exception e) {
            throw e;
        }
    }

    //DELETE
    public void eliminar(Integer id) throws Exception {
        try {
            if (id== null) {
                throw new Exception("debe indicar un ID");
            }      
        Cliente cliente = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
           } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarPorNombre(String nombre) throws Exception {
         try {
            if (nombre== null) {
                throw new Exception("debe indicar un nombre");
            }    
        Cliente cliente = buscarPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
            } catch (Exception e) {
            throw e;
        }
    }

}
