/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencia.LibroDAO;

/**
 *
 * @author sistemas
 */
public class LibroService {

    private LibroDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private AutorService aser;
    private EditorialService eser;

    public LibroService() {
        this.dao = new LibroDAO();
        this.aser = new AutorService();
        this.eser = new EditorialService();
    }

    public Libro crearLibro() throws Exception {
        Libro libro = new Libro();
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
            libro.setEjemplares_restantes(libro.getEjemplares() - libro.getEjemplares_prestados());

            Editorial editorial = eser.buscarEditorialPorNombre();
            if (editorial == null) {
                System.out.println("La editorial que ud ingreso no existe en la base de datos, Crear Nueva Editorial");
                eser.crearEditorial();
            }
            if (dao.existeLibroPorEditorial(libro.getTitulo(), editorial)) {
                throw new IllegalArgumentException("Ya existe un libro con el mismo título y editorial");
            }
            libro.setEditorial(editorial);

            System.out.println("Nombre del autor");
            Autor autor = aser.buscarAutorPorNombre();
            if (autor == null) {
                System.out.println("El autor que usted ingreso no exixte en la base de datos, Crear Nuevo Autor");
                aser.crearAutor();
            }
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

        }
    }

    public Libro buscarLibroPorISBN() {
        try {
            System.out.println("Ingrese el ISBN del libro");
            int isbn = leer.nextInt();
            Libro libro = dao.buscarPorId(isbn);
            System.out.println(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Libro buscarLibroPorNombre() {
        try {
            System.out.println("Ingrese el Titulo del libro");
            String titulo = leer.next();
            Libro libro = dao.buscarPorNombre(titulo);
            System.out.println(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Libro> buscarLibroPorAutor() {
        try {
            System.out.println("Ingrese el Autor del libro");
            String autor = leer.next();
            List<Libro> libros = dao.buscarLibroPorAutor(autor);
            System.out.println(libros);
            return libros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Editorial> buscarLibroPorEditorial() {
        try {
            System.out.println("Ingrese la editorial del libro");
            String autor = leer.next();
            List<Editorial> editoriales = dao.buscarLibroPorEditorial(autor);
            System.out.println(editoriales);
            return editoriales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
//    public Libro editarLibro(String nombre,int valor){
//        try {
//            Libro libro = dao.editarEjemplares(nombre, valor);
//            return libro;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return null;
//        }

    public Libro editarLibro(String nombre, int nuevosEjemplaresPrestados, int nuevosEjemplaresRestantes) {
        try {
            Libro libro = buscarLibroPorNombre();
            if (libro == null) {
                System.out.println("No existe el libro");
                return null;
            }

            libro.setEjemplares_prestados(libro.getEjemplares_prestados() + nuevosEjemplaresPrestados);
            libro.setEjemplares_restantes(nuevosEjemplaresRestantes);

            // Llamada al método de la clase padre para realizar la actualización
            dao.editar(libro);

            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro editarLibroDevolver(String nombre) {
        try {
            Libro libro = buscarLibroPorNombre();
            if (libro == null) {
                System.out.println("No existe el libro");
                return null;
            }

            libro.setEjemplares_prestados(libro.getEjemplares_prestados() - 1);
            libro.setEjemplares_restantes(libro.getEjemplares_restantes() + 1);

            // Llamada al método de la clase padre para realizar la actualización
            dao.editar(libro);

            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarLibro(Integer isbn) {
        try {
            dao.eliminar(isbn);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
