/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Autor;
import java.util.Scanner;
import persistencia.AutorDAO;

/**
 *
 * @author sistemas
 */
public class AutorService {

    private AutorDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AutorService() {
        this.dao = new AutorDAO();
    }

    public Autor crearAutor() {
        try {
            Autor autor = new Autor();
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.next();
            // Validar campo obligatorio - nombre
            if (nombre.isEmpty()) {
                throw new IllegalArgumentException("El nombre del autor es obligatorio");
            }
            // Verificar duplicados - Nombre del Autor
            if (dao.existeAutorPorNombre(nombre)) {
            throw new IllegalArgumentException("Ya existe un Autor con el mismo nombre");
        }
            autor.setNombre(nombre);
            boolean alta = true;
            autor.setAlta(alta);
            dao.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Autor buscarAutorPorNombre() throws Exception {
        try {
            System.out.println("Ingrese nombre del Autor");
            String nombre = leer.next();
            Autor autor = dao.buscarPorNombre(nombre);
            System.out.println(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
/*    public Autor crearAutor() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Autor autor = new Autor();
        System.out.println("Ingrese un nombre ");
        String nombre = scan.next();
        Boolean alta = true;
        autor.setNombre(nombre);
        autor.setAlta(alta);
        dao.guardar(autor);
        
        return autor;
    }*/
