/*
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package Servicio;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    HashSet<Libro> libros = new HashSet<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarLibros() {
        String opc = "s";
        int numeroEjprestados = 0;
        do {

            System.out.println("Titulo del libro");
            String tituloLibro = leer.next();
            System.out.println("Autor del libro");
            String autor = leer.next();           
            System.out.println("Ingrese la cantidad de libros");
            int numeroEjemplares = leer.nextInt();
            libros.add(new Libro(tituloLibro, autor, numeroEjemplares, numeroEjprestados));
            System.out.println("Desea agregar mas libros");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
    }

    public boolean prestados() {
        String libPres;
        System.out.println("Ingrese el titulo del libro a prestar");
        libPres = leer.next();
        for (Libro libro : libros) {
            if (libro.getTituloLibro().equalsIgnoreCase(libPres)) {
                if (libro.getNumeroEjemplares() > libro.getNumeroEjprestados()) {
                    libro.setNumeroEjprestados(libro.getNumeroEjprestados() + 1);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean devolucion() {
        String libDevolver;
        System.out.println("Ingrese el titulo del libro a devolver");
        libDevolver = leer.next();
        for (Libro libro : libros) {
            if (libro.getTituloLibro().equalsIgnoreCase(libDevolver)) {
                if (libro.getNumeroEjemplares() > 0) {
                    libro.setNumeroEjprestados(libro.getNumeroEjprestados() - 1);
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println("Titulo: "+libro.getTituloLibro() + "\nAutor: " + libro.getAutor() + 
                    "\nEjemplares: "+ libro.getNumeroEjemplares() + "\nPrestados: " + libro.getNumeroEjprestados());
        }
    }
}
