/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Editorial;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author sistemas
 */
public class EditorialDAO extends DAO<Editorial> {
        @Override
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
    
    public void eliminar(Long id) throws Exception{
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    public Editorial buscarPorId(Long id)throws Exception{
        conectar();
       Editorial editorial = em.find(Editorial.class, id);
       desconectar();
       return editorial;
    }
    public Editorial buscarPorNombre(String nombre) throws Exception{
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", "%"+nombre+"%").getSingleResult();
        desconectar();
        return editorial;
    }
    public List<Editorial> listarTodos()throws Exception{
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar();
        return editoriales;
    }

   public boolean existeEditorialPorNombre(String nombre) {
    conectar();

    // Ejecuta una consulta para verificar si existe una editorial con el mismo nombre
    Query query = em.createQuery("SELECT COUNT(e) FROM Editorial e WHERE e.nombre = :nombre");
    query.setParameter("nombre", nombre);

    // Ejecuta la consulta y obtiene el resultado como un único valor. En este caso,
    //se espera obtener un recuento (número) de autores.
    long count = (long) query.getSingleResult();

    desconectar();

    // Si el contador es mayor a cero, significa que ya existe una editorial con el mismo nombre
    return count > 0;
}
}
