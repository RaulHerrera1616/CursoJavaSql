/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author sistemas
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Integer isbn) throws Exception {
        Libro libro = buscarPorId(isbn);
        super.eliminar(libro);
    }

//    public Libro editarEjemplares(String nombre, int valor) throws Exception{
//        conectar();
//        Libro libro = buscarPorNombre(nombre);
//        em.createQuery("UPDATE Libro SET ejemplares_prestados = :valor WHERE titulo=:nombre")
//                .setParameter("valor", valor)
//                .setParameter("nombre", nombre)
//                .executeUpdate();
//        libro.setEjemplares_prestados(valor);
//        super.editar(libro);
//        
//       return libro;
//
//    }

    public Libro buscarPorId(Integer isbn) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }

    public Libro buscarPorNombre(String nombre) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre"
                + "")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarLibroPorAutor(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre"
                + "")
                .setParameter("nombre", "%" + nombre + "%").getResultList();
        desconectar();
        return libros;
    }

    public List<Editorial> buscarLibroPorEditorial(String nombre) {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre"
                + "")
                .setParameter("nombre", "%" + nombre + "%").getResultList();
        desconectar();
        return editoriales;
    }

    public boolean existeLibroPorEditorial(String titulo, Editorial editorial) {
        conectar();

        // Ejecuta una consulta para verificar si existe un libro con el mismo título y editorial
        Query query = em.createQuery("SELECT COUNT(l) FROM Libro l WHERE l.titulo = :titulo AND l.editorial = :editorial");
        query.setParameter("titulo", titulo);
        query.setParameter("editorial", editorial);

        long count = (long) query.getSingleResult();

        desconectar();

        // Si el contador es mayor a cero, significa que existe al menos un libro con el mismo título y editorial
        return count > 0;
    }

    public boolean existeLibroPorAutor(String titulo, Autor autor) {
        conectar();

        // Ejecuta una consulta para verificar si existe un libro con el mismo título y autor
        Query query = em.createQuery("SELECT COUNT(l) FROM Libro l WHERE l.titulo = :titulo AND l.autor = :autor");
        query.setParameter("titulo", titulo);
        query.setParameter("autor", autor);

        // Ejecuta la consulta y obtiene el resultado como un único valor. En este caso,
        //se espera obtener un recuento (número) de autores.
        long count = (long) query.getSingleResult();

        desconectar();

        // Si el contador es mayor a cero, significa que existe al menos un libro con el mismo título y autor
        return count > 0;
    }

}
