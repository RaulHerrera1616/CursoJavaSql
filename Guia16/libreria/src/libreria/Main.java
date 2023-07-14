package libreria;

import entidades.Editorial;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.EntityManager;
import servicios.AutorService;
import servicios.ClienteService;
import servicios.EditorialService;
import servicios.LibroService;
import servicios.PrestamoService;

public class Main {

    public static void main(String[] args) throws Exception {

        AutorService Aser = new AutorService();
        EditorialService Eser = new EditorialService();
        LibroService Lser = new LibroService();
        ClienteService Cser = new ClienteService();
        PrestamoService Pser = new PrestamoService();
        Scanner leer = new Scanner(System.in);
        try {
            int opc;
            do {

                System.out.println("MENU");
                System.out.println("1. Crear Autor");
                System.out.println("2. Crear Editorial");
                System.out.println("3. Crear Libro");
                System.out.println("4. Crear Clientes");
                System.out.println("5. Registrar prestamo");
                System.out.println("6. Búsqueda de un Autor por nombre");
                System.out.println("7. Búsqueda de un libro por ISBN");
                System.out.println("8. Búsqueda de un libro por Título");
                System.out.println("9. Búsqueda de un libro/s por nombre de Autor");
                System.out.println("10. Búsqueda de un libro/s por nombre de Editorial");
                System.out.println("11. Búsqueda de Editorial Por nombre");
                System.out.println("12. Devolución de un libro");
                System.out.println("13. Búsqueda de todos los préstamos de un Cliente.");
                System.out.println("14. Salir");
                System.out.println("Ingrese el número de la opción deseada:");

                System.out.println("Ingrese la opcion deseada");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        Aser.crearAutor();
                        break;
                    case 2:
                        Eser.crearEditorial();
                        break;
                    case 3:
                        Lser.crearLibro();
                        break;
                    case 4:
                        Cser.crearCliente();
                        break;
                    case 5:
                        Pser.registrarPrestamo();
                        break;
                    case 6:
                        Aser.buscarAutorPorNombre();
                        break;
                    case 7:
                        Lser.buscarLibroPorISBN();
                        break;
                    case 8:
                        Lser.buscarLibroPorNombre();
                        break;
                    case 9:
                        Lser.buscarLibroPorAutor();
                        break;
                    case 10:
                        Lser.buscarLibroPorEditorial();
                        break;
                    case 11:
                        Eser.buscarEditorialPorNombre();
                        break;
                    case 12:
                        Pser.devolverLibro();
                        break;
                    case 13:
                        Pser.listarPrestamosPorCliente();
                        break;
                    case 14:
                        System.out.println("Fin del programa");
                        break;

                }
            } while (opc!=14);
        } catch (Exception e) {
            System.out.println(e);
        }

//        //8) Búsqueda de un Autor por nombre.
//        Aser.buscarAutorPorNombre();
//        //9) Búsqueda de un libro por ISBN.
//        Lser.buscarLibroPorISBN();
        //10) Búsqueda de un libro por Título.
//        Lser.buscarLibroPorNombre();
        //11) Búsqueda de un libro/s por nombre de Autor.
//        Lser.buscarLibroPorAutor();
//        12) Búsqueda de un libro/s por nombre de Editorial.
//        Lser.buscarLibroPorEditorial();
//
//        System.out.println("-----------------------------------------------------------------");
//        Aser.crearAutor();
//        System.out.println("-----------------------------------------------------------------");
//        Eser.crearEditorial();
//        System.out.println("-----------------------------------------------------------------");
//        Lser.crearLibro();
//
//        Eser.buscarEditorialPorNombre();
//        Cser.crearCliente();
//        Pser.registrarPrestamo();
//      Pser.devolverLibros();

    }

}
