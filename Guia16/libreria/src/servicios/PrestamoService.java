package servicios;

import entidades.Cliente;
import entidades.Editorial;
import entidades.Libro;
import entidades.Prestamo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import persistencia.PrestamoDAO;

public class PrestamoService {

    private PrestamoDAO dao;
    private ClienteService cser;
    private LibroService lser;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PrestamoService() {
        this.dao = new PrestamoDAO();
        this.cser = new ClienteService();
        this.lser = new LibroService();
    }

    public Prestamo registrarPrestamo() {
        Prestamo prestamo = new Prestamo();
        try {

            int cant = 1;
            System.out.println("Fecha de prestamo");
            System.out.println("Día");
            int dia = leer.nextInt();
            System.out.println("Mes");
            int mes = leer.nextInt();
            System.out.println("Año");
            int anio = leer.nextInt();
            boolean fechaValida = validarFecha(dia, mes, anio);
            if (!fechaValida) {
                System.out.println("La fecha ingresada no es válida");
            }
            // Crear una instancia de Calendar y establecer la fecha
            Calendar calendar = Calendar.getInstance();
            calendar.set(anio, mes - 1, dia); // El mes en Calendar es 0-based, por eso se resta 1
            // Obtener la fecha como objeto Date
            Date fechaPrestamo = calendar.getTime();

            prestamo.setFecha_prestamo(fechaPrestamo);

            System.out.println("Fecha de devolucion");
            System.out.println("Día");
            int diaD = leer.nextInt();
            System.out.println("Mes");
            int mesD = leer.nextInt();
            System.out.println("Año");
            int anioD = leer.nextInt();
            boolean fechaValidaDev = validarFecha(diaD, mesD, anioD);
            if (!fechaValida) {
                System.out.println("La fecha ingresada no es válida");
            }
            Calendar calendarD = Calendar.getInstance();
            calendar.set(anio, mes - 1, dia);
            Date fechaDevolucion = calendar.getTime();
            if (fechaDevolucion.before(fechaPrestamo)) {
                System.out.println("La fecha de devolución debe ser posterior a la fecha de préstamo");
            }
            prestamo.setFecha_devolucion(fechaDevolucion);

            System.out.println("Cliente");
            Cliente cliente = cser.buscarClientePorNombre();
            if (cliente == null) {
                System.out.println("No existe el cliente en la base de datos; Crear Nuevo Cliente");
                cser.crearCliente();
            }
            prestamo.setCliente(cliente);

            System.out.println("Libro");
            Libro libro = lser.buscarLibroPorNombre();
            if (libro == null) {
                System.out.println("No existe el libro");
            }
            if (libro.getEjemplares_restantes() <= 0) {
                System.out.println("No quedan libros de " + libro.getTitulo() + " para prestar");
            }

            prestamo.setLibro(libro);
            String nombre = libro.getTitulo();
            lser.editarLibro(nombre, cant, (libro.getEjemplares() - libro.getEjemplares_prestados()));

            dao.guardar(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean validarFecha(int dia, int mes, int anio) {
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void devolverLibro() {
        try {
            System.out.println("Ingrese el ID del préstamo");
            int id = leer.nextInt();
            Prestamo prestamo = buscarPrestamoPorId(id);
            System.out.println(prestamo);
            if (prestamo == null) {
                System.out.println("No se encontró un préstamo con el ID proporcionado");
                return;
            }
            editarPrestamo(id);
            String nombre = prestamo.getLibro().getTitulo();
            lser.editarLibroDevolver(nombre);
            dao.guardar(prestamo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Prestamo buscarPrestamoPorId(Integer id) {
        try {
            Prestamo prestamo = dao.buscarPorId(id);
            if (prestamo == null) {
                System.out.println("No se encontró un préstamo con el ID proporcionado");
            } else {
                System.out.println(prestamo);
            }
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public List<Prestamo> listarPrestamosPorCliente() {
        try {
            System.out.println("Ingrese id del cliente");
            int id = leer.nextInt();
            List<Prestamo> prestamos = dao.listarPrestamosPorClientes(id);
            
            System.out.println(prestamos.toString());
            return prestamos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public Prestamo editarPrestamo(Integer id) {
        try {
            Prestamo prestamo = buscarPrestamoPorId(id);
            if (prestamo == null) {
                System.out.println("No existe el prestamo");
                return null;
            }

            prestamo.setAlta(false);
            prestamo.setFecha_devolucion(null);
            prestamo.setFecha_prestamo(null);

            // Llamada al método de la clase padre para realizar la actualización
            dao.editar(prestamo);
            

            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public boolean eliminarPrestamo(Integer id){
        try {
            dao.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
    }
}
/*System.out.println("Nombre del autor");
            Autor autor = aser.buscarAutorPorNombre();
            if (dao.existeLibroPorAutor(libro.getTitulo(), autor)) {
                throw new IllegalArgumentException("Ya existe un libro con el mismo título y autor");
            }
            libro.setAutor(autor);*/
