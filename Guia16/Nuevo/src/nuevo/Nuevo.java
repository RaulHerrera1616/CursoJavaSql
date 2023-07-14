
package nuevo;

import entidades.DAOUsuario;
import entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Nuevo {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("PruebaDataBase");
        EntityManager e = emf.createEntityManager();
        Usuario u = new Usuario();
        u.setNombre("Juan");
        u.setApellido("Perez");
        DAOUsuario dao = new DAOUsuario(e);
        dao.crearUsuario(u);
    }
    
}
