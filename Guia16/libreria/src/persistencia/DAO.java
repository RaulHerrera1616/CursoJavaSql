package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<T> {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria");
    EntityManager em = emf.createEntityManager();

    public void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void guardar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(T objeto) {
        conectar();
        em.getTransaction().begin();
        T entidadGestionada = em.merge(objeto); // Fusionar la entidad desconectada
        em.remove(entidadGestionada);
        em.getTransaction().commit();
        desconectar();
    }
}
