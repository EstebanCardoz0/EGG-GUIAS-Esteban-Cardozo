 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Canciones;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Esteban
 */
public class CancionesJpaController implements Serializable {

    public CancionesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public CancionesJpaController() {
        emf=Persistence.createEntityManagerFactory("rhcpPU");
        
    }

    
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Canciones canciones) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(canciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCanciones(canciones.getCodigo_canc()) != null) {
                throw new PreexistingEntityException("Canciones " + canciones + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Canciones canciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            canciones = em.merge(canciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = canciones.getCodigo_canc();
                if (findCanciones(id) == null) {
                    throw new NonexistentEntityException("The canciones with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Canciones canciones;
            try {
                canciones = em.getReference(Canciones.class, id);
                canciones.getCodigo_canc();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The canciones with id " + id + " no longer exists.", enfe);
            }
            em.remove(canciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Canciones> findCancionesEntities() {
        return findCancionesEntities(true, -1, -1);
    }

    public List<Canciones> findCancionesEntities(int maxResults, int firstResult) {
        return findCancionesEntities(false, maxResults, firstResult);
    }

    private List<Canciones> findCancionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Canciones.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Canciones findCanciones(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Canciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getCancionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Canciones> rt = cq.from(Canciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
