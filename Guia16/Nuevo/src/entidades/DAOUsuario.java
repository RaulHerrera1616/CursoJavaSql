
package entidades;

import javax.persistence.EntityManager;


public class DAOUsuario {
    private EntityManager Em;
    
    public DAOUsuario(EntityManager Entity){
        this.Em = Entity;
    }
    
    public void crearUsuario(Usuario us){
        Em.getTransaction().begin();
        Em.persist(us);
        Em.getTransaction().commit();
    }
    
}
