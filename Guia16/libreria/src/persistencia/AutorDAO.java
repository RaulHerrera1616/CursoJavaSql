/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Autor;
import java.util.List;
import javax.persistence.Query;

public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(Long id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public Autor buscarPorId(Long id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        desconectar();
        return autor;
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }

    public boolean existeAutorPorNombre(String nombre) {
        conectar();

        // Ejecuta una consulta para verificar si existe un autor con el mismo nombre
        Query query = em.createQuery("SELECT COUNT(a) FROM Autor a WHERE a.nombre = :nombre");
        query.setParameter("nombre", nombre);

        // Ejecuta la consulta y obtiene el resultado como un único valor. En este caso,
        //se espera obtener un recuento (número) de autores.
        long count = (long) query.getSingleResult();

        desconectar();

        // Si el contador es mayor a cero, significa que ya existe un autor con el mismo nombre
        return count > 0;
    }
}
/*    public Autor buscarPorNombre(String nombre) {
        super.conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        super.desconectar();
        return autor;
    }*/
