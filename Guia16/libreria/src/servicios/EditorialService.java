package servicios;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.EditorialDAO;

/**
 *
 * @author Raul Herrera
 */
public class EditorialService {

    private EditorialDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EditorialService() {
        this.dao = new EditorialDAO();
    }

    public Editorial crearEditorial() {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            Editorial editorial = new Editorial();
            System.out.println("Ingrese el nombre de la Editorial");
            String nombre = leer.next();
            // Validar campo obligatorio - nombre
            if (nombre.isEmpty()) {
                throw new IllegalArgumentException("El nombre de la editorial es obligatorio");
            }
            // Verificar duplicados - Nombre de la Editorial
        if (dao.existeEditorialPorNombre(nombre)) {
            throw new IllegalArgumentException("Ya existe una Editorial con el mismo nombre");
        }
            editorial.setNombre(nombre);
            Boolean alta = true;
            editorial.setAlta(alta);
            dao.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Editorial buscarEditorialPorNombre() throws Exception {
        try {
            System.out.println("Ingrese nombre de la Editorial");
            String nombre = leer.next();
            Editorial editorial = dao.buscarPorNombre(nombre);
            System.out.println(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
