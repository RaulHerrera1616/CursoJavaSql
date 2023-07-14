/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Prestamo;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Raul Herrera
 */
public class PrestamoDAO extends DAO<Prestamo> {

    @Override
    public void guardar(Prestamo cliente) {
        super.guardar(cliente);
    }

    public void eliminar(Integer id) throws Exception {
        Prestamo prestamo = buscarPorId(id);
        super.eliminar(prestamo);
    }

    public Prestamo buscarPorId(Integer id) throws Exception {
        conectar();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectar();
        return prestamo;
    }

    public List<Prestamo> listarTodos() throws Exception {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p").getResultList();
        desconectar();
        return prestamos;
    }
    public List<Prestamo> listarPrestamosPorClientes(Integer id){
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.id = :clienteId")
                .setParameter("clienteId", id).getResultList();
        desconectar();
        return prestamos;
    }
}
