package persistencia;

import entidades.Cliente;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Raul Herrera
 */
public class ClienteDAO extends DAO<Cliente> {

    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente);
    }

    public void eliminar(Long id) throws Exception {
        Cliente cliente = buscarPorId(id);
        super.eliminar(cliente);
    }

    public Cliente buscarPorId(Long id) throws Exception {
        conectar();
        Cliente cliente = em.find(Cliente.class, id);
        desconectar();
        return cliente;
    }

    public Cliente buscarPorNombre(String nombre) throws Exception {
        conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        desconectar();
        return cliente;
    }

    public List<Cliente> listarTodos() throws Exception {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();
        desconectar();
        return clientes;
    }

    public boolean existeClientePorDocumento(Long documento) {
        conectar();

        // Ejecuta una consulta para verificar si existe un autor con el mismo nombre
        Query query = em.createQuery("SELECT COUNT(c) FROM Cliente c WHERE c.documento = :documento");
        query.setParameter("documento", documento);

        // Ejecuta la consulta y obtiene el resultado como un único valor. En este caso,
        //se espera obtener un recuento (número) de autores.
        long count = (long) query.getSingleResult();

        desconectar();

        // Si el contador es mayor a cero, significa que ya existe un autor con el mismo nombre
        return count > 0;
    }
}
