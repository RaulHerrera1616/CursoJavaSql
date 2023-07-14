/*
clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca. 
La clase Libro debe guardar el título del libro, autor, número de ejemplares y número de
ejemplares prestados.
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
package Entidades;


public class Libro {
    private String tituloLibro;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjprestados;

    public Libro() {
    }

    public Libro(String tituloLibro, String autor, int numeroEjemplares, int numeroEjprestados) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjprestados = 0;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjprestados() {
        return numeroEjprestados;
    }

    public void setNumeroEjprestados(int numeroEjprestados) {
        this.numeroEjprestados = numeroEjprestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "tituloLibro=" + tituloLibro + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares + ", numeroEjprestados=" + numeroEjprestados + '}';
    }
    
    
    
}
