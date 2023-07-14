
package servicios;

import entidades.Cliente;
import java.util.Scanner;
import persistencia.ClienteDAO;


public class ClienteService {
    
    private ClienteDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ClienteService() {
        this.dao = new ClienteDAO();
    }
    
    public Cliente crearCliente(){
        
        Cliente cliente = new Cliente();
        try {
            System.out.println("Nombre");
            cliente.setNombre(leer.next());
            if (cliente.getNombre().isEmpty()) {
                throw new IllegalArgumentException("El nombre es obligatorio");
            }

            System.out.println("Apellido");
            cliente.setApellido(leer.next());
            if (cliente.getApellido().isEmpty()) {
                throw new IllegalArgumentException("El apellido es obligatorio");
            }
            System.out.println("Dcumento");
            long documento = leer.nextLong();
            if (documento<=0) {
                throw new IllegalArgumentException("El documentodebe ser mayor de 0");
            }
            if (dao.existeClientePorDocumento(documento)) {
                throw new IllegalArgumentException("Ya existe un cliente con el mismo documento");
            }
            cliente.setDocumento(documento);
            System.out.println("Telefono");
            cliente.setTelefono(leer.next());
            dao.guardar(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    public Cliente buscarClientePorNombre() throws Exception {
        try {
            System.out.println("Ingrese nombre del Cliente");
            String nombre = leer.next();
            Cliente cliente = dao.buscarPorNombre(nombre);
            System.out.println(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
/*Libro libro = new Libro();
        try {

            System.out.println("Titulo");
            libro.setTitulo(leer.next());
            if (libro.getTitulo().isEmpty()) {
                throw new IllegalArgumentException("El título es obligatorio");
            }
            libro.setAlta(true);
            System.out.println("Año del libro");
            libro.setAnio(leer.nextInt());
            if (libro.getAnio() <= 0) {
                throw new IllegalArgumentException("El año del libro debe ser mayor a cero");
            }
            System.out.println("Numero de ejemplares");
            libro.setEjemplares(leer.nextInt());
            System.out.println("Ejemplares prestados");
            libro.setEjemplares_prestados(leer.nextInt());
            System.out.println("Ejemplares restantes");
            libro.setEjemplares_restantes(leer.nextInt());
            Editorial editorial = eser.buscarEditorialPorNombre();
            if (dao.existeLibroPorEditorial(libro.getTitulo(), editorial)) {
                throw new IllegalArgumentException("Ya existe un libro con el mismo título y editorial");
            }
            libro.setEditorial(editorial);

            System.out.println("Nombre del autor");
            Autor autor = aser.buscarAutorPorNombre();
            if (dao.existeLibroPorAutor(libro.getTitulo(), autor)) {
                throw new IllegalArgumentException("Ya existe un libro con el mismo título y autor");
            }
            libro.setAutor(autor);

            dao.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;

        }*/