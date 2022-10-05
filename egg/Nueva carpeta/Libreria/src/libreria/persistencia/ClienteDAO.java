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
import libreria.entidades.Autor;
import libreria.entidades.Cliente;

/**
 *
 * @author Bangho
 */
public class ClienteDAO {
    
        private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();
    
     public Cliente buscarPorId(Integer id) throws Exception {
        Cliente cliente = em.find(Cliente.class, id);
        return cliente;
    }
     
     public Cliente buscarPorNombre(String nombre) throws Exception {
        // Para traer objeto con el nombre
        Cliente cliente = (Cliente) em.createQuery("SELECT c "
                + " FROM Cliente c"
                + " WHERE c.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult();
        return cliente;
    }
    
    
     //C R U D
    //CREATE
    public void guardarCliente(Cliente cliente) throws Exception {
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
    }

    //READ
    public List<Cliente> listarTodos() throws Exception {
        List<Cliente> clientes = em.createQuery("SELECT c FROM Clientes c")
                .getResultList();
        return clientes;
    }
    //UPDATE

    public void modificarCliente(Cliente cliente) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(cliente); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
    }

    //DELETE
    public void eliminar(Integer id) throws Exception {
        Cliente cliente = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }

    public void eliminarPorNombre(String nombre) throws Exception {
        Cliente cliente = buscarPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }
    
    
    
}//final
